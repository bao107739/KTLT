package JAVA.TUAN8.DE2;

public class cau2 {
    public static void hienThiCacPhanTuMang(double a[][]){       // (double a[][]) khai báo biến a là biến toàn cục
                                                                 
        for(int i=0;i<a.length;i++){
            for(int y=0;y<a[i].length ;y++)
                System.out.printf("a[%d][%d]=%.2f\t" ,i,y,a[i][y]);
            
        }
 
    }
    public static void main(String[]args){
        double  a [][] = {{5.5, 2.4, 3.8}, {6.5, 9.5}, {7.8, 8.0}};
      hienThiCacPhanTuMang(a);
    }
    
}
