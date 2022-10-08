package firstWeek;

public class Workshop1 {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,5,8,7,65,78};
		boolean varMi = sayiBul(sayilar,55);
		System.out.println(varMi);
		mesajVer(varMi, 55);
		
	}
	
	public static boolean sayiBul(int[] sayilar, int aranacak) {

		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		return varMi;
	}
	
	public static void mesajVer(boolean varMi, int aranacak) {
		if(varMi) {
			System.out.println(aranacak + " sayısı mevcut.");
		}
		else
			System.out.println(aranacak + " sayısı mevcut değil.");
	}


}
