         // BÀI TẬP :  HIỂN THỊ SỐ ĐẢO NGƯỢC

package TUAN13.Buoi13;

public class bai13_2 {
    public static void hienThiSoDaoNguoc(int so ){
      int sogoc= so;
      int  sodaonguoc =0;
      while(so>0){
        int chusocuoi= so % 10;
        sodaonguoc= sodaonguoc*10+chusocuoi ;    
        so/=10;
    }
    System.out.println(" so dao nguoc la"+sodaonguoc);

}
 public static void main(String[] args) {
    hienThiSoDaoNguoc(123);
 }
}