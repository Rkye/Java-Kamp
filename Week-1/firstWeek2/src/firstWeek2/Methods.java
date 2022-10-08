package firstWeek2;

public class Methods {

	public static void main(String[] args) {
		
			sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
		int aranacak = 75;
		boolean sayiVarMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				sayiVarMi = true;
				break;
			}
		}
		
		if(sayiVarMi)
			System.out.println(aranacak + " sayısı mevcut.");
		else
			System.out.println(aranacak + " sayısı mevcut değil.");

	}

}
