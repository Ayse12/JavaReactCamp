
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Java!");

		String internetSubeButonu = "Ýnternet Þubeye Git";

		System.out.println(internetSubeButonu);

		double dolorDun = 8.15;
		double dolorBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		if (dolorBugun < dolorDun) {
			System.out.println("Azalýþ oku");
		} else if (dolorBugun > dolorDun) {
			System.out.println("Artýþ oku");
		} else {
			System.out.println("Eþittir oku");
		}

		String[] krediler = { "Ýhtiyaç Kredisi", "Konut Kredisi", "MSB kredisi", "Kurumsal krediler" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		System.out.println("*****************************");

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);

	}

}
