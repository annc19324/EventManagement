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

    public Order() {
    }

    public Order(int orderId, int userId, String eventId, double totalPrice, Date orderDate, String paymentStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.eventId = eventId;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.paymentStatus = paymentStatus;
    }

    private int orderId;
    private int userId;
    private String eventId;
    private double totalPrice;

    public Order(int userId, String eventId, double totalPrice, Date orderDate, String paymentStatus) {
        this.userId = userId;
        this.eventId = eventId;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.paymentStatus = paymentStatus;
    }
    private Date orderDate;
    private String paymentStatus;

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

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
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
