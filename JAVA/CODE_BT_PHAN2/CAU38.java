/*Bài 38. Viết chương trình nhập vào mảng A gồm n phần tử, các phần tử là những số nguyên
lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các yêu cầu sau:
a. Tìm phần tử lớn thứ 2 cùng với chỉ số.
b. Sắp xếp mảng theo thứ tự giảm dần.
c. Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo thứ tự sắp xếp giảm
dần của mảng A. */
package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU38 {
    public static int[] nhapMang() {
        int n; // số phàn tử mảng
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println(" nhap so phan tu ");
                n = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println(" du lieu khong hop le vui long nhap lai!!!");
            }
        }
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf(" NHAP GIA TRI MANG a[%d] ", i);
            while (true) {
                try {
                    a[i] = Integer.parseInt(sc.nextLine());
                    if (a[i] > 0 && a[i] < 100) {
                        break;
                    } else {
                        System.err.println(" GIA TRI KHONG HOP LE HAY NHAP LAI");
                    }

                } catch (Exception e) {
                    System.out.println(" DU LIEU KHONG HOP LE VUI LONG NHAP LAI");

                }
            }
        }
        return a;
    }

    public static void hienThiMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    // CÂU a. Tìm phần tử lớn thứ 2 cùng với chỉ số
    // Hàm tìm phần tử lớn thứ 2 và chỉ số của nó
    public static int[] timLonThuHai(int[] a) {
        // Tìm phần tử lớn nhất và lớn thứ hai
        int lonNhat = -1, lonThuHai = -1;
        int chiSoLonThuHai = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > lonNhat) {
                lonThuHai = lonNhat;
                chiSoLonThuHai = i - 1;
                lonNhat = a[i];
            } else if (a[i] > lonThuHai && a[i] < lonNhat) {
                lonThuHai = a[i];
                chiSoLonThuHai = i;
            }
        }
        return new int[] { lonThuHai, chiSoLonThuHai }; // Trả về kết quả dưới dạng mảng
    }

    // Hàm hiển thị kết quả
    public static void hienThiKetQua(int lonThuHai, int chiSoLonThuHai) {
        if (lonThuHai == -1) {
            System.out.println("Không tìm thấy phần tử lớn thứ 2 trong mảng.");
        } else {
            System.out.println("Phan tu lon thu 2 la: " + lonThuHai + ", chi so : " + chiSoLonThuHai);
        }
    }

    // Câu b: Sắp xếp mảng theo thứ tự giảm dần

    public static void sapXepMangGiamDan(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }

        }

    }

    public static void xuatMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    // CÂU C: CHÈN SỐ VÀO MẢNG SAO CHO GIẢM DẦN
    public static void chenMang(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chèn: ");
        int x = sc.nextInt();

        // Tạo mảng mới có kích thước lớn hơn 1
        int[] newArray = new int[a.length + 1];

        // Tìm vị trí chèn x
        int viTri = a.length; // Mặc định chèn vào cuối mảng
        for (int i = 0; i < a.length; i++) {
            if (a[i] < x) { // Tìm vị trí đầu tiên mà x lớn hơn
                viTri = i;
                break;
            }
        }

        // Sao chép các phần tử vào mảng mới
        for (int i = 0; i < viTri; i++) {
            newArray[i] = a[i]; // Sao chép các phần tử trước vị trí chèn
        }
        newArray[viTri] = x; // Gán giá trị x vào vị trí chèn
        for (int i = viTri; i < a.length; i++) {
            newArray[i + 1] = a[i]; // Sao chép các phần tử còn lại
        }

        // In mảng mới sau khi chèn
        System.out.println("Mảng sau khi chèn x và sắp xếp giảm dần:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = nhapMang();
        System.out.println(" mang vua nhap la:");
        hienThiMang(a);

        // câu A
        int[] ketQua = timLonThuHai(a); // Gọi hàm tìm phần tử lớn thứ 2
        hienThiKetQua(ketQua[0], ketQua[1]); // Gọi hàm hiển thị kết quả

        // CÂU B
        sapXepMangGiamDan(a);
        xuatMang(a);
        System.out.println("");

        // CÂU C
        chenMang(a);
    }

}
