package BaiTap2.TuLam;

public class TaiLieu {
    private int ma;
    private String nxb;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String nxb, int soBanPhatHanh) {
        this.nxb = nxb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu(int ma, String nxb, int soBanPhatHanh) {
        this.ma = ma;
        this.nxb = nxb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "ma=" + ma +
                ", nxb='" + nxb + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
