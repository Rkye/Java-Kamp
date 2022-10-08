package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new OracleDatabaseManager(); 
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.baseDatabaseManager = new SqlServerDatabaseManager();
		CustomerManager customerManager3 = new CustomerManager();
		customerManager3.baseDatabaseManager = new MySqlDatabaseManager();
		
		customerManager.getCustomers();
		customerManager2.getCustomers();
		customerManager3.getCustomers();

	}

}
