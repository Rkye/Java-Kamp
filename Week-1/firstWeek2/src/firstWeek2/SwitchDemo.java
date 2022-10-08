package firstWeek2;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char grade = 'i';
		
		switch(grade) {
		    case 'A':
			    System.out.println("Geçtiniz");
			    break;
		    case 'B':
			    System.out.println("Geçtiniz");
			    break;
		    case 'C':
		    	System.out.println("Geçtiniz");
		    	break;
		    case 'D':
		    	System.out.println("Kaldınız.");
		    	break;
		    
		    default:
		    	System.out.println("Geçersiz not girdiniz.");
			
		}

	}

}
