package OnlineStore;

public class ShoppingCart {

	/*
	 Date: created
	 */

	private String dateCreated;
	
	
	// Default Constructor
	public ShoppingCart()
	{
		this.dateCreated = "5/11/19";
	}
	
	// Constructor
	public ShoppingCart(String dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	
	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "ShoppingCart: dateCreated: " + dateCreated + " ";
	}
	
	
}
