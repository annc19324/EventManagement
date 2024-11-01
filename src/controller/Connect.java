/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author annc1
 */
public class Connect {
        public Connection conn = null;
    public Connection connectSQL() throws SQLException {
        try {
            String userName = "sa";
<<<<<<< Updated upstream
            String password = "12345";  
=======
            String password = "123";  
>>>>>>> Stashed changes
            String url = "jdbc:sqlserver://localhost:1433; database=EventManagement; encrypt = true; TrustServerCertificate = true";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Kết nối thành công tới CSDL 'EventManagement'");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Kết nối CSDL thất bại: " + e.getMessage(), "Thông báo", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được CSDL: " + ex.getMessage(), "Thông báo", 1);
        }
        return null;
    }
}
