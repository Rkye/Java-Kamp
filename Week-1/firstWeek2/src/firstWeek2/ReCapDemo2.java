package firstWeek2;

public class ReCapDemo2 {

	public static void main(String[] args) {
		
		double myList[] = {7.2, 12.5, 6.0};
		
		for(double number : myList) {
			System.out.println(number);
		}
		
		System.out.println("******");
		
		double total = 0;
		for(double number : myList) {
			total += number;
		}
		System.out.println("Toplam : " + total);
		
		System.out.println("******");
		
		double max = myList[0];
		
		for(double number : myList) {
			if(number > max) {
				max = number;
			}
		}
		System.out.println("Max sayı : " + max);

	}

}
