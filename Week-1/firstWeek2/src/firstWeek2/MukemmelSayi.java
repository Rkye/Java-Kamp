package firstWeek2;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		int sayi = 28;
		int toplam = 0;
		for(int i=1; i<sayi; i++) {
			if(sayi % i == 0) {
				toplam += i;
			}
		}
		
		if(toplam == sayi)
			System.out.println(sayi + " = " + toplam + " olduğundan mükemmel sayıdır");
		else
			System.out.println(sayi + " != " + toplam + " olduğundan mükemmel sayı değildir.");

	}

}
