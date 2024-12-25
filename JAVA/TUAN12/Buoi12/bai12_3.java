package TUAN12.Buoi12;

public class bai12_3 {
    public static int [] sapXepMangGiamDan( int a []){
        for(int i=0 ; i<a.length-1;i++){
            for(int j =0; j<a.length-i-1;j++){
            if (a[j]<a[j+1]){
                  int tam = a[j];
                  a[j]= a[j+1];
                  a[j+1]=tam;
              }
            }
         }
         return (a);
    }


    public static void hienThiMang(int a []){
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t"+ a[i]);
        }
    }
    public static void main(String[] args) {
        int a [ ]={1,-4,5,10,6,9};
        hienThiMang(a);
        
        sapXepMangGiamDan( a);
        System.out.println("");
        hienThiMang(a);

    }
}
