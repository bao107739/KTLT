package TUAN12.Buoi12;                 //  CÂU 14  GIÁ TRI LỚN NHAT CUA BA SỐ

public class bai12_2 {
    public static int  tinhGiaTriLonNhatBaSo( int a, int b , int c){
        int max = a;
        if( b> max)
            max=b;
        if ( c>max)
        max= c;
        return max;
    }
     public static void main(String[] args) {
       int max = tinhGiaTriLonNhatBaSo( 5,7,9);
        System.out.println(" gia tri lon nhat cua ba so la"+ max );
     }
}
