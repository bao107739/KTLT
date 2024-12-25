//Bài 19. Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
package CODE_BT_PHAN2;

public class CAU19 {
    public static boolean kiemTraSoNguyenTo(int so){
        boolean nt = true;
        if(so==0||so==1){
        return false;
        }
        int i=2;
        int tam = (int)Math.sqrt(so);
        while(i<=tam){
            if(so%i==0){
                nt=false;
                break;
            }
            i++;
        }
        
           return nt;
    }
    public static void lietKeSoNguyenTo(int n) {
        System.out.println("Các số nguyên tố nhỏ hơn " + n + " là:");
        for (int so = 2; so < n; so++) { // Bắt đầu từ 2
            if (kiemTraSoNguyenTo(so)==true) {
                System.out.print(so + " ");
            }
        }
    }

    public static void main(String[] args) {
        lietKeSoNguyenTo( 7);
    }
    
    
}
