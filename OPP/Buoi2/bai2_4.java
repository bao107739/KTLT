package OPP.Buoi2;
// đăng nhập hợp lệ khi mã tàikhoanr là 'hello' và mặt khẩu trên 6 ký tự 
/*
 * thực thiện nhập user name và password  từ bàn phím 
 * sử dụng equalsIgnoreCase() để so sánh user name và length để lấy độ dài mật khẩu
 */

import java.util.Scanner;

public class bai2_4 {
    public static void main(String[] args) {
        String user= "hello";
        String password;

        String userinput;
         Scanner sc= new Scanner ( System.in);

         System.out.println(" nhap username");
         userinput=sc.nextLine();


         System.out.println(" nhap password:");
         password=sc.nextLine();

         if( userinput.equalsIgnoreCase(user)&& password.length()>=6){
            System.out.println(" Dang nhap thanh cong");
         }else{
            System.out.println(" that bai");
         }
    }
    
}
