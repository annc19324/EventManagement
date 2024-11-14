/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
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
    
    public boolean updateUserInf(String username, String fullName, Date dateOfBirth, String mail, String phone) throws SQLException{
        String query = "update Users set FullName = ?, DateOfBirth = ?, Phone = ?, Mail = ? where Username = ?";
        try(PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1, fullName);
            ps.setDate(2, new java.sql.Date(dateOfBirth.getTime()));
            ps.setString(3, mail);
            ps.setString(4, phone);
            ps.setString(5, username);
            return ps.executeUpdate() > 0;
        }
    }
}
