/*Bài 18. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố. Ví dụ: Số
28 được phân tích thành 2 x 2 x 7. */
package CODE_BT_PHAN2;

public class CAU18 {
    public static void phanTichThuaSO(int so) {
        boolean nhan = true;
        System.out.print(so + " =");
        int i = 2;

        while (so > 1) {
            if (nhan == false) {
                System.out.print("*");

            }
            if (so % i == 0) {
                System.out.print(i);
                so = so / i;
                nhan = false;
            } else {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        phanTichThuaSO(8);

    }
}
