/*Bài 4. Viết chương trình kiểm tra số nguyên dương N nhập vào từ bàn phím có phải là số
nguyên tố không? */
package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU4 {
    public static void soNguyenTo() {
        Scanner sc = new Scanner(System.in);
        int so;

        // Nhập số nguyên dương N
        do {
            System.out.print(" moi ban nhan so nguyen duong : ");
            so = sc.nextInt();
            if (so > 0) {
                System.out.println("Ban da nhap so duong.");
            } else {
                System.out.println("ban dang nhap so am vui long nhap lai.");
            }
        } while (so <= 0);

     

        boolean snt = true; // Giả sử ban đầu là số nguyên tố
        if( so==0 || so==1){
            snt= false;
        }
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                snt = false;
                break;
            }
        }

        // In kết quả
        if (snt) {
            System.out.println(so + " là số nguyên tố.");
        } else {
            System.out.println(so + " không phải là số nguyên tố.");
        }
    }

    public static void main(String[] args) {
        soNguyenTo();
    }
}
