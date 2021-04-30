package inheratance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer gizem = new IndividualCustomer();
		gizem.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(gizem);
		
		Customer[] customers = {gizem, hepsiBurada};
		
		customerManager.addMultiple(customers);
		

	}

}
