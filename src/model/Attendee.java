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
    private String eventId;       
    private String status;       
    public Attendee() {
    }

    public Attendee(int attendeeId, int userId, String eventId, String status) {
        this.attendeeId = attendeeId;
        this.userId = userId;
        this.eventId = eventId;
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
