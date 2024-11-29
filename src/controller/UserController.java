/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author annc1
 */
public class UserController {

    private final Connection conn;

    public UserController() throws SQLException {
        this.conn = new Connect().connectSQL();
    }

    public String hashPassword(String password) {
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-512");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("thuật toán SHA-512 không tìm thấy", e);
        }
    }

    public boolean isUsernameTaken(String username) {
        String sql = "select count(*) from users where username = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addUserAccount(User user) {
        if (isUsernameTaken(user.getUsername())) {
            return false;
        }
        String sql = "insert into users(username,fullname,password,role) values(?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getFullname());
            stmt.setString(3, hashPassword(user.getPassword()));
            stmt.setString(4, user.getRole());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUserAccount(User user) {
        String sql = "UPDATE Users SET role = ? WHERE userid = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(2, user.getUserId());
            stmt.setString(1, user.getRole());

            return stmt.executeUpdate() > 0; // Trả về true nếu cập nhật thành công
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Trả về false nếu có lỗi
        }
    }

    public boolean addUser(User user) {
        if (isUsernameTaken(user.getUsername())) {
            return false;
        }
        String sql = "insert into users(username, fullname, password, DateOfBirth, Mail, Phone, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getFullname());
            ps.setString(3, hashPassword(user.getPassword()));
            ps.setDate(4, new java.sql.Date(user.getDateOfBirth().getTime()));
            ps.setString(5, user.getMail());
            ps.setString(6, user.getPhone());
            ps.setString(7, user.getRole());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User login(String username, String password) {
        String sql = "select * from users where username = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String storedHashedPassword = rs.getString("password");
                String inputHashedPassword = hashPassword(password);
                if (storedHashedPassword.equals(inputHashedPassword)) {
                    User user = new User(
                            rs.getInt("UserId"),
                            rs.getString("Username"),
                            rs.getString("FullName"),
                            rs.getString("Password"),
                            rs.getDate("DateOfBirth"),
                            rs.getString("Mail"),
                            rs.getString("Phone"),
                            rs.getString("Role")
                    );
                    return user;
                } else {
                    JOptionPane.showMessageDialog(null, "sai mật khẩu", "lỗi", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "tên người dùng '" + username + "' chưa được đăng ký", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

    public boolean updateUserInf(String username, String fullName, Date dateOfBirth, String mail, String phone) throws SQLException {
        String query = "update Users set FullName = ?, DateOfBirth = ?, Mail = ?, Phone = ? where Username = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, fullName);
            ps.setDate(2, new java.sql.Date(dateOfBirth.getTime()));
            ps.setString(3, mail);
            ps.setString(4, phone);
            ps.setString(5, username);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean checkInformationForForgetPassword(String username, String password, String mail) throws SQLException {
        String query = "update Users set Password = ? where Username = ? and Mail = ?";
        String hashedPassword = hashPassword(password);
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, hashedPassword);
            ps.setString(2, username);
            ps.setString(3, mail);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean changePassword(String username, String password, String newPassword) throws SQLException {
        String query = "update Users set Password = ? where Username = ? and Password = ?";
        String hashedPassword = hashPassword(password);
        String newHashedPassword = hashPassword(newPassword);
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newHashedPassword);
            ps.setString(2, username);
            ps.setString(3, hashedPassword);
            return ps.executeUpdate() > 0;
        }
    }

    public List<User> getAllUser() {
        List<User> user = new ArrayList<>();
        String sql = "select *from Users";
        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                user.add(new User(
                        rs.getInt("UserId"),
                        rs.getString("UserName"),
                        rs.getString("FullName"),
                        rs.getString("Password"),
                        rs.getDate("DateOfBirth"),
                        rs.getString("Mail"),
                        rs.getString("Phone"),
                        rs.getString("Role")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public boolean deleteUser(int userId) {

        String deleteAttendeesQuery = "DELETE FROM Attendees WHERE UserId = ?";
        String deleteUserQuery = "DELETE FROM Users WHERE UserId = ?";

        try (
                PreparedStatement stmtAttendees = conn.prepareStatement(deleteAttendeesQuery); PreparedStatement stmtUser = conn.prepareStatement(deleteUserQuery)) {

            // Bắt đầu giao dịch
            conn.setAutoCommit(false);

            // Xóa từ bảng Attendees
            stmtAttendees.setInt(1, userId);
            stmtAttendees.executeUpdate();

            // Xóa từ bảng Users
            stmtUser.setInt(1, userId);
            stmtUser.executeUpdate();

            // Xác nhận giao dịch
            conn.commit();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                // Rollback nếu có lỗi
                conn.rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        return false;
    }

}
