  /* Bài 33. Viết chương trình thực hiện các thao tác sau đối với một chuỗi cho trước
a. Đếm số lượng từ ‘Java’ có trong chuỗi.
b. Lấy vị trí của từ ‘Java’ cuối cùng có trong chuỗi.
c. Thay thế từ ‘Java’ bằng từ ‘java’ trong chuỗi.
d. Đếm số lượng ký tự là số có trong chuỗi. */
package TUAN13.Buoi13;
import java.util.Scanner;
public class cau33 {
    //a. Đếm số lượng từ ‘Java’ có trong chuỗi.
    public static int demSoluongTu(String nhapchuoi,String timTu){
        int dem=0;
       String[] arr= nhapchuoi.split("\\s+");
       for( int i=0;i< arr.length;i++){
            if (arr[i] .toLowerCase().equals(timTu)) {
                dem++;
            }   
    }
return dem;

    }

    // b. Lấy vị trí của từ ‘Java’ cuối cùng có trong chuỗi.
    public static void timViTri( String nhapChuoi, String timTu){
        int vitri=0;
        boolean tam = false;
        String [] arr= nhapChuoi.split("\\s+");
        for( int i= 0; i< arr.length;i++){
            if(arr[i].equals(timTu)){
                vitri=i;
                tam = true;
            }
            
        }
        if(tam){
            System.out.println("vi tri cua tu la:"+vitri);
        }else{
            System.out.println("tu do khong co  tronog chuoi");
        }
    }


    //c. Thay thế từ ‘Java’ bằng từ ‘java’ trong chuỗi.
    public static void thayTheTuTrongChuoi( String nhapChuoi, String tuThayThe){
        String arr []= nhapChuoi. split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].toLowerCase().equals(tuThayThe)){
                arr[i] = tuThayThe;
            }
        }
        System.out.println(" chuoi sau khi thay the la ");
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }


    //d. Đếm số lượng ký tự là số có trong chuỗi.
    public static int demKyTuSoTrongChuoi( String nhapChuoi){
        int soLuong= 0;
        for( int i=0; i<nhapChuoi.length();i++){
            if( nhapChuoi.charAt(i)>='0'&&nhapChuoi.charAt(i)<='9'){
               soLuong++;
            }

        }
        return soLuong;
    }
    public static void main(String[] args) {
        // CAU A 
        Scanner sc = new Scanner ( System.in);
        System.out.println(" moi nhap chuoi");
        String nhapChuoi= sc.nextLine();
        System.out.println(" moi nhap tu can tim ");
        String timTu=sc.nextLine();
        System.out.println(" so tu co trong chuooi la"+ demSoluongTu(nhapChuoi,timTu));
        // B
        timViTri("hao hao","bao");


        // CAU B
        //System.out.println(" vi tri cua tu cuoi cung la "+timViTri( nhapChuoi,timTu));

        thayTheTuTrongChuoi(nhapChuoi,timTu);
        // CAU C 
        System.out.println(" so luong so xuat hien trong chuoi la "+demKyTuSoTrongChuoi(nhapChuoi) );
    }
}
