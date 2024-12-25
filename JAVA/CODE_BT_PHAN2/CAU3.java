                  /*Bài 3. Viết chương trình tính tổng các số chẵn từ 2 đến N (nguyên dương, nhập từ bàn
                     phím). */
                  package CODE_BT_PHAN2;

                  import java.util.Scanner;

                  public class CAU3 {

                      public static int tinhTongSoChan(int num) {
                          int tong = 0;
                          for (int i = 2; i <= num; i++) {
                              if (i % 2 == 0) {
                                  tong += i;
                              }

                          }
                          return tong;
                      }

                      public static int nhapSoNguyen() {
                          Scanner sc = new Scanner(System.in);
                          int num = 0;
                          while (true) {
                              try {
                                  System.out.print(" nhap gia tri");
                                  num = Integer.parseInt(sc.nextLine());
                                  sc.close();
                                  return num;
                              } catch (Exception e) {
                                  System.out.println(" du lieu nhap khong dung hay nhap lai");
                              }
                          }
                      }

                      public static void main(String[] args) {
                          int tan = nhapSoNguyen();
                          int tongcacso = tinhTongSoChan(tan);

                          System.out.println("tong các so chan la: " + tongcacso);
                      }
                  }
