package Model;

import java.util.Date;

public class HopDong {
    private int MaHD;
    private Date NgayLap;
    private Date NgayThue;
    private Double TienCoc;
    private String MaPhong;
    private String MaKTDD;
    private String MaNguoiDung;

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public Date getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(Date NgayThue) {
        this.NgayThue = NgayThue;
    }

    public Double getTienCoc() {
        return TienCoc;
    }

    public void setTienCoc(Double TienCoc) {
        this.TienCoc = TienCoc;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaKTDD() {
        return MaKTDD;
    }

    public void setMaKTDD(String MaKTDD) {
        this.MaKTDD = MaKTDD;
    }

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }
    
    
}
