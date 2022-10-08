package firstWeek2;

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Balıkesir";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Kahramanmaraş";
		sehirler[2][1] = "Muğla";
		sehirler[2][2] = "İzmir";
		
		for (int i = 0; i < sehirler.length; i++) {
			System.out.println("*******");
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
