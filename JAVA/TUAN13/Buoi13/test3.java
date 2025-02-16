package TUAN13.Buoi13;

import java.util.Scanner;

public class test3 {
    public static String nhapChuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" moi nhap chuoi");
        String chuoiKhongKhoangTrang = "";

        String nhapChuoi = sc.nextLine();
        for (int i = 0; i < nhapChuoi.length(); i++) {
            if (nhapChuoi.charAt(i) != ' ') {

                chuoiKhongKhoangTrang = chuoiKhongKhoangTrang + nhapChuoi.charAt(i);
            }
        }
        System.out.println(chuoiKhongKhoangTrang);

        if (chuoiKhongKhoangTrang.length() > 255) {
            System.out.println(" so luong ký tu vuot muc cho phep");
        }
        return chuoiKhongKhoangTrang;
    }

    public static int demKyTuMotLan(String chuoiKhongKhoangTrang) {
        int kyTuXuatHien = 0;
        for (int i = 0; i < chuoiKhongKhoangTrang.length(); i++) {
            char kyTuHienTai = chuoiKhongKhoangTrang.charAt(i);
            int tanSuat = 0;
            for (int j = 0; j < chuoiKhongKhoangTrang.length(); j++) {
                if (chuoiKhongKhoangTrang.charAt(j) == kyTuHienTai) {
                    tanSuat++;
                }
            }
            if (tanSuat == 1) {
                kyTuXuatHien++;
            }
        }
        return kyTuXuatHien;
    }

    public static void main(String[] args) {

        System.out.println(" ky tu xuat hien 1 lan la " + demKyTuMotLan(nhapChuoi()));
    }

}
