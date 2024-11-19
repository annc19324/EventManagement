/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author annc1
 */
public class User {
    private int userId;
    private String username;
    private String fullname;
    private String password;
    private Date dateOfBirth;
    private String mail;
    private String phone;
    private String role;

    public User() {
    }

    public User(String fullname, Date dateOfBirth, String mail, String phone) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.phone = phone;
    }

    public User(int userId, String username, String fullname, String password, Date dateOfBirth, String mail, String phone, String role) {
        this.userId = userId;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.phone = phone;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean validateUsername() {
        return username.matches("^[a-zA-Z0-9.]+$") ;
    }
    
    public boolean validateUsernameLength() {
        return username.length() >= 6;
    }

    public boolean validateFullname() {
      return fullname.matches("^[\\p{L}\\p{M} .'-]+$");
    }
    public boolean validateFullnameLength() {
        return fullname.length() >= 2;
    }
    
    public boolean validatePassword() {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$");
    }
    public boolean validatePasswordLength() {
        return password.length() >=8;
    }

    public boolean validateDateOfBirth() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -16);
        Date sixteenYearsAgo = cal.getTime();
        return dateOfBirth.before(sixteenYearsAgo);
    }

    public boolean validateMail() {
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return mail.matches(emailPattern);
    }

    public boolean validatePhone() {
        return phone.matches("\\d{10}");
    }
}
