
public class Switch {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Tebrikler. Geçtiniz!");
			break;

		case 'B':
			System.out.println("Ýyi.Geçtiniz.");
			break;

		case 'C':
			System.out.println("Geçtiniz.");
			break;

		case 'D':
			System.out.println("Geçer.");
			break;

		case 'F':
			System.out.println("Kaldýnýz.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");

		}

	}

}
