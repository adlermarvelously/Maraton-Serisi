package maraton1;

public class Question2 {

	public static void tekrarEdenSayi(int array[]) {
		int sayac = 1;
		int tekrar = 0;
		int tekrarEdenler = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					sayac++;
					if (array[i] != 0) {
						tekrar = array[i];
					} else {
						tekrarEdenler = array[i];
					}
				}
			}
			if (tekrar != 0 || tekrarEdenler != 1) {
				break;
			}
		}
		if (sayac == 1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		} else if (tekrarEdenler != 1) {
			System.out.println(tekrarEdenler + " sayısı " + sayac + " kez tekrar ediyor.");
		} else {
			System.out.println(tekrar + " sayısı " + sayac + " kez tekrar ediyor.");
		}
	}

	public static void main(String[] args) {

		int array1[] = { 9, 7, 5, 3, 7, 7, 23, 18, 2, 0, 7 };

		tekrarEdenSayi(array1);

		int array2[] = { 0, 1, 5, 3 };

		tekrarEdenSayi(array2);

		int array3[] = { 2, 3, 43, 5, 3 };

		tekrarEdenSayi(array3);

	}

}
