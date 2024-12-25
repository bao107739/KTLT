// Bài 38. Viết chương trình nhập vào mảng A gồm n phần tử, các phần tử là những số nguyên
//lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. 
package TUAN13.Buoi13;
import java.util .Scanner;

public class bai13_3 {
    public static int [] nhapMang(){
     int n; // số phàn tử mảng
     Scanner sc= new Scanner( System.in);

     while(true){
        try {
            System.out.println(" nhap so phan tu ");
            n =  Integer.parseInt (sc.nextLine());
            break;

        } catch (Exception e) {
            System.out.println(" du lieu khong hop le vui long nhap lai!!!");
        }
     }
     int a[]= new int [n];
     for( int i= 0;i<n;i++){
        System.out.printf(" NHAP GIA TRI MANG a[%d] ",i);
        while( true){
            try {
                   a[i]= Integer.parseInt( sc.nextLine());
                   if(a[i]>0 && a[i]<100){
                    break;
                   }else{
                    System.err.println(" GIA TRI KHONG HOP LE HAY NHAP LAI");
                   }
                  
            } catch (Exception e) {
                System.out.println(" DU LIEU KHONG HOP LE VUI LONG NHAP LAI");
               
            }
        }
     }
    
     return a;
       
    }

    public static void hienThiMang(int a []){
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t"+ a[i]);
        }
    }

    public static void main(String[] args) {
        int a[]= nhapMang();
        System.out.println(" mang vua nhap la:");
        hienThiMang(a);
    }
    
}
