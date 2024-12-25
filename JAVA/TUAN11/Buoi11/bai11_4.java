package TUAN11.Buoi11;

public class bai11_4 {
    public static void sapXepMangTangDan(int a[]){
      System.out.println(" mang sau khi sap xep tang dan la");
       for(int i=0 ; i<a.length-1;i++){
          for(int j =0; j<a.length-i-1;j++){
          if (a[j]>a[j+1]){
                int tam = a[j];
                a[j]= a[j+1];
                a[j+1]=tam;
            }
          }
       }
       xuatMang(a);
    }
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      
        int[] a = { -1,2,-4,5,1 };

        // Xuất mảng ban đầu
        System.out.println("Mảng ban đầu:");
        xuatMang(a);

        // Gọi phương thức sắp xếp
        sapXepMangTangDan(a);
    }
}
