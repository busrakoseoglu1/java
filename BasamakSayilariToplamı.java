import java.util.Scanner;

public class BasamakSayilariToplamı {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayı giriniz : ");
		int number = scan.nextInt();
		int result = 0, basDegeri;
		while (number != 0) {
			basDegeri = number % 10;
			number /= 10;
			result += basDegeri;
		}
		System.out.println("Cevap : " + result);

	}

}
