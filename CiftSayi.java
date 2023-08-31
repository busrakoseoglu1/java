import java.util.Scanner;

public class CiftSayi {

	public static void main(String[] args) {

		/*
		 * Java döngüler ile kullanýcýnýn girdiði sayýya kadar çift olan sayýlarý bulan
		 * programý yazýyoruz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayý Giriniz :");
		int sayi = scan.nextInt();

		for (int i = 0; i <= sayi; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " , ");
			}
		}
	}

}
