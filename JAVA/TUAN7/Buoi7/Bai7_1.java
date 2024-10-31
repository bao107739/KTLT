package JAVA.TUAN7.Buoi7;
import java.util.Scanner;



public class Bai7_1 {
    public static  float nhapSoThuc(){{
        Scanner sc = new Scanner(System.in);
        float  diem =0 ;
        while(true)
        try{
            System.out.println(" \nNhap diem:");
            diem = Float.parseFloat(sc.nextLine());
            if ( diem>=0 && diem <=10 )

            break;
            else{
                System.out.println(" diem vua nhap la");
            }
        }
        catch ( Exception ex ){
            System.out.println(" Diem khong hop le vui long nhap lai!!!!");
        }
        return diem ;

        }}
    
    
    public static void main ( String [] args){
        float diem = nhapSoThuc();
        
       
        System.out.println(" diem ban vua nhap la"+ diem );

    }
}


    

