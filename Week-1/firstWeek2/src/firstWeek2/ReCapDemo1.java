package firstWeek2;

public class ReCapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 40;
		int sayi2 = 20;
		int sayi3 = 30;
		
		int max = 0;
		if(sayi1 > sayi2) {
			max = sayi1;
		}
		else if(sayi2 > sayi3) {
			max = sayi2;
		}
		else
			max = sayi3;
			
		System.out.println("Max sayı : " + max);

	}

}
