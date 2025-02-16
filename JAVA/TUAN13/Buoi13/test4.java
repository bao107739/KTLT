package TUAN13.Buoi13;

import java.util.Scanner;

public class test4 {
    public static void viTriDaiNhat(String a){
        int vt = 0;
        int vtc = 0;
        String text="";
        String tamText = "";
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!=32 && a.charAt(i)!=92){
                vt = i;
                for(int j = i;j<a.length();j++){
                    if(a.charAt(j)==32 || a.charAt(j)==92){
                        break;
                    }
                    text += a.charAt(j);
                }
                if(text.length()>tamText.length()){
                    tamText = text;
                    vtc=vt;
                   }
            }
            text="";
        }
        System.out.println("Vi tri cua tu dai nhat bat dau tu "+(vtc+1));
        System.out.println("Tu dai nhat la "+tamText);
        System.out.println("Chieu dai cua tu dai nhat la "+tamText.length());
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a= sc.nextLine();
    viTriDaiNhat(a);
}
}