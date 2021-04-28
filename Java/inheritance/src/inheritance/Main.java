package inheritance;

public class Main {

	public static void main(String[] args) {
		ÝndividualCustomer engin = new ÝndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "789";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiburada);
		//customerManager.add(engin);
		//customerManager.add(abc);
		Customer[] customers= {engin,abc,hepsiburada};
		customerManager.addMultiple(customers);

	}

}
