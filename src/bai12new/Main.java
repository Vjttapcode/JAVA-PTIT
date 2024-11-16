package bai12new;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng thể loại và số lượng phim
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        // Danh sách các thể loại
        List<TheLoai> danhSachTheLoai = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            String tenTL = scanner.nextLine();
            String maTL = String.format("TL%03d", i);
            danhSachTheLoai.add(new TheLoai(maTL, tenTL));
        }
        List<BoPhim> danhSachBoPhim = new ArrayList<>();
        for (int i = 1; i <= M; i++) {
            String maTheLoai = scanner.next();
            String ngayKhoiChieu = scanner.next();
            scanner.nextLine(); // Đọc bỏ dòng trống sau ngày khởi chiếu
            String tenPhim = scanner.nextLine();
            int soTapPhim = scanner.nextInt();
            if (scanner.hasNextLine()) scanner.nextLine(); // Đọc bỏ dòng trống sau số tập phim

            // Tìm thể loại tương ứng với mã thể loại
            TheLoai theLoai = null;
            for (TheLoai tl : danhSachTheLoai) {
                if (tl.getMaTL().equals(maTheLoai)) {
                    theLoai = tl;
                    break;
                }
            }

            // Tạo mã phim tự động
            String maPhim = String.format("P%03d", i);
            BoPhim phim = new BoPhim(maPhim, theLoai, ngayKhoiChieu, tenPhim, soTapPhim);
            danhSachBoPhim.add(phim);
        }

        // Sắp xếp danh sách phim
        Collections.sort(danhSachBoPhim);

        // In kết quả
        for (BoPhim phim : danhSachBoPhim) {
            System.out.println(phim);
        }

        scanner.close();
    }
}