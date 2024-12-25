package TUAN8.Buoi8.DE1;

public class cau2 {
    public static void hienThiPhanTuMin5(){
      int  b [] = {3, 5, 6, 8, 10, 14, 17, 19, 20};
      int phanTu =5 ;
      for(int i=1;i<b.length;i++){   // b.length số lượng phần tử
          if(b[i]>phanTu){
            System.out.println(b[i]);
    
          }

      }


    }
    public static void main(String[] args) {
        System.out.println("  các phần tử lớn hơn 5 trong mảng b là ");
        hienThiPhanTuMin5();

    }

}
