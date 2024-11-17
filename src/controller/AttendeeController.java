/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

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

    public int getLastInsertedAttendeeId() {
        String query = "SELECT IDENT_CURRENT('Attendees') AS LastId";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("LastId");
            }

        } catch (SQLException e) {
        }
        return -1;
    }

}
