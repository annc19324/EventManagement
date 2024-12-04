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
    public List<ThongKeClass> getListByLopHoc(){
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
}
