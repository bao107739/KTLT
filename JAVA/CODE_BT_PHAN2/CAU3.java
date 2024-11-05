package JAVA.CODE_BT_PHAN2;
import java.util.Scanner;


public class CAU3 {

    public static int tinhTong(){
        int so;
        do{
        
        Scanner sc = new Scanner( System.in);
        System.out.println(" moi nhap N");
         so= sc.nextInt();
        if ( so>0){
            System.out.println(" đk hop le");
        }
        else {
            System.out.println(" moi ban nhap lai");
        }
        }
        while(so<0);
        int tong=0;
        for ( int i=2;i<=so;i++){
            if ( i%2==0){
                tong= tong+i;

            }
        }
        return tong;
       
    }
    
    

public static void main (String[]args){
  int tong =tinhTong();
   
   System.out.println(" tong N so chẵn la "+ tong );
   
    }}
