package firstWeek;

public class Metotlar {

	public static void main(String[] args) {
		
		hesapla();
		mesajVer();
		mesajVer("Rukiye");
		topla(2,3);
		toplananİkiSayınınYuzdesi(20, 5);

	}
	
	public static void mesajVer() {
		System.out.println("Merhaba");
	}
	
	public static void hesapla() {
		System.out.println("Hesaplandı.");
	}
	
	public static void mesajVer(String isim) {
		System.out.println("Merhaba " + isim);
	}
	
	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		// System.out.println("Toplam : " + toplam);
		return toplam;
	}
	
	public static double toplananİkiSayınınYuzdesi(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2);
		double yuzde = (toplam * 10.0) / 100;
		System.out.println("Toplanan iki sayının yüzdesi : " + yuzde);
		return yuzde;
		
	}

}
