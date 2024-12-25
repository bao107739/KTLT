/*Bài 10. Viết chương trình sắp xếp mảng các số nguyên theo chiều {giảm dần} giá trị các phần
tử. */
package CODE_BT_PHAN2;

public class CAU10 {
    public static int[] sapXepMangTangDan(int  a[]){
        for( int i=0; i< a.length-1;i++){
            for(int j =0;j< a.length-i-1;j++){
                if( a[j]>a[j+1]){
                    int tam= a[j];
                    a[j]=a[j+1];
                    a[j+1]= tam;
                }
            }
           
        }
        return(a);
    } 



    public static void hienThiMang(int a[]){
        for( int i= 0; i<=a.length-1;i++){
            System.out.print(a[i]+"\t");
        }
    }


    public static void main(String[] args) {
       int  a[]={-1,2,-4,5,1};
       hienThiMang(a);
       System.out.println("");
       sapXepMangTangDan(a);
       hienThiMang(a);
    }
}
