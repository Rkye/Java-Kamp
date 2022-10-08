package firstWeek2;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		
		int number = 99;
		int remainder = number % 2;
		// System.out.println(remainder);
		
		boolean asalMi = true;
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				asalMi = false;
			}
		
		}
		
		if(number <= 2)
			System.out.println("En küçük asal sayı 2'dir.");
		else if(asalMi)
			System.out.println(number + " sayısı asaldır.");
		else
			System.out.println(number + " sayısı asal değildir.");
		
		

	}

}
