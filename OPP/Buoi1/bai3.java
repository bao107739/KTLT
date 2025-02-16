package OPP.Buoi1;

import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void  playTaiXiu( int soYour){
        Random rd= new Random();
        int soNgauNhien=rd.nextInt(0,2);
        if( soYour==soNgauNhien){
            System.out.println("----- CHUC MUNG BAN DA DOAN TRUNG -----");
            System.out.println(" chon phan qua cua ban");
        }else{
            System.out.println(" CHUC BAN MAY MAN LAN SAU");
        }


    }

    public static void main(String[] args) {
        
        System.out.println(" nhan robot");
        System.out.println(" 500.000 vnd");
        System.out.println(" motorbike");
        System.out.println(" nhan mot xe o to");


        System.out.println(" moi chon 0 cho TAI &&  1 cho  XIU");

        Scanner sc= new Scanner ( System.in);
        int soYour= Integer.parseInt(sc.nextLine());
        playTaiXiu(soYour);
    }
    
}
