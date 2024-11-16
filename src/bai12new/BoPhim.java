package bai12new;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BoPhim implements Comparable<BoPhim> {
    private String maPhim;
    private TheLoai theLoai;
    private Date ngayKhoiChieu;
    private String tenPhim;
    private int soTapPhim;

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public BoPhim(String maPhim, TheLoai theLoai, String ngayKhoiChieu, String tenPhim, int soTapPhim) throws ParseException {
        this.maPhim = maPhim;
        this.theLoai = theLoai;
        this.ngayKhoiChieu = dateFormat.parse(ngayKhoiChieu);
        this.tenPhim = tenPhim;
        this.soTapPhim = soTapPhim;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public Date getNgayKhoiChieu() {
        return ngayKhoiChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getSoTapPhim() {
        return soTapPhim;
    }

    @Override
    public int compareTo(BoPhim other) {
        int cmpNgayKhoiChieu = this.ngayKhoiChieu.compareTo(other.ngayKhoiChieu);
        if (cmpNgayKhoiChieu != 0) {
            return cmpNgayKhoiChieu;
        }

        int cmpTenPhim = this.tenPhim.compareTo(other.tenPhim);
        if (cmpTenPhim != 0) {
            return cmpTenPhim;
        }

        return Integer.compare(other.soTapPhim, this.soTapPhim);
    }

    @Override
    public String toString() {
        return maPhim + " " + theLoai.getTenTL() + " " + dateFormat.format(ngayKhoiChieu) + " " + tenPhim + " " + soTapPhim;
    }
}