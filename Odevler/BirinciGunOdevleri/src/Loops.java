
public class Loops {

	public static void main(String[] args) {
		// for
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("*****For d�ng�s� bitti*****");

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("*****While d�ng�s� bitti*****");

		// do-while
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("*****Do-While d�ng�s� bitti*****");

	}

}
