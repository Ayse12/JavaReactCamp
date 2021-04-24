
public class AltininSartBloklari {

	public static void main(String[] args) {
		double gumusDun = 7.0031;
		double gumusBugun = 7.0112;

		if (gumusDun < gumusBugun) {
			System.out.println("Artýþ oku gösterilecek.");
		} else if (gumusDun == gumusBugun) {
			System.out.println("Eþittir oku gösterilecek.");
		} else {
			System.out.println("Azalýþ oku gösterilecek.");
		}

	}

}
