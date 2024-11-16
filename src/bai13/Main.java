package bai13;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<SinhVien> danhSachSinhVien = new ArrayList<>();
        while(sc.hasNextLine()){
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            SinhVien sv = new SinhVien(maSV, hoTen, lop, email, sdt);
            danhSachSinhVien.add(sv);
        }
        Collections.sort(danhSachSinhVien);
        for(SinhVien a : danhSachSinhVien){
            System.out.println(a);
        }
        sc.close();
    }
}
