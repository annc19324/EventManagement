/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author pc
 */
public class Order {

    private int orderId;
    private int userId;
    private String eventId;
    private String username;
    private String fullName;
    private String eventName;
    private double totalPrice;
    private Date orderDate;
    private String paymentStatus;

    public Order() {
    }

    public Order(int orderId, int userId, String fullName, String eventId, String eventName, double totalPrice, Date orderDate, String paymentStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.eventId = eventId;
        this.fullName = fullName;
        this.eventName = eventName;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.paymentStatus = paymentStatus;
    }

    public Order(int orderId, int userId, String username, String fullName, String eventId, String eventName, double totalPrice, Date orderDate, String paymentStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.username = username;
        this.eventId = eventId;
        this.fullName = fullName;
        this.eventName = eventName;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.paymentStatus = paymentStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
