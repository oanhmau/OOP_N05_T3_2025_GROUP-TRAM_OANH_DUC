public class testKhachHang {
    public static void test() {
        KhachHang kh = new KhachHang(1, "Nguyen Van A", "0123456789");
        kh.hienthi();
        
        // Test getters
        assert kh.MaKH == 1 : "MaKH should be 1";
        assert kh.TenKH.equals("Nguyen Van A") : "TenKH should be 'Nguyen Van A'";
        assert kh.sdt.equals("0123456789") : "sdt should be '0123456789'";
        
        System.out.println("All tests passed for KhachHang.");
    }
}
