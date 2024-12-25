package TUAN13.Buoi13;

import java.util.Scanner;

public class bai13_6test {
    public static int[] nhapMang() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println(" moi nhap vao so phan tu");
                n = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println(" du lieu nhap sai vui long nhập lại");
            }

        }

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("a["+i+"] là :");
                    a[i] = Integer.parseInt(sc.nextLine());
                    if (a[i] > 0 && a[i] < 100) {
                        break;
                    } else {
                        System.out.println(" du lieu nhap sai vui long nhap lai");
                    }

                } catch (Exception e) {
                    System.out.println(" du lieu nhap sai vui long nhap lai");

                }

            }
        }
        return(a);
    }

    public static void xuatMang(int  a[]){
        System.out.println(" cac phan tu ban vua nhap la");
        for( int i=0; i< a.length;i++){
        
        System.out.print(a[i]+"\t ");
        }
    }

    public static void timPhanTu(int a []){
        int nhatmang=-1,nhimang=-1, chisonhimang=-1;
        for( int i=0;i<a.length; i++){
        if( a[i]> nhatmang){
            nhimang=nhatmang;
            chisonhimang=i-1;
            nhatmang=a[i];
        }else if(a[i]< nhatmang && a[i]> nhimang){
            nhimang=a[i];
            chisonhimang=i;
        }
        }
        System.out.println(" SO LON THU 2 CUA MANG: "+nhimang);
        System.out.println(" chi so la:"+ chisonhimang);
    }


    public static void sapxepmanggiam(int a[]){
        for(int i=0;i<a.length;i++){
         for( int j=0;j<a.length-i-1;j++){
            if( a[j]<a[j+1]){
                int tam=a[j];
                a[j]= a[j+1];
                a[j+1]=tam;
            }
         }
        }
    }
    public static void xuatMangGiamDan(int  a[]){
        System.out.println(" cac phan tu ban vua nhap la");
        for( int i=0; i< a.length;i++){
        
        System.out.print(a[i]+"\t ");
        }
    }
   
    public static void chenX(int a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" moi nhap phan tu can chen ");
        int x = sc.nextInt();
        int viTri=a.length;
        
        // TÌM VỊ TRÍ X
        for (int i = 0; i < a.length; i++) {
            if (a[i] < x) {
                 viTri = i;
                 break;
            }
        }

        // sao chep mang
        int b[] = new int[a.length + 1];
        for( int j=0;j<a.length;j++){
            b[j]=a[j];
        }

        for( int i=viTri;i<a.length;i++){
          b[i+1]=a[i];
          
        }
        b[viTri]=x;     // GÁN GIÁ TRỊ X VÀO VỊ TRÍ
        // in mảng mới 
        System.out.println(" mang sau khi chen la");
        for( int i=0;i< b.length;i++){
            System.out.print(b[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int a[]= nhapMang();
        xuatMang(a);
        timPhanTu(a);
        //b
        sapxepmanggiam(a);
        xuatMangGiamDan(a);
        //
        chenX(a);
    }
}