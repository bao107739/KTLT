/*Bài 20. Viết chương trình liệt kê n số nguyên tố đầu tiên */
package CODE_BT_PHAN2;
import java.util.Scanner;

public class CAU20 {

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int so) {
        if (so < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm liệt kê n số nguyên tố đầu tiên
    public static int[] lietKeSoNguyenTo(int soLuong) {
        int[] danhSachNguyenTo = new int[soLuong];
        int soHienTai = 2; // Bắt đầu kiểm tra từ số 2
        int dem = 0;       // Số lượng số nguyên tố đã tìm được

        while (dem < soLuong) {
            if (laSoNguyenTo(soHienTai)) {
                danhSachNguyenTo[dem] = soHienTai; // Thêm số nguyên tố vào mảng
                dem++;
            }
            soHienTai++;
        }

        return danhSachNguyenTo;
    }

    // Hàm chính để chạy chương trình
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner nhap = new Scanner(System.in);

        // Nhập số lượng số nguyên tố cần liệt kê
        System.out.print("Nhập số lượng số nguyên tố cần liệt kê: ");
        int soLuong = nhap.nextInt();

        if (soLuong > 0) {
            // Gọi hàm để liệt kê số nguyên tố
            int[] danhSachNguyenTo = lietKeSoNguyenTo(soLuong);

            // In ra danh sách số nguyên tố
            System.out.print(soLuong + " số nguyên tố đầu tiên là: ");
            for (int i = 0; i < danhSachNguyenTo.length; i++) {
                System.out.print(danhSachNguyenTo[i] + " ");
            }
        } else {
            System.out.println("Vui lòng nhập số nguyên dương.");
        }

        // Đóng Scanner
        nhap.close();
    }
}
                        