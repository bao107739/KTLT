package CODE_BT_PHAN2;
import java.util. Scanner;

// Bài 27. Số hoàn hảo là số bằng tổng các ước thực sự của nó. Ví dụ: 6 = 1+2+3. Viết chương
//trình kiểm tra số nguyên dương n nhập vào từ bàn phím có phải là số hoàn hảo không

public class CAU27 {
    public static void timSoHoanHao(){
        Scanner sc = new Scanner( System.in);
        System.out.println(" MOI NHAP SO N");
        int n= sc.nextInt();
        int tong=0;
        for( int i=1;i<=n/2; i++){
            if( n%i==0){
                tong= tong+i;
                
            }
        }
             if( tong==n){
                System.out.printf(" so %d là so hoan hao ",n);
                for( int i=1;i<=n/2; i++){
                    if( n%i==0){
                        System.out.print(" "+i);}  
                      }
                }else{
                System.out.printf(" so %d  khong phai  là so hoan hao",n);
             }

    }
             
   
    public static void main(String[] args) {
        timSoHoanHao();
    }
}
