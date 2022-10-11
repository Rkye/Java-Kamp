package youtubeDemo;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println(customer.id + " : müşterisi kaydedildi.");
	}
	
	
	public void delete() {
		System.out.println(customer.id + " müşterisi silindi.");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
	}

	

}
