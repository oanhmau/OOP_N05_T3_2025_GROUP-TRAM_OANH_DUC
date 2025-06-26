public class Main {
    public static void main(String[] args) {
        KhachHang khach = new KhachHang(1, "Nguyen Van A", "0123456789");
        May may = new May(101, "May Gaming", "Asus", 20000, 5, 100000, 10);
        ThanhToan thanhToan = new ThanhToan(1001, 101, 1, 2, 40000, "2025-06-26 15:30");
        
        khach.hienthi();
        System.out.println("-----");
        may.hienthi();
        System.out.println("-----");
        System.out.println("Thanh toán: " + thanhToan.getTongTien() + "VND");
    }
}

class KhachHang {
    int maKH;
    String tenKH, sdt;

    public KhachHang(int maKH, String tenKH, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
    }
    
    public void hienthi() {
        System.out.println("Khách: " + tenKH + " - " + sdt);
    }
}

class May {
    int maMay, giaGio, daChoi, tongTien, conLai;
    String tenMay, hangMay;

    public May(int maMay, String tenMay, String hangMay, int giaGio, 
               int daChoi, int tongTien, int conLai) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.hangMay = hangMay;
        this.giaGio = giaGio;
        this.daChoi = daChoi;
        this.tongTien = tongTien;
        this.conLai = conLai;
    }
    
    public void hienthi() {
        System.out.printf("Máy %s (%s)\nGiá: %dVND/giờ\nĐã chơi: %d giờ\n", 
                         tenMay, hangMay, giaGio, daChoi);
    }
}

class ThanhToan {
    private int maTT, maMay, maKH, soGio, tongTien;
    private String thoiGian;

    public ThanhToan(int maTT, int maMay, int maKH, int soGio, int tongTien, String thoiGian) {
        this.maTT = maTT;
        this.maMay = maMay;
        this.maKH = maKH;
        this.soGio = soGio;
        this.tongTien = tongTien;
        this.thoiGian = thoiGian;
    }

    // Chỉ giữ lại getter cần thiết
    public int getTongTien() {
        return tongTien;
    }
}
