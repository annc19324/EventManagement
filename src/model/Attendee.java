/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author annc1
 */
public class Attendee {
    private int attendeeId;       
    private int userId;
    private String fullName;
    private String eventId;   
    private String eventName;
    private String status;       

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
    public Attendee() {
    }

    public Attendee(int attendeeId, int userId, String fullName, String eventId, String eventName, String status) {
        this.attendeeId = attendeeId;
        this.userId = userId;
        this.fullName = fullName;
        this.eventId = eventId;
        this.eventName = eventName;
        this.status = status;
    }

    

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "attendeeId=" + attendeeId +
                ", userId=" + userId +
                ", eventId='" + eventId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
