/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
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
            System.out.println("username existed");
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
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}
