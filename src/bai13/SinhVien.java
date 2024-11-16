package bai13;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, hoTen, lop, email, sdt;

    public SinhVien(String maSV, String hoTen, String lop, String email, String sdt){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)){
            return this.maSV.compareTo(o.maSV);
        }
        return this.lop.compareTo(o.lop);
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + email + " " + sdt;
    }
}
