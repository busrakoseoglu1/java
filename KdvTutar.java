import java.util.Scanner;

public class KdvTutar {

	public static void main(String[] args) {
		
		/* �dev E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000
		 * TL'den b�y�k ise KDV oran�n� %8 olarak KDV tutar� hesaplayan program�
		   yaz�n�z*/

		Scanner scan = new Scanner(System.in);

		System.out.print("Hesaplanacak tutar� giriniz : ");
		int sayi = scan.nextInt();

		double kdv;

		if (sayi <= 1000 && sayi >= 0) {
			kdv = 0.18;
			System.out.println("KDV'siz fiyat : " + sayi);
			System.out.println("KDV oran� : " + kdv);
			System.out.println("KDV'li fiyat : " + (sayi + (sayi * kdv)));
			System.out.println("KDV tutar� : " + sayi * kdv);

		} else {
			kdv = 0.08;
			System.out.println("KDV'siz fiyat : " + sayi);
			System.out.println("KDV oran� : " + kdv);
			System.out.println("KDV'li fiyat : " + (sayi + (sayi * kdv)));
			System.out.println("KDV tutar� : " + sayi * kdv);

		}

	}

}
