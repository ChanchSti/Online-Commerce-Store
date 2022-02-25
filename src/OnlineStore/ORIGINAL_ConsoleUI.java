package OnlineStore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ORIGINAL_ConsoleUI implements UserInterface {
	
	 private Customer CustomerList;
	 private WebUser WebUserList;
	 private Account AccountList;
	 private Scanner scan;
////////////////////////////////////////////////////////////////////////////////////
	 // Add more parameters to invoke other classes
	 public ORIGINAL_ConsoleUI(Customer custom, WebUser user, Account account)
	 {
		 CustomerList = custom;
		 WebUserList = user;
		 AccountList = account;
		 scan = new Scanner(System.in);
	 }
	 //public ConsoleUI(WebUser dl)
	 //{
	//	 WebUserList = dl;
	//	 scan = new Scanner(System.in);
	 //}
////////////////////////////////////////////////////////////////////////////////////
	public void processCommands()
	 {
		String[] commands = {"Add Customer",
	 			  "Print Customers",
	 			  "Print Web-Users", 
	 			  "View Account",
	 			  "Quit",
	 			  "Orders"};

		 int choice;
		 
		 do {
			 for (int i = 0; i < commands.length; i++) {
				 System.out.println("Select " + i + ": " + commands[i]);	// prints out selection
			 }
			 try {
				 choice = scan.nextInt();
				 scan.nextLine();
				 switch (choice) {
				 	case 0: doAddCustomer(); break;				// add customer
				 	case 1: PrintCustomers(); break;	
				 	case 2: PrintWebUsers(); break;			// add web-user
				 	case 3: ViewAccount(); break;			
				 	case 4: break;				
				 	default:  System.out.println("INVALID CHOICE - TRY AGAIN");
				 }
			 } catch (InputMismatchException e) {
				 System.out.println("INVALID CHOICE - TRY AGAIN");
				 scan.nextLine();
				 choice = -1;
			 }	 
			 if(choice == 4)	// if choice equals variable QUIT
			 {
				 break;
			 }
			 
		 } while (choice != commands.length-1);
	 }
//}
private void doAddCustomer() {

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
