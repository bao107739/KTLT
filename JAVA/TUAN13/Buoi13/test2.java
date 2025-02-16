package TUAN13.Buoi13;

import java.util.Scanner;

public class test2 {
    public static int demSoTu( String chuoi){
        chuoi= chuoi.trim();
       String   danhSachTu []= chuoi.split("\\s+");
    int soTu= danhSachTu.length;
    return soTu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
       
        System.out.println(" moi nhap chuoi ");
        String chuoi=sc.nextLine();
       
        System.out.println(" so tu ban vua nhap la "+  demSoTu(chuoi));
}
}