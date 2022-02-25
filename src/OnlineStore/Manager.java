package OnlineStore;

import java.util.Scanner;

public class Manager  {

public static void main(String[] args) {
		
	UserInterface usrInterface;
	//StoreCollection storeRun = new StoreCollection();
	Customer customer = new Customer();
	WebUser webUser = new WebUser();
	Account account = new Account();
	Product products = new Product();
	LineItem lineItem = new LineItem();
	
	//Scanner scan = new Scanner(System.in);

	usrInterface = new ConsoleUI(customer, webUser, account, products, lineItem);
	usrInterface.processCommands();
	//////////// GUI ////////////
	//usrInterface = new GUI(storeRun);
	//usrInterface.processCommands();
	}
}
