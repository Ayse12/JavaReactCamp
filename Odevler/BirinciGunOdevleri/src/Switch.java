
public class Switch {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Tebrikler. Ge�tiniz!");
			break;

		case 'B':
			System.out.println("�yi.Ge�tiniz.");
			break;

		case 'C':
			System.out.println("Ge�tiniz.");
			break;

		case 'D':
			System.out.println("Ge�er.");
			break;

		case 'F':
			System.out.println("Kald�n�z.");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz.");

		}

	}

}
