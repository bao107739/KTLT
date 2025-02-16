package OPP.Buoi2;

import java.util.Scanner;

public class bai2_1 {
    static double diem []= new double[ 100];
     static String ten []= new String[100];
     static int n;
    
    public static void main(String[] args) {
        nhap();
        sapXep();
        in();
        
    }
    private static void in (){
        for( int i=0;i<n;i++){
            System.out.println("ten:"+ten[i]+" ,diem:"+diem[i]);
        }


    }

    private static void sapXep() {
        for( int i=0;i<n;i++){
            for( int j=i+1;j<n;j++){
                if(diem[i]< diem[j]);
                // sap xep diem
                double temp= diem[i];
                diem[i]=diem[j];
                diem[j]=temp;

                // sắp xếp tên
                String t=ten[i];
                ten[i]= ten[j];
                ten[j]=t;
            }
        }

    }

    private static void nhap(){
        Scanner sc= new Scanner ( System.in);
        System.out.println(" nhap so luong sinh vien n=");
        n= Integer.parseInt(sc.nextLine());
        for( int i=0; i<n;i++){
            System.out.print(" nhap ten sinh vien :");
            ten[i]= sc.nextLine();
            System.out.println(" nhap diem sv:");
            diem[i]=Double.parseDouble(sc.nextLine());
        }


    }
    


    
}
