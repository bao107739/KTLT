package TUAN13.Buoi13;

public class bai13_8ontap {
    public static void sapXepTangDan(int a[][]){
        for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a.length-1;k++){
                    if( a[k][j]>a[k+1][j]){
                        int tam=a[k][j];
                        a[k][j]= a[k+1][j];
                        a[k+1][j] =tam;
                    }
                }
             }
        }
        for( int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] a = {
            {3, 1, 4,4},
            {2, 8, 5,9},
            {7, 6, 9,8}
            
        };
    
        System.out.println("Mảng trước khi sắp xếp:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    
        System.out.println("\nMảng sau khi sắp xếp tăng dần:");
        sapXepTangDan(a);
    }
    
}
