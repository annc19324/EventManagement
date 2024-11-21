/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Attendee;

/**
 *
 * @author pc
 */
public class AttendeeController {

    private Connect dbConnect;

    public AttendeeController() {
        dbConnect = new Connect();
    }

    public boolean addAttendee(int userId, String eventId) {
        String query = """
    INSERT INTO Attendees (UserId, EventId, FullName, EventName, [Status])
    SELECT u.UserId, e.EventId, u.FullName, e.EventName, 'Đã Đăng Ký'
    FROM Users u
    JOIN Events e ON e.EventId = ?
    WHERE u.UserId = ?;
    """;

        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, eventId); // Gán EventId
            stmt.setInt(2, userId);    // Gán UserId

            return stmt.executeUpdate() > 0; // Trả về true nếu thêm thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Trả về false nếu có lỗi
    }

    public boolean addAttendee(Attendee attendee) {
        String query = " INSERT INTO Attendees (UserId, FullName, EventId, EventName, [Status])VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, attendee.getUserId()); // Gán UserId
            stmt.setString(2, attendee.getFullName()); // Gán FullName
            stmt.setString(3, attendee.getEventId()); // Gán EventId
            stmt.setString(4, attendee.getEventName()); // Gán EventName
            stmt.setString(5, attendee.getStatus()); // Gán Status

            return stmt.executeUpdate() > 0; // Trả về true nếu thêm thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Trả về false nếu có lỗi
    }

    public boolean updateAttendee(Attendee attendee) {
        String query = "UPDATE Attendees SET UserId = ?, FullName = ?, EventId = ?, EventName = ?, [Status] = ? WHERE AttendeeId = ?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, attendee.getUserId());
            stmt.setString(2, attendee.getFullName());
            stmt.setString(3, attendee.getEventId());
            stmt.setString(4, attendee.getEventName());
            stmt.setString(5, attendee.getStatus());
            stmt.setInt(6, attendee.getAttendeeId());

            return stmt.executeUpdate() > 0; // Trả về true nếu cập nhật thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu có lỗi
    }

    public boolean deleteAttendee(Attendee attendee) {
        String sql = "Delete from Attendees where AttendeeId=?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, attendee.getAttendeeId());
            return stmt.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Attendee> getAttendee() {
        List<Attendee> attendee = new ArrayList<>();
        String query = "SELECT * FROM [Attendees]";
        try (Connection connection = dbConnect.connectSQL(); Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                attendee.add(new Attendee(
                        rs.getInt("AttendeeId"),
                        rs.getInt("UserId"),
                        rs.getString("FullName"),
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getString("Status")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendee;
    }
}
