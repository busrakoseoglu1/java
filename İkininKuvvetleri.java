import java.util.Scanner;

public class �kininKuvvetleri {

	public static void main(String[] args) {

		/*
		 * Java d�ng�ler ile girilen say�ya kadar olan 2'nin kuvvetlerini ekrana
		 * yazd�ran program� yaz�yoruz. 2^i
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Say� giriniz : ");
		int sayi=scan.nextInt();
		
		for(int i=1;i<=sayi;i*=2) {
			System.out.println(i);
		}

	}

}
