package model;

public class ThongKeClass {

    private String ngay_dang_ky;  // Ngày đăng ký (hoặc tháng)
    private int so_luong_Don;    // Số lượng đơn hàng
    private double doanhThu;     // Tổng doanh thu
    private int so_luong_HoaDon;

    public int getSo_luong_HoaDon() {
        return so_luong_HoaDon;
    }

    public void setSo_luong_HoaDon(int so_luong_HoaDon) {
        this.so_luong_HoaDon = so_luong_HoaDon;
    }

    public String getNgay_dang_ky() {
        return ngay_dang_ky;
    }

    public void setNgay_dang_ky(String ngay_dang_ky) {
        this.ngay_dang_ky = ngay_dang_ky;
    }

    public int getSo_luong_Don() {
        return so_luong_Don;
    }

    public void setSo_luong_Don(int so_luong_Don) {
        this.so_luong_Don = so_luong_Don;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
