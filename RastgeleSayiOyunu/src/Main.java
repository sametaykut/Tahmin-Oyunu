import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("\nSayı Tahmin Oyunu");
		
		while(true) {
		int sayi = (int)(Math.random()*10+1);

		System.out.println("1 ile 10 (1 ve 10 da dahil) arasında bir sayi giriniz:");
		int tahmin = scanner.nextInt();
		if (tahmin >= 1 && tahmin <= 10  ) {
		if (tahmin == sayi ) {
			System.out.println("Sayiyi doğru tahmin ettiniz tebrik ederiz... Sayi = " + sayi);
			break;
		}
		else {
			System.out.println("Yanlış tahmin sayiyi tekrar giriniz :");
		}
		}
		else {
			System.out.println("Yanlış aralıkta sayı girdiniz...");
		}
	}	
	}
}