package maraton1;

public class Question1 {

	public static void yildiz() {
		
		int yildizKarakter = 1;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < yildizKarakter; j++) {
				System.out.print("*" + " ");
			}

			System.out.println("");
			yildizKarakter++;
		}
		for (int k = 0; k < 3; k++) {

			for (int m = 0; m < 7; m++)

				System.out.print("* ");
			System.out.println();

		}

	}

	public static void main(String[] args) {

		yildiz();

	}
}
