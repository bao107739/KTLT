package JAVA.TUAN11.Buoi11;

import java.util.Scanner;

public class bai14_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhap so nguyen n để phân tích thừa số nguyên tố");
        int so = sc.nextInt();
        int i = 2;
        System.out.print(+so + "=");

        while (so > 1) {

            if (so % i == 0) {

                System.out.print(i);
                so = so / i;
                if (so > 1) {
                    System.out.print("*");
                }
            } else {
                i++;
            }
        }
    }
}
