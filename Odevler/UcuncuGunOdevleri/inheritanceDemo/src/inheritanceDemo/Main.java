package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();

		Tar�mKrediManager tarimKrediManager = new Tar�mKrediManager();
		tarimKrediManager.Hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
