package polymorphism;

public class Main {

	public static void main(String[] args) {
		//EmailLogger emailLogger= new EmailLogger();
		//emailLogger.Log("Log mesajý");
		
		BaseLogger[] loggers= new BaseLogger[] {new DatabaseLogger(),new FileLogger(),
				new EmailLogger(),new ConsoleLogger()};
		
		for(BaseLogger logger:loggers) {
			logger.log("Log message");
		}
		
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();
		

	}

}
