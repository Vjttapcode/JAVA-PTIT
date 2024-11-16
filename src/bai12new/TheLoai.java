package bai12new;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class TheLoai {
    private String maTL;
    private String tenTL;

    public TheLoai(String maTL, String tenTL) {
        this.maTL = maTL;
        this.tenTL = tenTL;
    }

    public String getMaTL() {
        return maTL;
    }

    public String getTenTL() {
        return tenTL;
    }
}
