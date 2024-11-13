package JAVA.TUAN4.Buoi4;

public class Kiemtra {
    public static void main(String[] args) {
		int mangC [][][] = {{{5,2,3},{4,5,6,7,8},{7,8}},{{5,6,7,3},{8,9}}};
System.out.println(" IN ra phan tu cua mang mà KHONG DUNG FOR:");
		System.out.println(" phan tu in ra la:"+ mangC [0][0][0]);
		System.out.println(" phan tu in ra la:"+ mangC [0][0][1]);
		System.out.println(" phan tu in ra la:"+ mangC [0][0][2]);

		System.out.println(" phan tu in ra la:"+ mangC [0][1][0]);
		System.out.println(" phan tu in ra la:"+ mangC [0][1][1]);
		System.out.println(" phan tu in ra la:"+ mangC [0][1][2]);
		System.out.println(" phan tu in ra la:"+ mangC [0][1][3]);
		System.out.println(" phan tu in ra la:"+ mangC [0][1][4]);

		System.out.println(" phan tu in ra la:"+ mangC [1][0][0]);
		System.out.println(" phan tu in ra la:"+ mangC [1][0][1]);
		System.out.println(" phan tu in ra la:"+ mangC [1][0][2]);
		System.out.println(" phan tu in ra la:"+ mangC [1][0][3]);

		System.out.println(" phan tu in ra la:"+ mangC [1][1][0]);
		System.out.println(" phan tu in ra la:"+ mangC [1][1][1]);
		
		
		System.out.println(" IN ra phan tu mang DUNG FOR :");
		for (int i=0; i<mangC.length;i++) {

			for (int y=0; y<mangC[i].length ;y++) {
				for (int l=0; l<mangC[i][y].length;l++){
					System.out.println("phan tu in ra la la: "+ mangC[i][y][l]);
		}
        
	}
	}
	System.out.println(mangC[0].length);

		}

		
		
		
}
