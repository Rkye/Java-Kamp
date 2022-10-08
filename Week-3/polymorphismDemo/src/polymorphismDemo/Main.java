package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Email log mesajı");
		
		BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
		
		for(BaseLogger x : loggers) {
			x.log("Log mesajı ");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
	}

}
