
public class ReCapDemo2 {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6 };
		int aranan = 4;
		boolean varMi = true;

		for (int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Say� Vard�r.");
		} else {
			System.out.println("Say� Yoktur.");
		}

	}

}
