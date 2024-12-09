/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author annc1
 */
public class EventController {

    public Connect dbConnect;

    public EventController() {
        dbConnect = new Connect();
    }

    public void addEvent(Event event) throws SQLException {
        String sql = "insert into Events(EventId, EventName, StartDate, EndDate, Location, Description, Status, price) values(?,?,?,?,?,?,?,?)";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, event.getEventId());
            stmt.setString(2, event.getEventName());
            stmt.setString(3, event.getStartDate());
            stmt.setString(4, event.getEndDate());
            stmt.setString(5, event.getLocation());
            stmt.setString(6, event.getDescription());
            stmt.setString(7, event.getStatus());
            stmt.setDouble(8, event.getPrice());
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Thêm sự kiện thành công!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm sự kiện " + e.getMessage());
        }
    }

    public void updateEvent(Event event) throws SQLException {
        String sql = "update Events SET EventName=?,StartDate=?,EndDate=?,Location=?,Description=?,Status=?,price=? where EventId=?  ";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareCall(sql)) {
            stmt.setString(1, event.getEventName());
            stmt.setString(2, event.getStartDate());
            stmt.setString(3, event.getEndDate());
            stmt.setString(4, event.getLocation());
            stmt.setString(5, event.getDescription());
            stmt.setString(6, event.getStatus());
            stmt.setDouble(7, event.getPrice());
            stmt.setString(8, event.getEventId());
            int rowsUpdate = stmt.executeUpdate();
            if (rowsUpdate > 0) {
                JOptionPane.showMessageDialog(null, "Thêm sự kiện thành công!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật sự kiện" + e.getMessage());
        }
    }

    public void deleteEvent(Event event) throws SQLException {
        String sql = "delete from Events where eventId=?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, event.getEventId());
            int rowsDelete = stmt.executeUpdate();
            if (rowsDelete > 0) {
                JOptionPane.showMessageDialog(null, "Xóa sự kiện thành công!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa sự kiện" + e.getMessage());
        }
    }

    public List<Event> searchEvents(String keyword) {
        List<Event> events = new ArrayList<>();
        String sql = "select*from Events where EventName LIKE ?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Event event = new Event(
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getString("StartDate"),
                        rs.getString("EndDate"),
                        rs.getString("Location"),
                        rs.getString("Description"),
                        rs.getString("Status"),
                        rs.getDouble("price")
                );
                events.add(event);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi tìm kiếm sự kiện" + e.getMessage());
        }
        return events;
    }

    public List<Event> getAllEvent() throws SQLException {
        List<Event> list = new ArrayList<>();
        String sql = "select*from Events";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Event event = new Event(rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getString("StartDate"),
                        rs.getString("EndDate"),
                        rs.getString("Location"),
                        rs.getString("Description"),
                        rs.getString("Status"),
                        rs.getDouble("price")
                );
                list.add(event);
            }
        }
        return list;

    }

    //luu thong tin dang ky vao bang attendee
    public boolean registerEvent(int userId, String fullName, String eventId, String eventName) {
        if (isEventRegistered(userId, eventId)) {
            return false;
        }

        String sql = "INSERT INTO Attendees (UserId, FullName, EventId, EventName, Status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = dbConnect.connectSQL().prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.setString(2, fullName);
            stmt.setString(3, eventId);
            stmt.setString(4, eventName);
            stmt.setString(5, "Đã đăng ký"); // Hoặc trạng thái khác nếu cần
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //lay danh sach su kien da duoc dang ky
    public List<Event> getRegisteredEventsByUserId(int userId) {
        List<Event> events = new ArrayList<>();
        String sql = "select Events.* from Events join Attendees  ON Events.EventId = Attendees.EventId where Attendees.UserId = ?";
        try (PreparedStatement stmt = dbConnect.connectSQL().prepareStatement(sql)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Event event = new Event(
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getString("StartDate"),
                        rs.getString("EndDate"),
                        rs.getString("Location"),
                        rs.getString("Description"),
                        rs.getString("Status"),
                        rs.getDouble("Price")
                );
                events.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return events;
    }

    public List<Event> getRegisteredEvents(int userId) {
        List<Event> registeredEvents = new ArrayList<>();
        String sql = "SELECT e.EventId, e.EventName, e.StartDate, e.EndDate, e.Location, e.Description, e.Status, e.Price "
                + "FROM Events e JOIN Attendees a ON e.EventId = a.EventId "
                + "WHERE a.UserId = ?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Event event = new Event(
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getString("StartDate"),
                        rs.getString("EndDate"),
                        rs.getString("Location"),
                        rs.getString("Description"),
                        rs.getString("Status"),
                        rs.getDouble("Price")
                );
                registeredEvents.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registeredEvents;
    }

    public boolean isEventRegistered(int userId, String eventId) {
        String sql = "SELECT COUNT(*) FROM Attendees WHERE UserId = ? AND EventId = ?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.setString(2, eventId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Trả về true nếu đã đăng ký
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu chưa đăng ký
    }

    // huy dang ky
    public boolean cancelRegistration(int userId, String eventId) {
        String sql1 = "DELETE FROM Attendees WHERE UserId = ? AND EventId = ?";
        String sql2 = "DELETE FROM Orders WHERE UserId = ? AND EventId = ?";

        try (Connection conn = dbConnect.connectSQL()) {
            // Bắt đầu giao dịch (transaction)
            conn.setAutoCommit(false);  // Tắt chế độ tự động commit

            try (PreparedStatement stmt1 = conn.prepareStatement(sql1); PreparedStatement stmt2 = conn.prepareStatement(sql2)) {

                // Thực hiện câu lệnh xóa từ bảng Attendees
                stmt1.setInt(1, userId);
                stmt1.setString(2, eventId);
                int rowsAffected1 = stmt1.executeUpdate();

                // Thực hiện câu lệnh xóa từ bảng Orders
                stmt2.setInt(1, userId);
                stmt2.setString(2, eventId);
                int rowsAffected2 = stmt2.executeUpdate();

                // Kiểm tra nếu cả hai câu lệnh đều xóa ít nhất một bản ghi
                if (rowsAffected1 > 0 && rowsAffected2 > 0) {
                    conn.commit();  // Nếu thành công, commit giao dịch
                    return true;
                } else {
                    conn.rollback();  // Nếu không có bản ghi nào bị xóa, rollback giao dịch
                    return false;
                }
            } catch (SQLException e) {
                conn.rollback();  // Nếu có lỗi, rollback giao dịch
                e.printStackTrace();
                return false;
            } finally {
                conn.setAutoCommit(true);  // Đảm bảo bật lại chế độ auto commit sau khi hoàn thành
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
