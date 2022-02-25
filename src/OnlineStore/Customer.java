package OnlineStore;
//import java.util.*; 
//import java.util.LinkedList;

public class Customer {
	
	/*
	 String: id (ID)
	 Address: address
	 Phone: phone
	 String: email
	 */
	private String id;
	private String phone;
	private String address;
	private String email;
	public Customer next;
	private static Customer first, last;
	
	
	// Default Constructor
	    public Customer() 
		{
	    	first = last = null;
			this.id = "209";
			this.phone = "2095414149";
			this.address = "123 Carlos Bee Blvd";
			this.email = "myemail532";
		}
	
	//	Constructor
	public Customer(String id, String phone, String address, String email)
	{
		this.id = id;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	
	public static void addCustomer(String id, String phone, String address, String email) {
		Customer temp = new Customer(id, phone, address, email);
		if(first == null)
		{
			first = last = temp;
		}
		else
		{
			last.next = temp;
			last = temp;
		}
	}
	
	public Customer getFirst()
	{
		return first;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer: id: " + id + ", phone: " + phone + ", address: " + address + ", email: " + email + " ";
	}

}
