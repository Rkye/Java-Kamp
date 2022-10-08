package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		BaseKrediManager baseKrediManager = new BaseKrediManager();
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(tarimKrediManager);
		krediUI.krediHesapla(new AskerKrediManager());

	}

}
