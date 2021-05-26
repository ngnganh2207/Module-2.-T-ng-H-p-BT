package BaiTap2.TuLam;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String nxb, int soBanPhatHanh, String ngayPhatHanh) {
        super(nxb, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int ma, String nxb, int soBanPhatHanh, String ngayPhatHanh) {
        super(ma, nxb, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }
}
