
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 5, 6 };
		int aranan = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayý Vardýr:" + aranan;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayý Vardýr:" + aranan);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
