              /*Bài 31. Viết chương trình kiểm tra xâu nhập vào từ bàn phím có phải là Palindrome không.
                Chuỗi ký tự được gọi là Palindrome khi thực hiện đảo ngược các ký tự của chuỗi thì nhận
                được kết quả là chuỗi ban đầu. Ví dụ: “Madam” là Palindrome. (Không phân biệt chữ hoa
                chữ thường). */
package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập một chuỗi: ");
        String chuoiNhap = scanner.nextLine();

        // Chuẩn hóa chuỗi: loại bỏ khoảng trắng và chuyển về chữ thường
        String chuoiChuanHoa = "";
        for (int i = 0; i < chuoiNhap.length(); i++) {
            char kyTu = chuoiNhap.charAt(i);   

            // Bỏ qua khoảng trắng
            if (kyTu != ' ') {
                // Chuyển ký tự hoa thành thường (nếu cần)  qvbq
                if (kyTu >= 'A' && kyTu <= 'Z') {
                    kyTu = (char) (kyTu + 32); // 'A' -> 'a', 'B' -> 'b', ...
                }
                chuoiChuanHoa += kyTu;
            }
        }

        // Tạo chuỗi đảo ngược từ chuỗi đã chuẩn hóa
        String chuoiDaoNguoc = "";
        for (int i = chuoiChuanHoa.length() - 1; i >= 0; i--) {
            chuoiDaoNguoc += chuoiChuanHoa.charAt(i);
        }

        // Kiểm tra chuỗi đã chuẩn hóa có phải là Palindrome không
        if (chuoiChuanHoa.equals(chuoiDaoNguoc)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }

        scanner.close();
    }
}
