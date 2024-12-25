package TUAN13.Buoi13;

import java.util.Scanner;

public class bai13_5 {
    public static void main(String[] args) {
        // Khai báo Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        
        // Nhập xâu ký tự từ người dùng
        System.out.print("Nhập một xâu ký tự: ");
        String xauNhap = scanner.nextLine();
        
        // Khởi tạo các biến
        int soTu = 0;
        boolean dangTrongTu = false; // Biến kiểm tra xem đang ở trong một từ hay không
        int i = 0;
        
        // Duyệt từng ký tự trong xâu
        while (i < xauNhap.length()) {
            char kyTuHienTai = xauNhap.charAt(i);
            
            // Nếu gặp khoảng trắng và trước đó có một từ, tăng số từ
            if (kyTuHienTai == ' ') {
                if (dangTrongTu) {          
                    soTu++;
                    dangTrongTu = false; // Kết thúc từ
                }
            } else {
                dangTrongTu = true; // Đang ở trong một từ
            }
            i++;
        }
        
        // Nếu xâu kết thúc và vẫn còn một từ chưa được đếm
        if (dangTrongTu) {
            soTu++;
        }
        
        // In kết quả
        System.out.println("Số từ trong xâu là: " + soTu);
        
        // Đóng Scanner
        scanner.close();
    }
}