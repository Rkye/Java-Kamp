package firstWeek2;

public class SesliHarfler {

	public static void main(String[] args) {

		char harf = 'E';

		char[] kSesliHarfler = { 'A', 'a', 'O', 'o', 'U', 'u', 'I', 'ı' };
		char[] iSesliHarfler = { 'E', 'e', 'Ö', 'ö', 'Ü', 'ü', 'İ', 'i' };

		for (int i = 0; i < kSesliHarfler.length; i++) {
			if (harf == kSesliHarfler[i])
				System.out.println(harf + " harfi kalın sesli harftir.");
		}

		for (int i = 0; i < iSesliHarfler.length; i++) {
			if (harf == iSesliHarfler[i])
				System.out.println(harf + " harfi ince sesli harftir.");
		}

	}

}
