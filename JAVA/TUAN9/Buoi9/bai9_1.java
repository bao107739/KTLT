package TUAN9.Buoi9;
import java.util.Scanner;




public class bai9_1 {
    public static void tamGiac(){
        Scanner sc = new Scanner( System.in);
        System.out.println(" moi nhap chieu cao tam giac");
        int n = 10;
        for( int i= 1; i<=n;i++){
            for( int j =1; j<=i; j++  ){
                System.out.print("*");                      
            }
            System.out.println(      );
        }
    }





    public static void tamGiacNguoc(){
        Scanner sc = new Scanner( System.in);
        System.out.println(" moi nhap chieu cao tam giac");
        int h = sc.nextInt();
        for( int i= h; i>=1;i--){
            for( int k =1; k<=i; k++  ){
                System.out.print("*");                  
            }
            System.out.println();
        }
    }






    public static void hinhChuN(){
        int  so= 5;
        for( int i=1; i<= 5;i++){
            for(int j= 1;j<=5;j++){
                if(j==1|| j==5|| i==j ){

                System.out.print(i+""+j+"\t");
                }else{
                System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }

    }





    public static void hinhVuong(){
        int so = 5;
        for( int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               System.out.print(i+""+j+"\t");
               // System.out.printf("%d %d",i,j) ;      ==>> cách in ra khác      

            }
            System.out.println("");
        }
    }






    public static void kimTuThapSao(){
        int n = 4;
        for( int i = 1; i<=4;i++){
            for(int j=4 ;j>i;j--){
                System.out.print(" ");
            }
            for(int k =1; k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }    





    public static void kimTuThapSO(){
        for( int i = 1; i<=4;i++){
            for(int j=4 ;j>i;j--){
                System.out.print(" ");
            }
            for(int k =1; k<(i*2)/2;k++){
                System.out.print(+k);
            }
            for(int l =(2*i)/2;l>=1;l--){
                System.out.print(+l);
            }
            System.out.println("  ");
        }
    }    




    public static void kimTuThapNguocSo(){
        for (int i = 4; i >= 1; i--) { // Dòng từ trên xuống
            // In khoảng trắng
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // In số
            for (int  k =1; k<(i*2)/2;k++) {
                System.out.print(+k);
            }
            for(int l =(2*i)/2;l>=1;l--){
                System.out.print(+l);
            }
            // Xuống dòng
            System.out.println();
        }
    }


    








    public static void kimTuThapNguoc(){
        for (int i = 4; i >= 1; i--) { // Dòng từ trên xuống
            // In khoảng trắng
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // In dấu *
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng
            System.out.println();
        }
    }






    public static void chuB(){
        for (int i=1;i<=7;i++){
            for( int j=1;j<= 4;j++){
                if(i==1&&j==4 ||j==4 && i==7||i==4 && j==4){
                    System.out.print(""+"\t");
                }
               
                else if(j==1||j==4||i==1||i==7||i==4){ 
                
                System.out.print(i+" "+j+"\t");
                }
                else{
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        tamGiac();
        tamGiacNguoc();
        hinhChuN();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        hinhVuong();
        kimTuThapSao();
        kimTuThapSO();
        System.out.println("");
        System.out.println("");


        kimTuThapNguocSo();
        kimTuThapNguoc();


        System.out.println("");
        System.out.println("");
        chuB();
    }
    
}
