package CODE_BT_PHAN2;

public class CAU19test {
    public static boolean kiemTraCacSonguyenTo(int so){
        boolean nt = true;
        if(so==0 || so==1){
            return false;
        }
        int i = 2;
        int tam = (int)Math.sqrt(so);
        while(i<=tam){
            if(so%i==0){
              nt= false;
              break;
            }
            i++;
        }

    
    return nt;
}



public static void lietKeCacSoNguyenTo(int n){
    for(int so=2;so<n;so++){
        if(kiemTraCacSonguyenTo( so)== true){
            System.out.print(so+" ");
        }
    }

}
public static void main(String[] args) {
    lietKeCacSoNguyenTo(75);

  }
}
