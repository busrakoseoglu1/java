import java.util.Scanner;

public class CiftSayi {

	public static void main(String[] args) {

		/*
		 * Java d�ng�ler ile kullan�c�n�n girdi�i say�ya kadar �ift olan say�lar� bulan
		 * program� yaz�yoruz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Say� Giriniz :");
		int sayi = scan.nextInt();

		for (int i = 0; i <= sayi; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " , ");
			}
		}
	}

}
