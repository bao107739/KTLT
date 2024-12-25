// Bài 6. Viết chương trình tính S = 4! + 5! + 7! + 9!
package CODE_BT_PHAN2;
public class CAU6 {
    public static long tinhGiaiThua(int n){
        int kq=1;
        for( int i = 1; i<=n ; i++){
            kq=kq*i;
        }
        return kq;
    }


    public static long tinhTongGiaiThua( int a ,int b ,int c, int d){
        long tong =0;
        tong= tinhGiaiThua(a)+ tinhGiaiThua(b)+tinhGiaiThua(c)+tinhGiaiThua(d);
        return tong;
    }



    public static void main(String[] args) {
        System.out.println("Tinh S= 4!+5!+7!+9! = "+tinhTongGiaiThua(4,5,7,9) );
    }
    
}
