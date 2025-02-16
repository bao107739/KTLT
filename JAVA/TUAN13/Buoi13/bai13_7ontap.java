package TUAN13.Buoi13;

import java.util.Scanner;

public class bai13_7ontap {
    // SÔ HOÀN HẢO
    /*Bài 27. Số hoàn hảo là số bằng tổng các ước thực sự của nó. Ví dụ: 6 = 1+2+3. Viết chương
trình kiểm tra số nguyên dương n nhập vào từ bàn phím có phải là số hoàn hảo không. */
// public static void soHoanHao(){
//     Scanner sc= new Scanner ( System.in);
//     System.out.println(" moi ban nhap so muon kiem tra so HH");
//     int n=Integer.parseInt(sc.nextLine());
//     int sogoc=n;
//     int tong=0;
//     for(int i=1;i<n;i++){
//         if(n%i==0){
//             tong=tong+i;
//         }
//     }
//         if( tong==sogoc){
//             System.out.println(sogoc+"là so hoan hao");

//         }
//         else{
//             System.out.println(sogoc+"khong phai la so hoan hao");
//         }
// }
public static boolean kiemTraSo(int so){
   
    
    int tong =0;
    for(int i=1;i<so;i++){
        if( so%i==0){
            tong=tong+i;
        }
    }
    if( tong==so){
        return true;
    }
return false;
}
public static void soHoanHao(int so){
    for(int i=1;i<so;i++){
        if(kiemTraSo(i)){
            System.out.println(i+" la so hoan hao");
        }
    }
}


public static void main(String[] args) {
    soHoanHao(1000);
}
}
