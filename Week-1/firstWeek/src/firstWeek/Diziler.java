package firstWeek;

public class Diziler {

	public static void main(String[] args) {
		
		String[] sehirler = new String[] {"Ankara", "İstanbul", "izmir"};
		
		for(String sehir : sehirler) {
			System.out.println(sehir);
		}
		
		for(int i=0; i<sehirler.length; i++) {
			System.out.println(sehirler[i]);
		}
		
		System.out.println("******");
		
		String[] sehirler1 = new String[] {"Ankara", "İstanbul", "izmir"};
		sehirler1 = new String[4];
		sehirler1[3] = "Bursa";
		System.out.println(sehirler1[1]);
		
		String[] sehirler2 = new String[] {"Kahramanmaraş", "Şanlıurfa", "Mardin"};
		sehirler1 = sehirler2;
		System.out.println(sehirler2[1] + " = " + sehirler1[1]);
		
		System.out.println("******");
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;
		System.out.println(sayi1);
			
	}
	
	
}
