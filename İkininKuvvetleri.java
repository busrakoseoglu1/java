import java.util.Scanner;

public class ÝkininKuvvetleri {

	public static void main(String[] args) {

		/*
		 * Java döngüler ile girilen sayýya kadar olan 2'nin kuvvetlerini ekrana
		 * yazdýran programý yazýyoruz. 2^i
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayý giriniz : ");
		int sayi=scan.nextInt();
		
		for(int i=1;i<=sayi;i*=2) {
			System.out.println(i);
		}

	}

}
