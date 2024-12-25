package CODE_BT_PHAN2;

import java.util.Scanner;

public class CAU30test {
     public static void  kiemTraSoDoiXuung(){
        Scanner sc= new Scanner ( System.in);
        int so = sc. nextInt();
        String songuoc= "";
        int sogoc= so;
        
        while (so>0){
            int  chusocuoi=so % 10;
             songuoc = songuoc+chusocuoi;
             so= so/10;
        }
        int  somoi = Integer.parseInt(songuoc);
        if( somoi== sogoc){
            System.out.print(" SO BAN VUA NHAP LA SO DOI XUNG");

        }else{
            System.out.println(" SO BAN VUA NHAP KHONG PHAI LA SO DOI XUNG");
        }
    }


    public static void main(String[] args) {
        kiemTraSoDoiXuung();
        
    }
    
}

    

