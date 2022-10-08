package firstWeek2;

public class LoopDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");
		
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü bitti.");
		
		int sayi = 10;
		do {
			System.out.println(sayi);
			sayi += 2;
		   }while(sayi < 22);

	}

}
