package maraton1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int secim = 0;
		do {
			System.out.println("******************************");
			System.out.println("*                            *");
			System.out.println("*   GEOMETRİK HESAPLAYICI    *");
			System.out.println("*                            *");
			System.out.println("******************************");

			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz: ");
			System.out.println("1. Kare alan hesaplama\r\n" + "2. Kare çevre hesaplama\r\n"
					+ "3. Dikdörtgen alan hesaplama\r\n" + "4. Dikdörtgen çevre hesaplama\r\n"
					+ "5. Daire alan hesaplama\r\n" + "6. Daire Çevre hesaplama\r\n" + "7. Çıkış");
			secim = scanner.nextInt();

			switch (secim) {

			case 1:

				System.out.println("Lütfen karenin kenar uzunluğunu giriniz: ");
				int kenar = scanner.nextInt();
				int alanKare = kenar * kenar;
				System.out.println("Karenin alanı: " + alanKare);
				break;

			case 2:

				System.out.println("Lütfen karenin kenar uzunluğunu giriniz: ");
				int kenar1 = scanner.nextInt();
				int cevreKare = kenar1 * 4;
				System.out.println("Karenin çevresi: " + cevreKare);
				break;

			case 3:

				System.out.println("Lütfen dikdörtgenin birinci kenar uzunluğunu giriniz: ");
				int kenar3 = scanner.nextInt();
				System.out.println("Lütfen dikdörtgenin ikinci kenar uzunluğunu giriniz:");
				int kenar4 = scanner.nextInt();
				int alanDikdortgen = kenar3 * kenar4;
				System.out.println("Dikdörtgenin alanı: " + alanDikdortgen);
				break;

			case 4:

				System.out.println("Lütfen dikdörtgenin birinci kenar uzunluğunu giriniz: ");
				int kenar5 = scanner.nextInt();
				System.out.println("Lütfen dikdörtgenin ikinci kenar uzunluğunu giriniz:");
				int kenar6 = scanner.nextInt();
				int cevreDikdortgen = 2 * (kenar5 * kenar6);
				System.out.println("Dikdörtgenin çevresi: " + cevreDikdortgen);
				break;

			case 5:

				System.out.println("Lütfen dairenin yarıçap uzunluğunu giriniz: ");
				double yaricap = scanner.nextDouble();
				double alanDaire = 3.14 * yaricap * yaricap;
				System.out.println("Dairenin alanı: " + alanDaire);
				break;

			case 6:

				System.out.println("Lütfen dairenin yarıçap uzunluğunu giriniz: ");
				double yaricap2 = scanner.nextDouble();
				double cevreDaire = 2 * 3.14 * yaricap2;
				System.out.println("Dairenin çevresi: " + cevreDaire);
				break;

			default:
				System.out.println("Programdan çıkış yaptınız.");
				break;
			}

		} 
		while (secim != 7);

		scanner.close();

	}
}
