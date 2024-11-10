/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author annc1
 */
public class Event {

    private int eventId;              // ID sự kiện
    private String eventName;         // Tên của sự kiện
    private String startDate;         // Ngày bắt đầu (có thể sử dụng LocalDate nếu cần)
    private String endDate;           // Ngày kết thúc (có thể sử dụng LocalDate nếu cần)
    private String location;          // Địa điểm tổ chức sự kiện
    private String description;       // Mô tả chi tiết về sự kiện
    private String status;            // Trạng thái của sự kiện
    private double price;             // Giá vé của sự kiện

    // Constructor
    public Event() {
    }

    public Event(int eventId) {
        this.eventId = eventId;
    }

    public Event(int eventId, String eventName, String startDate, String endDate, String location, String description, String status, double price) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.description = description;
        this.status = status;
        this.price = price;
    }

    // Getters and Setters
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("soon") || status.equals("active") || status.equals("expired")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status must be 'soon', 'active', or 'expired'.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return String.format("Event[ID=%d, Name='%s', StartDate='%s', EndDate='%s', Location='%s', Description='%s', Status='%s', Price=%.2f]",
                eventId, eventName, startDate, endDate, location, description, status, price);
    }
}
