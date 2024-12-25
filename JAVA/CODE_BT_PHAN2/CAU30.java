package CODE_BT_PHAN2;
/*Bài 30. Số đối xứng (Palindrome) là số nhận được khi thực hiện đảo ngược các chữ số của
nó cho kết quả bằng số ban đầu. Ví dụ: 121, 3553.Viết chương trình kiểm tra số nguyên
dương n nhập vào từ bàn phím có phải là số đối xứng (Palindrome) không. Nếu đúng thì
hiển hiện thông báo “Số vừa nhập là số đối xứng”, ngược lại hiển thị thông báo “Số vừa
nhập không phải là số đối xứng”. */

import java.util.Scanner;

public class CAU30 {
     // Hàm kiểm tra số đối xứng
    public static boolean laSoDoiXung(int so) {
        int soGoc = so; // Lưu lại số ban đầu để so sánh
        int soDaoNguoc = 0; // Số sau khi đảo ngược

        // Thực hiện đảo ngược số
        while (so > 0) {
            int chuSoCuoi = so % 10; // Lấy chữ số cuối cùng
            soDaoNguoc = soDaoNguoc * 10 + chuSoCuoi; // Cập nhật số đảo ngược
            so /= 10; // Loại bỏ chữ số cuối cùng
        }

        // Kiểm tra nếu số đảo ngược bằng số gốc
        return soDaoNguoc == soGoc;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhập một số nguyên dương: ");
        int n = nhap.nextInt();

        // Kiểm tra nếu số nhập vào không hợp lệ
        if (n <= 0) {
            System.out.println("Số nhập vào không phải là số nguyên dương.");
        } else {
            // Gọi hàm kiểm tra số đối xứng
            if (laSoDoiXung(n)) {
                System.out.println("Số vừa nhập là số đối xứng.");
            } else {
                System.out.println("Số vừa nhập không phải là số đối xứng.");
            }
        }

        nhap.close(); // Đóng Scanner
    }
}
    

