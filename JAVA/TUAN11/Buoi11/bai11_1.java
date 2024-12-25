package JAVA.TUAN11.Buoi11;
import java.util.Scanner;

public class bai11_1 {
    // BÀI 2 KIÊM TRA TAM GIÁC
    public static void kiemTraTamGiac( double a , double b, double c){
        if(  a+b>c && a+c>b && c+b>a){
            if( a==b && b==c){
                System.out.println(" tam giac deu");
            }
            else if(  a*a+b*b==c*c||a*a+c*c==b*b || c*c+b*b==a*a){
                if(a==b||b==c||c==a){
                    System.out.println(" tam giac vuông cân");
                }
                else{
                    System.out.println(" tam giac vuông");
                }
                
                
            }
            else if ( a==b|| b==c||c==a){
                System.out.println(" tam giac can");
            }else{
                System.out.println(" tam giac thuong");
            }
        }

        
        else{
            System.out.println(" ba gai tri a,b,c khong phai la tam giac");
        }

        


    }


   public static void main(String[] args) {
    System.out.println(" moi nhap  a, b, c");
    kiemTraTamGiac(1,2,10);
    
   } 
}
