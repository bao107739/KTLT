/*Bài 35. Viết chương trình nhập vào ma trận A có n dòng, m cột, các phần từ là những số
nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các yêu cầu sau:
a. Tìm phần tử lớn nhất cùng với chỉ số.
b. Tìm và in ra các phần tử là số đối xứng (Palindrome).
c. Tìm và in ra các phần tử là số nguyên tố (các phần tử không phải là số nguyên tố
được thay bằng số 0)
d. Sắp xếp tất cả các cột theo thứ tự tăng dần và hiển thị kết quả. */

// lưu ý mảng 2 chiều khi muốn biết tổng số phần tử ta phải lấy n*m hay là a.length * a[i].lenhth
package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU35 {
    // Nhập ma trận từ bàn phím
    public static int[][] nhapMaTran() {
        Scanner sc = new Scanner(System.in);
        int n; // Số hàng
        int m; // Số cột
        while (true) {
            try {
                System.out.println(" moi nhap so dong n");
                n = Integer.parseInt(sc.nextLine()); // Nhập số hàng
                System.out.println(" mơi nhap m cot");
                m = Integer.parseInt(sc.nextLine()); // Nhập số cột
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (Exception e) {
                System.out.println(" DU LIEU NHAP KHONG DUNG VUI LONG NHAP LAI");
            }
        }
        
        // Khởi tạo ma trận kích thước n x m
        int[][] a = new int[n][m];

        // Nhập các phần tử của ma trận
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("a[" + i + "][" + j + "]");
                while (true) {
                    try {
                        a[i][j] = Integer.parseInt(sc.nextLine()); // Nhập phần tử ma trận
                        if (a[i][j] > 0 && a[i][j] < 100) { // Kiểm tra giá trị hợp lệ (1-99)
                            break; // Thoát khỏi vòng lặp nếu đúng
                        } else {
                            System.out.println(" du lieu sai moi nhap lai");
                        }
                    } catch (Exception e) {
                        System.out.println(" DU LIEU KHONG DUNG VUI LONG NHAP LAI!!!");
                    }
                }
            }
        }
        return a; // Trả về ma trận
    }

    // Xuất ma trận ra màn hình
    public static void xuatMang(int a[][]) {
        for (int i = 0; i < a.length; i++) { // Duyệt qua từng hàng
            for (int j = 0; j < a[i].length; j++) { // Duyệt qua từng cột
                System.out.print(a[i][j] + "\t"); // Xuất giá trị phần tử
            }
            System.out.println(""); // Xuống dòng sau mỗi hàng
        }
    }

    // CÂU A: Tìm phần tử lớn nhất cùng với chỉ số
    public static int phanTuLonNhat(int a[][]) {
        int max = -1; // Giá trị lớn nhất ban đầu
        int chiSoDong = -1; // Chỉ số dòng của phần tử lớn nhất
        int chiSoCot = -1; // Chỉ số cột của phần tử lớn nhất
        for (int i = 0; i < a.length; i++) { // Duyệt qua từng hàng
            for (int j = 0; j < a[i].length; j++) { // Duyệt qua từng cột
                if (a[i][j] > max) { // Nếu tìm thấy phần tử lớn hơn
                    max = a[i][j];
                    chiSoDong = i;
                    chiSoCot = j;
                }
            }
        }
        // Xuất kết quả
        System.out.print(max);
        System.out.println("\nvi tri dong " + chiSoDong);
        System.out.println("chi so cot :" + chiSoCot);
        return max; // Trả về giá trị lớn nhất
    }

    // CÂU B: Tìm và in các phần tử là số đối xứng
    // Hàm kiểm tra số đối xứng
    public static boolean laSoDoiXung(int so) {
        int soDaoNguoc = 0, tam = so; // Biến lưu số đảo ngược và bản sao số
        while (tam > 0) {
            int chusocuoi = tam % 10; // Lấy chữ số cuối cùng
            soDaoNguoc = soDaoNguoc * 10 + chusocuoi; // Cập nhật số đảo ngược
            tam /= 10; // Bỏ chữ số cuối cùng
        }
        return so == soDaoNguoc; // Kiểm tra nếu số ban đầu bằng số đảo ngược
    }

    public static void timSoDoiXung(int[][] a) {
        System.out.println("Cac phan tu la so doi xung:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (laSoDoiXung(a[i][j])) { // Kiểm tra nếu phần tử là số đối xứng
                    System.out.printf("a[%d][%d] = %d\n", i, j, a[i][j]);
                }
            }
        }
    }

    // CÂU C: Thay các số không phải là số nguyên tố bằng 0
    // Hàm kiểm tra số nguyên tố
    public static boolean soNguyenTo(int so) {
        if (so < 2) // Số nhỏ hơn 2 không phải số nguyên tố
            return false;
        for (int i = 2; i <= Math.sqrt(so); i++) { // Duyệt từ 2 đến căn bậc hai của số
            if (so % i == 0) // Nếu số chia hết
                return false;
        }
        return true; // Nếu không chia hết cho bất kỳ số nào, là số nguyên tố
    }

    public static void thaySoNguyenTo(int a[][]) {
        System.out.println(" ma tran voi cac so không phai là so nguyen to thay bàng khong");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (!soNguyenTo(a[i][j])) { // Nếu không phải số nguyên tố
                    a[i][j] = 0; // Thay bằng 0
                }
                System.out.print(a[i][j] + "\t"); // Xuất ma trận sau khi thay đổi
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
    }

// CÂU D Sắp xếp tất cả các cột theo thứ tự tăng dần và hiển thị kết quả.
    public static void sapXepTangDan(int a[][]){
        for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i].length-1;k++){
                    if( a[k][j]>a[k+1][j]){
                        int tam=a[k][j];
                        a[k][j]= a[k+1][j];
                        a[k+1][j] =tam;
                    }
                }
             }
        }
        for( int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = nhapMaTran(); // Nhập ma trận từ bàn phím
        
        xuatMang(a); // Xuất ma trận
        // CÂU A: Tìm phần tử lớn nhất
        System.out.print(" PHAN TU LON NHAT LA ");
        System.out.println(phanTuLonNhat(a));
        // CÂU B: Tìm và in số đối xứng
        timSoDoiXung(a);
        // CÂU C: Thay số không nguyên tố bằng 0
        thaySoNguyenTo(a);
        System.out.println();
        //CÂU D
        sapXepTangDan(a);
    }
}
