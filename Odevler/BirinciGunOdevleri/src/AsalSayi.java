
public class AsalSayi {

	public static void main(String[] args) {
		int number = 1;
		int reminder = number % 2;
		System.out.println(reminder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.print("Ge�ersiz say� girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				isPrime = true;
			}
		}

		if (isPrime) {
			System.out.print("Say� asald�r.");
		}

		else {
			System.out.print("Say� asal de�ildir.");
		}

	}

}
