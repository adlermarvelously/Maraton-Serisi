package maraton1;

public class Question3 {

	public static int karakterSayici(String metin, char harf) {
		int sayi = 0;

		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == harf)
				sayi++;
		}

		return sayi;

	}

	public static void main(String[] args) {

		System.out.println(karakterSayici("Bugün güzel bir gün ", 'g'));
		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));
	}

}
