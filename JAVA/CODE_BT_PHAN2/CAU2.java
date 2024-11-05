package JAVA.CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU2 {
    public static void TestTamGiac(){
     Scanner sc =new Scanner(System.in);
     float Canh1,Canh2,Canh3;
     do{
        System.out.print("nhap canh tam gaic thu nhat: ");
         Canh1= sc.nextFloat();
     }while(Canh1<=0);
     
     
      do {
        System.out.print("nhap canh tam gaic thu hai: ");
      Canh2= sc.nextFloat();
      } while (Canh2<=0);
      do {
        System.out.print("nhap canh tam gaic thu ba: ");
      Canh3= sc.nextFloat();
      } while (Canh3<=0);
       
      if(Canh1+Canh2>Canh3 && Canh2+Canh3>Canh1 && Canh1+Canh3>Canh2){
        if(Canh1*Canh1+Canh2*Canh2==Canh3*Canh3 
        || Canh2*Canh2+Canh3*Canh3==Canh1*Canh1 ||
        Canh3*Canh3+Canh1*Canh1==Canh2*Canh2
        
        ){
           
            if(Canh1==Canh2 || Canh2==Canh3 || Canh1==Canh3 ){
                System.out.println("la tam giac vuong can.");
        }
        else{
            System.out.println("la tam giac vuong.");
        }
    }
        else if(Canh1==Canh2 && Canh2==Canh3){
            System.out.println("la tam giac deu.");
        }
        else if(Canh1==Canh2 || Canh2==Canh3 || Canh1==Canh3 ){
            System.out.println("la tam giac can.");
        }
        else{
            System.out.println("la tam giac thuong.");
        }
      }
     else{
        System.out.println("khong phai la tam giac.");
     }


    }
    public static void main(String[] args) {
        TestTamGiac();
    }
}
