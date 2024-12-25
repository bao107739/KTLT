package CODE_BT_PHAN2;
import java.util.Scanner;

public class CAU9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(" moi nhap vao so can tinh tong so le tu 1-->> n");
       // int so = sc.nextInt();
    //     while (true){

        
    //     if(so>=1){
    //         System.out.println(" dung dieu kien");
          //break;
    //     }
        
    //     else{
    //         System.out.println(" sai roi please moi nhap lai ");
    //         
    //     }
    // }
    int so;
    System.out.println(" moi nhap vao so can tinh tong so le tu 1-->> n");
        do{
            
             so = sc.nextInt();
             if(so>=1){
                        System.out.print(" dung dieu kien: ");
                      
                    }
                    
                    else{
                        System.out.print(" sai roi please moi nhap lai: ");
                       
                    }

        }while(so<1);                    // <<--do while điều ngược lại điều kiện bài toán
                                         // khi nhập sai thì nó cứ bắn ta nhập lại
        int tong = 0;
        for ( int i=1;i<= so ;i++){
            if (i%2!=0){
                tong = tong + i;
            }
            
        }
        System.out.println(" tong so le la ="+tong);
    }

    
}
