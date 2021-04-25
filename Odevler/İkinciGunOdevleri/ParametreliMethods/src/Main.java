
public class Main {
	public static void main(String[] args) {

		String mesaj = "Hava çok güzel";
		String yenimesaj = mesaj.substring(0, 2);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(5, 3, 7, 9);
		System.out.println(toplam);
	}

	public static void add() {
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static void update() {
		System.out.println("Updated.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
