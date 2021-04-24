
public class AsalSayi {

	public static void main(String[] args) {
		int number = 1;
		int reminder = number % 2;
		System.out.println(reminder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.print("Geçersiz sayý girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				isPrime = true;
			}
		}

		if (isPrime) {
			System.out.print("Sayý asaldýr.");
		}

		else {
			System.out.print("Sayý asal deðildir.");
		}

	}

}
