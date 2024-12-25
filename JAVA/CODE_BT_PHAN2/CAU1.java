                               //Bài 1. Viết chương trình giải phương trình bậc 2.
package CODE_BT_PHAN2;
import java.util.Scanner;

public class CAU1 {
    public static void nghiemPTBacHai (){
        double a,b,c,x1,x2,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println(" MOI NHAP SO a");
        a=sc.nextDouble();
        System.out.println(" MOI NHAP SO b");
        b=sc.nextDouble();
        System.out.println(" MOI NHAP SO c");
        c=sc.nextDouble();
        delta = Math.pow(b,2)-4*a*c;


        if( a==0){
            System.out.println(" NHAP DU LIEU SAI !!!!!");
        }else{
            if( delta<0){
                System.out.println(" PHUONG TRINH VO NGHIEM");
            }else if ( delta==0){
                x1= -b/(2*a);
                System.out.println("PHUONG TRINH CO NGHIEM KEP x1=x2="+ x1);
            }else{
                System.out.println(" PHUONG TRINH CO 2 NGHIEM PHAN BIET");
                x1 = (-b - Math.sqrt(delta))/2*a;
                x2 = (-b +Math.sqrt(delta))/2*a;
            }
        }


    }
    
    public static void main(String[] args) {
        nghiemPTBacHai ();

        
    }
}
