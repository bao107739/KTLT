/*Bài 18. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố. Ví dụ: Số
28 được phân tích thành 2 x 2 x 7. */
package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU18 {
    // Hàm phân tích một số nguyên dương thành tích các thừa số nguyên tố
    public static void phanTichThuaSO(int so) {
        boolean nhan = true; // Biến kiểm soát việc in dấu "*" giữa các thừa số
        System.out.print(so + " ="); // In số cần phân tích, bắt đầu với dấu "="
        int i = 2; // Khởi tạo i bằng 2, số nguyên tố nhỏ nhất

        // Vòng lặp chạy đến khi số đã phân tích hết (so <= 1)
        while (so > 1) {
            // Nếu không phải lần đầu tiên, in dấu "*"
            if (nhan == false) {
                System.out.print("*");
            }
            // Kiểm tra nếu số chia hết cho i
            if (so % i == 0) {
                System.out.print(i); // In thừa số nguyên tố i
                so = so / i; // Chia số cho i để tiếp tục phân tích
                nhan = false; // Sau lần đầu tiên, bật cờ để in dấu "*"
            } else {
                i++; // Nếu không chia hết, tăng i lên để kiểm tra số tiếp theo
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        System.out.print("Nhập số cần phân tích: "); // Nhắc người dùng nhập số
        int soCanPhanTich = Integer.parseInt(sc.nextLine()); // Đọc và chuyển đổi số nhập vào
        phanTichThuaSO(soCanPhanTich); // Gọi hàm phân tích thừa số
    }
}
