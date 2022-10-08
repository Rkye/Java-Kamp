package firstWeek2;

public class ArraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1 = "Rukiye";
		String ogrenci2 = "Zeynep";
		String ogrenci3 = "Ayşe";
		String ogrenci4 = "Fatma";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("********");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Rukiye";
		ogrenciler[1] = "Zeynep";
		ogrenciler[2] = "Ayşe";
		ogrenciler[3] = "Fatma";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("*******");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		

	}

}
