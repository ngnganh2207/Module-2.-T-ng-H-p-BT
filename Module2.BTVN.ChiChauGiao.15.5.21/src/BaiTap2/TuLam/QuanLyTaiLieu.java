package BaiTap2.TuLam;

public class QuanLyTaiLieu {
    private int maHienTai = 0;
    private TaiLieu[] danhSachTailieu;
    private int soLuong;

    public QuanLyTaiLieu() {
        this.soLuong = 0;
        this.danhSachTailieu = new TaiLieu[100];
    }
    //CHƯA HIỂU
    public void themMoi(TaiLieu taiLieu) {
        //CHƯA HIỂU
        for (int i = 0; i < soLuong; i++) {
            if (danhSachTailieu[i].getNxb().equals(taiLieu.getNxb())) {
                danhSachTailieu[i].setSoBanPhatHanh(danhSachTailieu[i].getSoBanPhatHanh() + taiLieu.getSoBanPhatHanh());
                return;
            }
        }
        //CHƯA HIỂU
        taiLieu.setMa(maHienTai);
        maHienTai++;
        danhSachTailieu[soLuong] = taiLieu;
        soLuong++;
    }
    //CHƯA HIỂU
    public void hienThi() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSachTailieu[i]);
        }
    }
}
