/*Bài 28. Viết chương trình thực hiện nhập một xâu ký tự. Tìm từ dài nhất trong xâu và vị
trí. (Nếu có nhiều từ cùng độ dài thì chọn từ đầu tiên tìm thấy). */
package CODE_BT_PHAN2;

public class CAU28 {
    // Tìm từ dài nhất trong chuỗi
    // public static void tuDaiNhat(String chuoi) {
    //     String danhSachTu[] = chuoi.split("\\s+"); // Tách chuỗi thành danh sách từ
    //     String tuDaiNhat = danhSachTu[0]; // Khởi tạo từ đầu tiên
    //     int i=0;
    //     int vt=0;
    //     for ( i = 0; i <danhSachTu.length; i++) {
    //         if (tuDaiNhat.length() < danhSachTu[i].length()) {
    //             tuDaiNhat = danhSachTu[i]; // Cập nhật từ dài nhất
    //            vt=i;
    //         }
    //     }
       
       
    //    System.out.printf("Chiều dài từ dài nhất trong chuỗi là %d\n", tuDaiNhat.length());
    //      System.out.printf("Từ dài nhất trong chuỗi bắt đầu tại vị trí %d\n", vt);
    //     System.out.printf("Từ dài nhất trong chuỗi đã cho là %s\n", tuDaiNhat);
        
       

    // }

    // Tìm vị trí từ dài nhất trong chuỗi
    public static int viTriTuDaiNhat(String chuoi) {
        int viTri = -1; // Vị trí bắt đầu của từ dài nhất
        String tuTamThoi = ""; // Lưu từ hiện tại
        String tuDaiNhat = ""; // Lưu từ dài nhất
        int doDaiTuTam = 0, doDaiMax = 0; // Biến đếm độ dài từ hiện tại và độ dài lớn nhất

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) != 32 && chuoi.charAt(i) != 92) { // Nếu không phải khoảng trắng
                doDaiTuTam++;
                tuTamThoi += chuoi.charAt(i); // Thêm ký tự vào từ hiện tại

                // Xử lý từ cuối chuỗi (nếu từ cuối cùn trong chuổi  không được kết thúc bằng 
                // một khoảng trắng hoặc ký đặc biệt , thì nó sẽ không xử lý được trong else ở dưới 
                if (i == chuoi.length() - 1 && doDaiTuTam > doDaiMax) {
                    doDaiMax = doDaiTuTam;
                    viTri = i - doDaiMax + 1; // Cập nhật vị trí
                    tuDaiNhat = tuTamThoi; // Cập nhật từ dài nhất
                }
                int c = 5;
            } else {
                if (doDaiTuTam > doDaiMax) { // Kiểm tra độ dài từ hiện tại
                    doDaiMax = doDaiTuTam;
                    viTri = i - doDaiMax+1; // Cập nhật vị trí bắt đầu
                    tuDaiNhat = tuTamThoi; // Cập nhật từ dài nhất
                }
                tuTamThoi = ""; // Reset từ hiện tại
                doDaiTuTam = 0; // Reset độ dài từ hiện tại
            }
        }

        // Hiển thị kết quả
        System.out.printf("Chiều dài từ dài nhất trong chuỗi là %d\n", doDaiMax);
        System.out.printf("Từ dài nhất trong chuỗi bắt đầu tại vị trí %d\n", viTri);
        System.out.printf("Từ dài nhất trong chuỗi đã cho là %s\n", tuDaiNhat);
        return viTri; // Trả về vị trí
    }
    //String chuoi = "languages Xin chào mọi người hello everybody goodjob apartment languages abc";

    public static void main(String[] args) {
        String chuoi = "a bb cccccc dddddd";
         viTriTuDaiNhat(chuoi);
        // tuDaiNhat(chuoi);
    }
}
