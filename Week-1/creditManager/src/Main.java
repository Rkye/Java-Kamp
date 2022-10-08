import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		creditManager.add();
		
		MortgageManager mortgageManager = new MortgageManager();
		mortgageManager.add();
		mortgageManager.calculate();
		
		ArrayList<CreditManager> creditManagers = new ArrayList<CreditManager>();
		creditManagers.add(mortgageManager);
		creditManagers.add(new VehicleManager());
		creditManagers.add(new OfficerManager());
		
		for(CreditManager credits : creditManagers) {
			credits.calculate();
		}
		

	}

}
