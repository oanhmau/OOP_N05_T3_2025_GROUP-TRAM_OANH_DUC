
public class KhachHang {
    int maKH;
    String tenKH;
    String sdt;

    public KhachHang(int maKH, String tenKH, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
    }

    public void hienthi() {
        System.out.println("Ten Khach Hang: " + tenKH);
    }
}