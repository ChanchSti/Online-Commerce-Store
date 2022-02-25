package OnlineStore;

import java.util.Date;
import java.util.Scanner;


public class Account {

	private String id;
	private String billing_address;
	private boolean isClosed;
	private String openDate, closedDate;
	public Account next;
	private static Account first, last;

	
	// Default Constructor
	public Account()
	{
		first =  last = null;
		this.id = "34564";
		this.billing_address = "123 Carlos Bee Blvd";
		this.openDate = "3/15/NULL";
		this.closedDate = "10/30/NULL";
	}
	// Constructor
	public Account
	(String id, String billing_address, String openDate, String closedDate, boolean isClosed)
	{
		this.id = id;
		this.billing_address = billing_address;
		//this.openDate = openDate;
		this.closedDate = closedDate;
		this.isClosed = isClosed;
	}
	
	public static void addAccount
	(String id, String billing_address, String openDate, String closedDate, boolean isClosed)
	{
		Account temp = new Account(id, billing_address, openDate, closedDate, isClosed);
		if(first == null)
		{
			first = last = temp;
			isClosed = true;
			//System.out.println(isClosed);
		}
		else
		{
			last.next = temp;
			last = temp;
			isClosed = true;
			//System.out.println(isClosed);
		}
	}
	
	
	public Account getFirst()
	{
		return first;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}
	
	@Override
	public String toString() {
		return "Account: id: " + id + ", billing_address: " + billing_address + ", registered WebUser: " + isClosed + ", openDate(REAL DATEnTIME): "
				+ openDate + ", closedDate: " + closedDate + " ";
	}
	
}
