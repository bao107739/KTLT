/*Bài 4. Viết chương trình kiểm tra số nguyên dương N nhập vào từ bàn phím có phải là số
nguyên tố không? */
package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU4 {
    public static void soNguyenTo() {
        Scanner sc = new Scanner(System.in);
        int so;
        System.out.println("nhap so n: ");
        do {
            so = sc.nextInt();
            if (so > 0) {
                System.out.println(" ban da nhap so duong");
            } else {
                System.out.println(" moi ban nhap lai so duong");
            }
        } while (so <= 0);
        int snt;
        snt = 1;
        if (so == 1) {
            snt = 0;
        }
        for (int i = 2; i < so; i++) {
            if (so % i == 0) {
                snt = 0;
                break;
            }
        }
        if (snt == 1) {
            System.out.println(" la so nguyen to.");

        } else {
            System.out.println("Khong phai la so nguyen to.");
        }
    }

    public static void main(String[] args) {
        soNguyenTo();
    }
}
