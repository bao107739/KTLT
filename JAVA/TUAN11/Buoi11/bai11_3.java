package JAVA.TUAN11.Buoi11;
import java.util.Scanner;

public class bai11_3 {
    

public class PhanTichThuaSoNguyenTo {


    // Hàm phân tích số thành các thừa số nguyên tố
    public static void phanTichThuaSoNguyenTo(int so) {
        System.out.print(so + " = ");
        boolean dauTien = true;     

        // Xử lý các thừa số 2
        while (so % 2 == 0) {
            if (dauTien==false) System.out.print(" * ");
            System.out.print(2);
            so /= 2;
            dauTien = false;  
        }

        // Xử lý các thừa số lẻ
        for (int i = 3; i <= Math.sqrt(so); i += 2) {
            while (so % i == 0) {
                if (!dauTien) System.out.print(" * ");
                System.out.print(i);
                so /= i;
                dauTien = false;
            }
        }

        // Nếu số còn lại là số nguyên tố > 2
        if (so > 2) {
            if (dauTien==false) System.out.print(" * ");
            System.out.print(so);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NHAP MOT SO NGUYEN CAN PHAN TICH: ");
        int so = scanner.nextInt();

        if (so < 1) {
            System.out.println("SO NHAP VAO PHAI LON HON HOAC BANG 1.");
        } else {
            phanTichThuaSoNguyenTo(so);
        }

        scanner.close();
    }
}

}
