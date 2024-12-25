package TUAN13.Buoi13;
/*BÀI  30. Số đối xứng (Palindrome) là số nhận được khi thực hiện đảo ngược các chữ số của
nó cho kết quả bằng số ban đầu. Ví dụ: 121, 3553.Viết chương trình kiểm tra số nguyên
dương n nhập vào từ bàn phím có phải là số đối xứng (Palindrome) không. Nếu đúng thì
hiển hiện thông báo “Số vừa nhập là số đối xứng”, ngược lại hiển thị thông báo “Số vừa
nhập không phải là số đối xứng”. */

import java.util.Scanner;

public class bai13_1 {
    public static void  kiemTraSoDoiXuung(){
        Scanner sc= new Scanner ( System.in);
        int so = sc. nextInt();
        String songuoc= "";
        int sogoc= so;
        
        while (so>0){
            int  chusocuoi=so % 10;
             songuoc = songuoc+chusocuoi;
             so= so/10;
        }
        int  somoi = Integer.parseInt(songuoc);
        if( somoi== sogoc){
            System.out.print(" SO BAN VUA NHAP LA SO DOI XUNG");

        }else{
            System.out.println(" SO BAN VUA NHAP KHONG PHAI LA SO DOI XUNG");
        }
    }


    public static void main(String[] args) {
        kiemTraSoDoiXuung();
        
    }
    
}
