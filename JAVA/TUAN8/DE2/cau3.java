package JAVA.TUAN8.DE2;

public class cau3 {
    public static void inaCacPhanTuTRongMang(int b[]){
       
          for (int i=0;i<b.length;i++){
            System.out.println(b[i]);


          }
    }

public static void giaTriNhoNhatMangb(int b[]){
  int min=5;
  for(int i=0;i<b.length;i++){
    if(b[i]< min){
      System.out.println(min);
    }
  }
}


  public static void main(String[] args) {
    int b [] = {3, 5, 6, 8, 10, 14, 17, 19, 20};
    inaCacPhanTuTRongMang(b);
    giaTriNhoNhatMangb(b);
  }
    
}
