package OPP.Buoi1;

import java.util.Random;
import java.util.Scanner;
public class bai1 {
    public static int [] nhapMang (){
        Random rd= new Random();
        Scanner sc= new Scanner ( System.in);
        System.out.println(" moi ban nhap vao so luong phan tu");
        int n=Integer.parseInt(sc.nextLine());
        int a[]= new int [n];
        for( int i=0;i<a.length;i++){
            System.out.print(" a["+i+"]=");
            a[i]= rd.nextInt(0,51); 
            System.out.print(a[i]+" \t");  
             }
         
          return a;
    }
    public static void main(String[] args) {
       
     
        nhapMang();
    }
    }
   
