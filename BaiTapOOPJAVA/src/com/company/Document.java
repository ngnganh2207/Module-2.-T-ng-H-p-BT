package com.company;

public class Document {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private String soBanPhatHanh;
    public Document(){
    }
    public Document(String maTaiLieu, String tenNhaXuatBan, String soBanPhatHanh){
        this.maTaiLieu= maTaiLieu;
        this.tenNhaXuatBan= tenNhaXuatBan;
        this.soBanPhatHanh= soBanPhatHanh;
    }
    public String getMaTaiLieu(){
        return this.maTaiLieu;
    }
    public String getTenNhaXuatBan(){
        return this.tenNhaXuatBan;
    }
    public String getSoBanPhatHanh(){
        return this.soBanPhatHanh;
    }
    public void setMaTaiLieu(String maTaiLieu){
        this.maTaiLieu= maTaiLieu;
    }
    public void setTenNhaXuatBan(String tenNhaXuatBan){
        this.tenNhaXuatBan=tenNhaXuatBan;
    }
    public void setSoBanPhatHanh(String soBanPhatHanh){
        this.soBanPhatHanh=soBanPhatHanh;
    }
}
