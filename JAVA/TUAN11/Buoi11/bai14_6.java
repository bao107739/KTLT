package JAVA.TUAN11.Buoi11;
// tính S= 4!+5!+7!+9!



public class bai14_6 {
    public static long tinhGiaiThua(int n){
        long kq = 1;
        for( int i =1; i<=n;i++){
            kq = kq*i;
        }
        return kq;
    }
    public static  long tinhTongGiaiThua(int a, int b, int c, int d){
        long  tong = 0;
         tong =tinhGiaiThua(a)+tinhGiaiThua(b)+tinhGiaiThua(c)+tinhGiaiThua(d);
        return tong;
    }
    public static void main(String[] args) {
        
        System.out.println(" tinh tong cua S= 4!+5!+7!+9! is " + tinhTongGiaiThua(4,5,7,9));
    }
}
