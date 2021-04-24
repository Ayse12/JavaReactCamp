
public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 4, 5, 6 };
		int aranan = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayý Vardýr.");
		} else {
			System.out.println("Sayý Yoktur.");
		}

	}

}
