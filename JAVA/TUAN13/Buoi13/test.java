package TUAN13.Buoi13;
import java.util.Scanner ;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println(" nhạp chuoi cua ban");
        String chuoi= sc.nextLine();    
        int dem =0;
        for(int i=0;i< chuoi.length();i++){
            if ( chuoi.charAt(i)>='0' && chuoi.charAt(i)<='9'){
             dem= dem+1;
            }
        }
          System.out.println(" so ky tu co so la "+ dem);
    
}
}