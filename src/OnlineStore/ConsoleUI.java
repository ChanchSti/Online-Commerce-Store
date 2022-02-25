package OnlineStore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConsoleUI implements UserInterface {
	
	 private Customer CustomerList;
	 private WebUser WebUserList;
	 private Account AccountList;
	 private Product ProductList;
	 private LineItem LineItemList;
	 private Scanner scan;
////////////////////////////////////////////////////////////////////////////////////
	 // Add more parameters to invoke other classes
	 public ConsoleUI(Customer custom, WebUser user, Account account, Product product, LineItem lineItem)
	 {
		 CustomerList = custom;
		 WebUserList = user;
		 AccountList = account;
		 ProductList = product;
		 LineItemList = lineItem;
		 scan = new Scanner(System.in);
	 }
	 
////////////////////////////////////////////////////////////////////////////////////
	
	public void processCommands()
	 {
	
		 LineItem.newProduct("1", "Shirt1", "GUCCI");
		 LineItem.newProduct("2", "Shirt2", "GUCCI");
		 LineItem.newProduct("3", "Shirt3", "GUCCI");
		 LineItem.newProduct("4", "Shirt4", "GUCCI");
		 LineItem.newProduct("5", "Shirt5", "GUCCI");
		 LineItem.newProduct("6", "Shirt6", "GUCCI");
		 LineItem.newProduct("7", "Shirt7", "GUCCI");
		 LineItem.newProduct("8", "Shirt8", "GUCCI");
		 LineItem.newProduct("9", "Shirt9", "GUCCI");
		 LineItem.newProduct("10", "Shirt10", "GUCCI");
		 LineItem.newProduct("11", "Shirt11", "VANS");
		 LineItem.newProduct("12", "Shirt12", "VANS");
		 LineItem.newProduct("13", "Shirt13", "VANS");
		 LineItem.newProduct("14", "Shirt14", "VANS");
		 LineItem.newProduct("15", "Shirt15", "VANS");
		 LineItem.newProduct("16", "Shirt16", "VANS");
		 LineItem.newProduct("17", "Shirt17", "VANS");
		 LineItem.newProduct("18", "Shirt18", "VANS");
		 LineItem.newProduct("19", "Shirt19", "VANS");
		 LineItem.newProduct("20", "Shirt20", "VANS");
		 LineItem.newProduct("21", "Shirt21", "CONVERSE");
		 LineItem.newProduct("22", "Shirt22", "CONVERSE");
		 LineItem.newProduct("23", "Shirt23", "CONVERSE");
		 LineItem.newProduct("24", "Shirt24", "CONVERSE");
		 LineItem.newProduct("25", "Shirt25", "CONVERSE");
		 LineItem.newProduct("26", "Shirt26", "CONVERSE");
		 LineItem.newProduct("27", "Shirt27", "CONVERSE");
		 LineItem.newProduct("28", "Shirt28", "CONVERSE");
		 LineItem.newProduct("29", "Shirt29", "CONVERSE");
		 LineItem.newProduct("30", "Shirt30", "CONVERSE");
		 LineItem.newProduct("31", "Shirt31", "CARHARTT");
		 LineItem.newProduct("32", "Shirt32", "CARHARTT");
		 LineItem.newProduct("33", "Shirt33", "CARHARTT");
		 LineItem.newProduct("34", "Shirt34", "CARHARTT");
		 LineItem.newProduct("35", "Shirt35", "CARHARTT");
		 LineItem.newProduct("36", "Shirt36", "CARHARTT");
		 LineItem.newProduct("37", "Shirt37", "CARHARTT");
		 LineItem.newProduct("38", "Shirt38", "CARHARTT");
		 LineItem.newProduct("39", "Shirt39", "CARHARTT");
		 LineItem.newProduct("40", "Shirt40", "CARHARTT");
		
		
		 /*
		  Only one works when try logging in. Only the top one will work
		  for this instance only ADMIN would work. not EMAIL@GMAIL.COM 
		  */
		 WebUser.addWebUser("admin.com", "54321");
		 WebUser.addWebUser("email@gmail.com", "1001");
		 
		 
		String[] commands = {"Shop*",
				  "Add Customer*",
	 			  "Add WebUser*", 
	 			  "UserState",
	 			  "OrderStatus",
	 			  "Find Product*",
	 			  "Print Products*",
	 			  "Print WebUsers*",
	 			  "QUIT*"};

		 int choice;
		 
		 do {
			 for (int i = 0; i < commands.length; i++) {
				 System.out.println("Select " + i + ": " + commands[i]);	// prints out selection
			 }
			 try {
				 choice = scan.nextInt();
				 scan.nextLine();
				 switch (choice) {
				 	case 0: ShopUpdate(); break;
				 	case 1: AddCustomer(); break;
				 	case 2: AddWebUser(); break;			// add web-user
				 	case 3: UserState(); break;	
				 	case 4: OrderStatus(); break;
				 	case 5: findProduct(null); break;
				 	case 6: PrintProducts(); break;
				 	case 7: PrintWebUsers(); break;
				 	case 8: break;	
				 	default:  System.out.println("INVALID CHOICE - TRY AGAIN");
				 }
			 } catch (InputMismatchException e) {
				 System.out.println("INVALID CHOICE - TRY AGAIN");
				 scan.nextLine();
				 choice = -1;
			 }	 
			 if(choice == 8)	// if choice equals variable QUIT
			 {
				 break;
			 }
			 
		 } while (choice != commands.length-1);
	 }
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private void ShopUpdate()
{
	
	System.out.println("\t\tLets start shopping! :)");
	System.out.print("Is customer a WebUser? Y/N: ");
	String choice = scan.next();
	choice = choice.toUpperCase();
	
	if(choice.equals("Y"))
	{
		WebUserLogIn();
	}
	else if(choice.equals("N"))
	{
	System.out.print("Would you like to register as a WebUser? Y/N: ");
	String userChoice = scan.next();
	userChoice = userChoice.toUpperCase();
	
	
	if(userChoice.equals("Y"))
	{
		System.out.println("\t\tEnter Account information");
		System.out.print("Enter a Username of your choice: ");
		String userName = scan.next();
		if(userName.equals("")) {
			return;
		}
		
		System.out.print("Enter your phone #: ");
		String phone = scan.next();
		if(phone.equals("")) {
			return;
		}
		
		System.out.print("Enter your current address: ");
		String address = scan.next();
		if(address.equals("")) {
			return;
		}
		
		System.out.print("Enter your current email: ");
		String emailInfo = scan.next();
		if(emailInfo.equals("")) {
			return;
		}
		
		
		System.out.print("Enter a secure password: ");
		String key = scan.next();
		if(key.equals("")) {
			return;
		}
		
		// FOR TESTING
		//System.out.println("id: " + userName + " phone: " + phone + " address: " + address + " email: " + email + " password: " + password);
		Customer.addCustomer(userName, phone, address, emailInfo);
		WebUser.addWebUser(emailInfo, key);
		System.out.println("* Congratulations! Your account has been created *\n");
		
		PrintProducts();
		////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Enter 'exit' to Quit OR");
		System.out.print("Enter the id # you would like to add to the shopping cart: ");
		String idNumb = scan.next();
		if(idNumb.equals("exit")) {
			return;
		}
		////////////////////////////////////////////////////////////////////
		findProduct(idNumb);	// found or not found
		
		/*
		String node = ProductList.getFirst().getId();
		while(node != null)
		{
			if(idNumb.equals(node))
			{
				System.out.println("Found");
			}
			node = node.next;
		}
		*/
		System.out.println("Lets continue--->");
		///////////////////////////////////////////////////////////////////
	}
		
	else if(userChoice.equals("N"))
	{
		// Enter product id you wish to buy or view products to pick an item
		PrintProducts();
		System.out.print("Enter the id # you would like to add to the shopping cart: ");
		String idNumb = scan.next();
		if(idNumb.equals("exit")) {
			return;
		}
		// add code
	}
	
	}
}
private void performTransaction()
{
	Product itemInv = new Product();
	Product itemToAdd = new Product();
	itemInv = ProductList;
	
	System.out.print("Enter the id # you would like to add to the shopping cart: ");
	String idNumb = scan.next();
	if(idNumb.equals("exit")) {
		return;
	}
	do
	{
	//	itemInv = inv.findItem( itemID );

	}while(idNumb != "exit");
}
private void AddCustomer()
{
	System.out.print("Enter a Username: ");
	String id = scan.nextLine();
	if (id.equals("")) {
		return;		// input was cancelled
	}
	//title = title.toUpperCase();
	
	System.out.print("Enter your phone #: ");
	String phone = scan.nextLine();
	if (phone.equals("")) {
		return;		// input was cancelled
	}
	//rating = rating.toUpperCase();
	
	System.out.print("Enter your address: ");
	String address = scan.nextLine();	
	if (address.equals("")) {
		return;		// input was cancelled
	}
	
	System.out.print("Enter your email: ");
	String email = scan.nextLine();	
	if (email.equals("")) {
		return;		// input was cancelled
	}
	
	// HOW TO FORMAT DATE TO STRING //
	Date date = Calendar.getInstance().getTime();
	DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	String today = dateFormat.format(date);
	String closedDate = "Not Closed";
	boolean isActive = false;	//false because not a WebUser
	
	
	Customer.addCustomer(id, phone, address, email);
	Account.addAccount(id, address, today, closedDate, isActive);
}
private void AddWebUser()
{
	System.out.print("Enter a Username: ");
	String id = scan.nextLine();
	if (id.equals("")) {
		return;		
	}
	
	System.out.print("Enter your phone #: ");
	String phone = scan.nextLine();
	if (phone.equals("")) {
		return;		
	}
	
	System.out.print("Enter your address: ");
	String address = scan.nextLine();	
	if (address.equals("")) {
		return;		
	}
	
	System.out.print("Enter your email: ");
	String email = scan.nextLine();	
	if (email.equals("")) {
		return;		
	}
	
	System.out.print("Create a password: ");
	String password = scan.next();
	if (password.equals("")) {
		return;		
	}
	
	// HOW TO FORMAT DATE TO STRING //
	Date date = Calendar.getInstance().getTime();
	DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	String today = dateFormat.format(date);
	String closedDate = "Not Closed";
	boolean isActive = true;	//true because will become an active WebUser
	

	Customer.addCustomer(id, phone, address, email);
	WebUser.addWebUser(email, password);
	Account.addAccount(id, address, today, closedDate, isActive);
}
private void WebUserLogIn()	// works
{
	System.out.print("Enter your email: ");
	String email = scan.next();
	System.out.print("Enter your password: ");
	String password = scan.next();
	
	WebUser node = WebUserList.getFirst();
	
	if(email.equals(node.getLogin_id()) && password.equals(node.getPassword()))
	{
		System.out.println("CORRECT CREDENTIALS");
	}
	else
		System.out.println("WRONG! EITHER EMAIL OR PASSWORD is wrong");
}
private void Order()
{
	
}
private void UserState() // NEW, ACTIVE, BLOCKED, BANNED
{
	
}
private void OrderStatus() // NEW, HOLD, SHIPPED, DELIVERED, CLOSED
{
	
}
private void findProduct(String x)	// works
{
	//System.out.print("Type a product brand name to shop that genre: ");
	//String value = scan.next();
	//x = scan.next();
	if(x.equals("")) {
	}
	x = x.toUpperCase();
	Product node = ProductList.getFirst();
	
	while(node != null)
	{
		if(node.getId().equals(x))
		{
			System.out.println("Found");
		}
		node = node.next;
	}
}
private void PrintProducts()
{
	//LineItem n = LineItemList.getFirst();
	Product n = ProductList.getFirst();
	if(n == null)
	{
		System.out.println("::Nothing in list::");
	}
	else
	{
		while(n != null)
		{
			System.out.println(n);
			n = n.next;
		}
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
private void doAddCustomer() 
{
	System.out.println("Enter an id");
	String id = scan.nextLine();
	if (id.equals("")) {
		return;		// input was cancelled
	}
	//title = title.toUpperCase();
	
	System.out.println("Enter your phone #");
	String phone = scan.nextLine();
	if (phone.equals("")) {
		return;		// input was cancelled
	}
	//rating = rating.toUpperCase();
	
	System.out.println("Enter your address");
	String address = scan.nextLine();	
	if (address.equals("")) {
		return;		// input was cancelled
	}
	
	System.out.println("Enter your email");
	String email = scan.nextLine();	
	if (email.equals("")) {
		return;		// input was cancelled
	}

	Customer.addCustomer(id, phone, address, email);
	
	System.out.println("Would you like to register as a Web-User?");
	System.out.println("1 : YES  || 2 : NO");
	int x = scan.nextInt();
	
	if(x == 1)
	{
		System.out.println("Create a password");
		String password = scan.next();
		if (password.equals("")) {
			return;		// input was cancelled
		}
		// HOW TO FORMAT DATE TO STRING //
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String today = dateFormat.format(date);
		//System.out.println("Date ----> " + today);
		String active = "Active";
		boolean isActive = true;
		
		WebUser.addWebUser(email, password);
		Account.addAccount(id, address, today, active, isActive);
	}
	
	
	// Display what just got added
	System.out.println("Adding: " + id + "," + phone + "," + address + "," + email);
	
}
private void ViewAccount()
{
	Customer customer = CustomerList.getFirst();	// customer NODE of fist item in list
	Account account = AccountList.getFirst();
	
	if(account == null)
		System.out.println("::Nothing in list::");
	else
	{
	System.out.println("Enter your Address:");
	String address = scan.next();
	
	if(address.equals(account.getBilling_address()))
	{
		System.out.println("Found");
		System.out.println(account.toString());
		account = account.next;
	}
	else
	System.out.println("Not found");
	}
	//Account.addAccount(id, billing_address, openDate, closedDate, isClosed);
	
}
private void PrintCustomers()
{
	Customer n = CustomerList.getFirst();
	if(n == null)
	{
		System.out.println("::Nothing in list::");
	}
	else
	{
		while(n != null)
		{
			System.out.println(n);
			n = n.next;
		}
	}
}
private void PrintWebUsers()
{
	WebUser n = WebUserList.getFirst();
	
	if(n == null)
	{
		System.out.println("::Nothing in list::");
	}
	else
	{
		while(n != null)
		{
			System.out.println(n);
			n = n.next;
		}
	}
	
}


}
