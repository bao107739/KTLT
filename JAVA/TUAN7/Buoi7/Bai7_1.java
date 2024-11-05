package JAVA.TUAN7.Buoi7;
import java.util.Scanner; //  Nhập lớp Scanner từ thư viện java.util, giúp lấy dữ liệu từ người dùng thông qua bàn phím.


// Khai báo lớp Bai7_1 với phạm vi truy cập public, nghĩa là lớp này có thể truy cập từ các lớp khác.
public class Bai7_1 {
    public static  float nhapSoThuc(){{
        Scanner sc = new Scanner(System.in);   //Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím.
        float  diem =0 ;
        while(true)       // Bắt đầu một vòng lặp vô hạn. Vòng lặp này sẽ chạy cho đến khi gặp lệnh break.
        //try {..} catch (Exception ex) {..}: Khối try-catch dùng để bắt và xử lý các ngoại lệ.
        //Nếu xảy ra lỗi (ví dụ: người dùng nhập không phải số), chương trình sẽ in ra thông báo và yêu cầu nhập lại.
        try{
            System.out.println(" \nNhap diem:");
            diem = Float.parseFloat(sc.nextLine());  // Chuyển chuỗi ký tự nhập vào từ Scanner thành số thực kiểu float.
            if ( diem>=0 && diem <=10 )              //Nếu đúng, thoát vòng lặp bằng lệnh break.

            break;
            else{
                System.out.println(" Diem khong hop le vui long nhap lai");
            }
        }
        //   catch Nếu nhập không hợp lệ (như nhập chữ thay vì số), chương trình sẽ in ra thông báo và yêu cầu nhập lại.
        catch ( Exception ex ){
            System.out.println(" Diem khong hop le vui long nhap lai!!!!");
        }
        return diem ; //Trả về giá trị của diem khi điểm nhập vào hợp lệ.

        }}
    
    
    public static void main ( String [] args){
        float diem = nhapSoThuc();
       
        
       
        System.out.println(" diem ban vua nhap la"+ diem );

    }
}


    

