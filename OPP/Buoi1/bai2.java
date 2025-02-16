package OPP.Buoi1;

import java.util.Scanner;


public class bai2 {
    public static int soTienThanhToan(int so){
        Scanner sc= new Scanner ( System.in);
        int tien=0;
        System.out.println(" suat an cua ban la ");
        int soDon= sc.nextInt();
        if( so==1){
        
            tien= soDon*300000;
        }else if( so==2){
            tien=soDon* 400000;
        }else{
            tien=soDon* 500000;
        }
       return tien;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner ( System.in);
        System.out.println(" ----MOI QUY KHACH CHON THUC DON---- ");
      
        System.out.println(" 1: Bun dau man tom");
        System.out.println(" 2: Lau thai chua cay");
        System.out.println(" 3: Keo dong");
        System.out.print(" select number food\t");
        int so= sc.nextInt();


        switch (so) {
            case 1:{
                System.out.print(" so tien ban can pay la:"+soTienThanhToan(so)+" vnd");
                break;
            }
            
               case 2:{
                System.out.print(" so tien ban can pay la:"+soTienThanhToan(so)+" vnd" );
                break;
               } 
              case 3:{
                System.out.print(" so tien ban can pay la:"+soTienThanhToan(so)+" vnd");
                break;
              }
        
            default:
                System.err.println(" moi chon lai mon");
        }
    }
    
}
