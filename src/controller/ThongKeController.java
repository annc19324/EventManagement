package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ThongKeClass;

public class ThongKeController {

    private Connect dbConnect;

    public ThongKeController() {
        dbConnect = new Connect();
    }

    public List<ThongKeClass> getListByLopHoc() {
        String sql = "select OrderDate,Count(*) as So_Luong from [Orders] group  by OrderDate";
        List<ThongKeClass> list = new ArrayList<>();
        try {
            Connection cons = dbConnect.connectSQL();
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeClass thongke = new ThongKeClass();
                thongke.setNgay_dang_ky(rs.getString("OrderDate"));
                thongke.setSo_luong_Don(rs.getInt("So_Luong"));
                list.add(thongke);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ThongKeClass> getRevenueStatistics(int month, int year) {
        String sql = "SELECT MONTH(OrderDate) AS Month, COUNT(*) AS So_Luong, SUM(TotalPrice) AS TotalRevenue "
                + "FROM Orders WHERE MONTH(OrderDate) = ? AND YEAR(OrderDate) = ? AND PaymentStatus = N'Đã thanh toán' "
                + "GROUP BY MONTH(OrderDate)";
        List<ThongKeClass> list = new ArrayList<>();
        try {
            Connection cons = dbConnect.connectSQL();
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, month);  // Tháng
            ps.setInt(2, year);   // Năm
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeClass thongke = new ThongKeClass();
                thongke.setNgay_dang_ky("Tháng " + rs.getInt("Month")); // Hiển thị tháng
                thongke.setSo_luong_Don(rs.getInt("So_Luong"));  // Số lượng đơn
                thongke.setDoanhThu(rs.getDouble("TotalRevenue")); // Doanh thu
                list.add(thongke);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //lay don 7 ngay gan nhat
    public List<ThongKeClass> getLast7DaysOrderStatistics() {
        String sql = "SELECT CONVERT(VARCHAR, OrderDate, 103) AS OrderDate, COUNT(*) AS So_Luong_Hoa_Don "
                + "FROM Orders "
                + "WHERE OrderDate >= DATEADD(DAY, -7, GETDATE()) "
                + "GROUP BY CONVERT(VARCHAR, OrderDate, 103) "
                + "ORDER BY OrderDate DESC";

        List<ThongKeClass> list = new ArrayList<>();
        try {
            Connection cons = dbConnect.connectSQL();
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeClass thongke = new ThongKeClass();
                thongke.setNgay_dang_ky(rs.getString("OrderDate"));
                thongke.setSo_luong_Don(rs.getInt("So_Luong_Hoa_Don"));
                list.add(thongke);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //
    public List<ThongKeClass> getRevenueStatisticsForChart() {
        String sql = "SELECT MONTH(OrderDate) AS Month, YEAR(OrderDate) AS Year, SUM(TotalPrice) AS TotalRevenue "
                + "FROM Orders WHERE PaymentStatus = N'Đã thanh toán' "
                + "GROUP BY MONTH(OrderDate), YEAR(OrderDate) "
                + "ORDER BY YEAR(OrderDate), MONTH(OrderDate)";
        List<ThongKeClass> list = new ArrayList<>();
        try (Connection cons = dbConnect.connectSQL(); PreparedStatement ps = cons.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeClass thongKe = new ThongKeClass();
                thongKe.setNgay_dang_ky("Tháng " + rs.getInt("Month") + ", Năm " + rs.getInt("Year"));
                thongKe.setDoanhThu(rs.getDouble("TotalRevenue"));
                list.add(thongKe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
