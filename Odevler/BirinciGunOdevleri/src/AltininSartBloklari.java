
public class AltininSartBloklari {

	public static void main(String[] args) {
		double gumusDun = 7.0031;
		double gumusBugun = 7.0112;

		if (gumusDun < gumusBugun) {
			System.out.println("Art�� oku g�sterilecek.");
		} else if (gumusDun == gumusBugun) {
			System.out.println("E�ittir oku g�sterilecek.");
		} else {
			System.out.println("Azal�� oku g�sterilecek.");
		}

	}

}
