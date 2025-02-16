package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU32 {

    // Hàm đếm số từ trong chuỗi ký tự
    public static int demSoTu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập xâu ký tự:");
        String xauNhap = sc.nextLine(); // Nhập chuỗi từ người dùng

        int soTu = 0; // Biến đếm số từ
        boolean laKhoangTrang = true; // Biến kiểm tra khoảng trắng

        // Duyệt qua từng ký tự của chuỗi
        for (int i = 0; i < xauNhap.length(); i++) {
            char kyTuHienTai = xauNhap.charAt(i);

            // Nếu ký tự hiện tại không phải khoảng trắng và trước đó là khoảng trắng
            if (kyTuHienTai != ' ' && laKhoangTrang) {
                soTu++; // Đếm một từ mới
                laKhoangTrang = false; // Đánh dấu đang trong từ
            } 
            // Nếu ký tự hiện tại là khoảng trắng
            else if (kyTuHienTai == ' ') {
                laKhoangTrang = true; // Kết thúc từ hiện tại
            }
        }

        return soTu; // Trả về số từ
    }

    public static void main(String[] args) {
        // Gọi hàm demSoTu và in kết quả ra màn hình
       // int soTu = demSoTu();
        System.out.println("Số từ trong xâu là: " + demSoTu());
    }
}
