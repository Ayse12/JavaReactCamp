
public class Arrays {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Arslan";
		ogrenciler[1] = "Asl�";
		ogrenciler[2] = "P�nar";
		// ogrenciler[3]= "Derin";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
