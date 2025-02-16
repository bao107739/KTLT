package OPP.Buoi2;
import java.util.ArrayList;
import java.util.Scanner;

public class bai2_2 {
    static ArrayList<Double> a= new ArrayList<>();
    public static void main(String[] args) {
        nhap();
        sapXep();
        in();
    }
    private static void in (){
         // cách 1: dung for index
        
         for( int i=0; i< a.size();i++){
            System.out.print(""+a.get(i));
         }
 System.out.println();
 
 // cách 2: dùng for each

 for(Double x:a){
     System.out.println(""+x);
    }
    System.out.println();
}

    private static void sapXep(){
        // cách 1: dung for index
        double s1=0;
        for( int i=0; i< a.size();i++){
            s1+=a.get(i);// không dung a[i]

        }
System.out.println(" tong theo cach 1 la:"+s1);

// cách 2: dùng for each
double s2=0;
for(Double x:a){
    s2+=x;
}
System.out.println(" tong theo cách s2 la:"+ s2);
    }
    

    private static void nhap(){
         Scanner sc= new Scanner ( System.in);
         while (true){
            System.out.println(" nhao so( enter=ketthuc):");
            String s= sc.nextLine();
            if( s.isEmpty()) break;
            double n=Double.parseDouble(s);
            a.add(n);
         }


    }
}
