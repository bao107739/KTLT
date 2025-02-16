package TUAN13.Buoi13;
import java.util.Scanner;
public class bai13_9ontap {
    public static int [][]  nhapMang(){
        int hang; 
        int cot;
        Scanner sc = new Scanner( System.in);
        while (true){
            try {
                System.out.println(" moi nhap hang va cot");
                hang=Integer.parseInt(sc.nextLine());
                cot=Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println(" DU LIEU NHAP SAI VUI LING NHAP LAI");
            }
        }
        // khởi toạ ma trận với kích thước hang x cột
        int [][ ] a = new int  [hang][cot];
        for( int i=0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                while (true){
                    try {
                        System.out.print("a["+i+"]"+"["+j+"]\t");
                        a[i][j]=Integer.parseInt(sc.nextLine());
                        if( a[i][j]>0 && a[i][j]<100){
                            break;
                        }

                    } catch (Exception e) {
                       System.out.println(" DU LIEU NHAP SAI VUI LONG NHAP LAI");
                    }
                }
            }
        }
        return a;

    }

    public static void xuatMaTran(int a [][]){
        for( int i=0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
    }
             System.out.println();
}
    }
    public static void main(String[] args) {
        int a[][]= nhapMang();
        xuatMaTran(a);
    }
}
