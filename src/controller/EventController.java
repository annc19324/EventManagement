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

            stmt.setInt(1, event.getEventId());
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
            stmt.setInt(8, event.getEventId());
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
            stmt.setInt(1, event.getEventId());
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
            stmt.setString(1,  "%"+keyword +"%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Event event=new Event(
                    rs.getInt("EventId"),
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
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Lỗi tìm kiếm sự kiện"+e.getMessage());
        }
        return events;
    }
    public List<Event> getAllEvent() throws SQLException{
        List<Event> list=new ArrayList<>();
        String sql="select*from Events";
        try(Connection conn=dbConnect.connectSQL();PreparedStatement stmt=conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Event event = new Event(rs.getInt("EventId"),
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
}
