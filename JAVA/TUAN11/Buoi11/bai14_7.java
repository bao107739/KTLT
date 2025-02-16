package TUAN11.Buoi11;
import java.util.Scanner;

public class bai14_7 {
   
                               // BÀI TẬP :   CODE  HIỂN THỊ CHỮ  ĐẢO NGƯỢC  NGƯỢC


    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System. out. println(" moi nhap chuoi");
        System.out.println(" chuoi ban la");
        String nhap = sc.nextLine();
         for(int i = nhap.length()-1; i>=0;i--){
            System.out.print(nhap.charAt(i));
         }
        
    
        
    }
    
}
