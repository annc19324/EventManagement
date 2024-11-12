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

    private int orderId;         // [OrderId]
    private int attendeeId;      // [AttendeeId]
    private int eventId;         // [EventId]
    private double totalPrice;   // [TotalProce]
    private Date orderDate;      // [OrderDate]
    private String paymentStatus;

    public Order() {
    }

    public Order(int orderId, int attendeeId, int eventId, double totalPrice, Date orderDate, String paymentStatus) {
        this.orderId = orderId;
        this.attendeeId = attendeeId;
        this.eventId = eventId;
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

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
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
