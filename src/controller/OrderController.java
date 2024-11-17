package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderController {

    private Connect dbConnect;

    public OrderController() {
        dbConnect = new Connect();
    }

    public boolean addOrderForAttendee(int userId, String eventId) {
        String query = """
            INSERT INTO Orders (UserId, FullName, EventId, EventName, TotalPrice, OrderDate, PaymentStatus)
            SELECT 
                a.UserId, 
                COALESCE(a.FullName, u.FullName) AS FullName,
                e.EventId, 
                e.EventName, 
                e.Price, 
                GETDATE(), 
                'Chờ'
            FROM Attendees a
            JOIN Events e ON a.EventId = e.EventId
            JOIN Users u ON a.UserId = u.UserId
            WHERE a.UserId = ? AND a.EventId = ?;
        """;

        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);       // Gán UserId
            stmt.setString(2, eventId);   // Gán EventId
            return stmt.executeUpdate() > 0; // Trả về true nếu thêm thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addOrder(Order order) {
        String query = "INSERT INTO Orders (UserId, FullName, EventId, EventName, TotalPrice, OrderDate, PaymentStatus) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = dbConnect.connectSQL(); PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, order.getUserId());
            stmt.setString(2, order.getFullName());
            stmt.setString(3, order.getEventId());
            stmt.setString(4, order.getEventName());
            stmt.setDouble(5, order.getTotalPrice());
            stmt.setDate(6, new java.sql.Date(order.getOrderDate().getTime())); // Chuyển đổi từ java.util.Date sang java.sql.Date
            stmt.setString(7, order.getPaymentStatus());

            return stmt.executeUpdate() > 0; // Trả về true nếu thêm thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu có lỗi
    }

    public boolean updatePaymentStatus(int orderId, String paymentStatus) {
        String query = "UPDATE Orders SET PaymentStatus = ? WHERE OrderId = ?";
        try (Connection connection = dbConnect.connectSQL(); PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, paymentStatus); // Giá trị PaymentStatus mới
            stmt.setInt(2, orderId); // ID đơn hàng

            return stmt.executeUpdate() > 0; // Trả về true nếu cập nhật thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu có lỗi
    }

    public List<Order> searchOrder(String keyword) {
        List<Order> order = new ArrayList<>();
        String sql = "select *from Orders where UserId like?";
        try (Connection connection = dbConnect.connectSQL(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                order.add(new Order(
                        rs.getInt("OrderId"),
                        rs.getInt("UserId"),
                        rs.getString("FullName"),
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getDouble("TotalPrice"),
                        rs.getDate("OrderDate"),
                        rs.getString("PaymentStatus")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return order;
    }

    // Lấy danh sách tất cả đơn hàng
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM Orders";
        try (Connection connection = dbConnect.connectSQL(); Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                orders.add(new Order(
                        rs.getInt("OrderId"),
                        rs.getInt("UserId"),
                        rs.getString("FullName"),
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getDouble("TotalPrice"),
                        rs.getDate("OrderDate"),
                        rs.getString("PaymentStatus")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    // Lấy danh sách đơn hàng theo UserId
    public List<Order> getOrdersByUserId(int userId) {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM Orders WHERE UserId = ?";

        try (Connection connection = dbConnect.connectSQL(); PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Order order = new Order(
                        rs.getInt("OrderId"),
                        rs.getInt("UserId"),
                        rs.getString("FullName"),
                        rs.getString("EventId"),
                        rs.getString("EventName"),
                        rs.getDouble("TotalPrice"),
                        rs.getDate("OrderDate"),
                        rs.getString("PaymentStatus")
                );
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public boolean updateOrder(Order order) {
        // Kiểm tra xem EventId có tồn tại không
        if (!isEventIdExists(order.getEventId())) {
            System.err.println("EventId không tồn tại trong bảng Events.");
            return false;
        }

        String query = """
        UPDATE Orders 
        SET UserId = ?, FullName = ?,EventId = ?,  EventName = ?, 
            TotalPrice = ?, OrderDate = ?, PaymentStatus = ? 
        WHERE OrderId = ?;
    """;

        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, order.getUserId());
            stmt.setString(2, order.getFullName());
            stmt.setString(3, order.getEventId());
            stmt.setString(4, order.getEventName());
            stmt.setDouble(5, order.getTotalPrice());
            stmt.setDate(6, new java.sql.Date(order.getOrderDate().getTime()));
            stmt.setString(7, order.getPaymentStatus());
            stmt.setInt(8, order.getOrderId());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEventIdExists(String eventId) {
        String query = "SELECT 1 FROM Events WHERE EventId = ?";
        try (Connection conn = dbConnect.connectSQL(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, eventId);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Trả về true nếu EventId tồn tại
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Trả về false nếu có lỗi
        }
    }

    // Xóa đơn hàng theo OrderId
    public boolean deleteOrder(int orderId) {
        String query = "DELETE FROM Orders WHERE OrderId = ?";
        try (Connection connection = dbConnect.connectSQL(); PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, orderId);

            return stmt.executeUpdate() > 0; // Trả về true nếu xóa thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu có lỗi
    }

}
