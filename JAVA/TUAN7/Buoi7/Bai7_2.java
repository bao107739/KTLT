package JAVA.TUAN7.Buoi7;
import java .util.Scanner;

public class Bai7_2 {
    public static float nhapSoTuoi(){
        Scanner sc = new Scanner( System.in);
        float tuoi =0;
        while(true){
        try{
            System.out.println(" moi nhap tuoi cua ban");
            tuoi = Float.parseFloat(sc.nextLine());
            if ( tuoi >= 1 && tuoi<= 100){
            break;
            }
            else {
                System.out.println(" moi nhap laij tuoi cua ban");
            }}
                catch( Exception ex ){
                System.out.println(" BAN DA NHAP LOI VUI LONG NHAP LAI...");
             
                 
        }
   

    }
    return tuoi ;
}
public static void main ( String [] args){
    float tuoi = nhapSoTuoi();
    System.out.println(" in ra tuoi cua ban la"+ tuoi);

}
    
}
