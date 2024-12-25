package TUAN12.Buoi12;
                               // BÀI 27 SỐ HOÀN HẢO
import java.util.Scanner;

public class bai12_4 {
    public static boolean kiemTraSoHoanHao( int num){
        int tong =0;
        for(int i= 1; i<= num/2; i++){
            if ( num %i== 0)
            tong+=i;
        }
        return tong== num;
    }


    public static void xuatUocSoHoanHao( int num ){
        int tam=0;
        if( kiemTraSoHoanHao(num)){
            System.out.printf(" %d la so hoan hao va cac uoc so cua %d la:",num,num);
            for( int i=1; i<num; i++){
                if(num%i==0){
                    System.out.print("\t"+i);
                    tam+=i;
                    if( tam== num)
                    break;
                }
            }
            
            }
            else{
                System.out.printf("%d khong phai la so hoan hao",num);
        }
    }


    
    public static void main(String[] args) {
      //  Scanner sc = new Scanner( System.in);
      // int num= sc. nextInt();
       xuatUocSoHoanHao( 100);
    }
    
}
