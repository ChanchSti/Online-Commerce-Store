package OnlineStore;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GUI implements UserInterface {
	
	 private Customer list;
	 
	 public GUI(Customer dl)
	 {
		 list = dl;
	 }

	public void processCommands()
	 {
		//LinkedList<Customer> Linklist = new LinkedList<Customer>();
		
		 String[] commands = {"Add Account Information",
				 	"Create Web Account",
				 	"User State",
				 	"Order Status",
				 	"Shop",
				 	"Shopping Cart"};
		 
		 int choice;
		 
		 do {
			 choice = JOptionPane.showOptionDialog(null,
					 "Select a command", 
					 "DVD Collection", 
					 JOptionPane.YES_NO_CANCEL_OPTION, 
					 JOptionPane.QUESTION_MESSAGE, 
					 null, 
					 commands,
					 commands[commands.length - 1]);
		 
			 switch (choice) {
			 	case 0: doAddCustomer(); break;
			 	//case 1: doRemoveDVD(); break;
			 	//case 2: doGetDVDsByRating(); break;
			 	//case 3: doGetTotalRunningTime(); break;
			 	//case 4: doSave(); break;
			 	default:  // do nothing
			 }
			 
		 } while (choice != commands.length-1);
		 System.exit(0);
	 }
	
	public void doAddCustomer()
	{
				// Request the title
				String id = JOptionPane.showInputDialog("Enter an id of your choice: ");
				if (id == null) {
					return;		// dialog was cancelled
				}
				//id = id.toUpperCase();
				
				// Request the rating
				String phone = JOptionPane.showInputDialog("Enter your phone #: ");
				if (phone == null) {
					return;		// dialog was cancelled
				}
				//phone = phone.toUpperCase();
				
				// Request the title
				String address = JOptionPane.showInputDialog("Enter your address: ");
				if (address == null) {
					return;		// dialog was cancelled
				}
				
				// Request the running time
				String email = JOptionPane.showInputDialog("Enter your email: ");
				if (email == null) {
				}
				
		                // Add or modify the DVD (assuming the rating and time are valid
		                list.addCustomer(id, phone, address, email);
		                
		                // Display current collection to the console for debugging
		                System.out.println("addCustomer: " + id + ", " + phone + ", " + address + ", " + email);
		                System.out.println(list);
	}
}
