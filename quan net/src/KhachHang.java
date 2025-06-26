
public class KhachHang{
    int MaKH;
    string TenKH;
    string sdt;

    public KhachHang( int MaKH, string TenKH, string sdt){
        this.MaKH = maKH;
        this.TenKH = tenKH;
        this.sdt = sdt;
    }
    public void hienthi() {
        System.out.println("Ten Khach Hang:" + TenKH);
    }
}
