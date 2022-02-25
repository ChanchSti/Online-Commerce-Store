package OnlineStore;

import java.util.LinkedList;
import java.util.Scanner;

public class StoreController {

	public int members;					// amount of members
	private String sourceName;			// name of the data file
	
	public StoreController() {
		Scanner input = new Scanner(System.in);
		
		LinkedList<Customer> customerList = new LinkedList<Customer>();
	}
		
	
	public void addCustomer(LinkedList<Customer> list, String id, String phone, String address, String email) {
		Customer temp = new Customer(id, phone, address, email);
		list.push(temp);
	}
	
	public void newTransaction() {
		
	}

}
