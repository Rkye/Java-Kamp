package youtubeDemo;

public class Program {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "İstanbul";
	
		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
		customerManager.delete();
		
		
		CustomerManager customerManager2 = new CustomerManager(new Person(), new CarCreditManager());
		customerManager2.giveCredit();
		customerManager2.save();
		
		System.out.println("********");
		
		Company company = new Company();
		company.taxNumber=45;
		company.companyName = "Arçelik";
		company.id = 100;
		
		Person person = new Person();
		person.nationalIdentity = "55465465465";
		
	}

}
