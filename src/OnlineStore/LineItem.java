package OnlineStore;

public class LineItem extends Product {
	/* 
	 * {ordered, unique}
	 Integer: quantity
	 Price: price
	 */
	
	private int quantity;
	private double price;
	public LineItem next;
	private static LineItem first, last;
	
	
	// Default Constructor
	public LineItem()
	{
		first = last = null;
		this.quantity = 7;
		this.price = 10.28;
	}
	
	// Constructor
	public LineItem(int quantity, double price)
	{
		this.quantity = quantity;
		this.price = price;
	}
	
	public static void newLineItem(int quantity, double price)
	{
		LineItem temp = new LineItem(quantity, price);
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
	/*
	public LineItem(String id, String name, String supplier, int quantity, double price) {
		this.setId(id);
		this.setName(name);
		this.setSupplier(supplier);
		this.quantity = quantity;
		this.price = price;
		}

	public static void updateLineItem(String id, String name, String supplier, int quantity, double price)
	{
		//updateLineItem temp = new updateLineItem(id, name, supplier, quantity, price);
		LineItem node = new LineItem(id, name, supplier, quantity, price);
		if(first == null)
		{
			first = last = node;
		}
		else
		{
			last.next = node;
			last = node;
		}
	}
	*/
	
	public LineItem getFirst()
	{
		return first;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LineItem: quantity: " + quantity + ", price: " + price + " ";
	}
	
	
}
