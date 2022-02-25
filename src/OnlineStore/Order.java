package OnlineStore;

public class Order {
	
	/*
	 {ordered, unique}
	 
	 String: number (ID)
	 Date: ordered
	 Date: shipped
	 Address: ship_to
	 OrderStatus: status
	 Real: total
	 */
	
	private String number;
	private String orderDate, shipDate;
	private String ship_to;
	private double total;
	public Order next;
	private static Order first, last;
	// get OrderStatus() by calling the class

	// Default Constructor
	public Order()
	{
		first = last = null;
		this.number = "36583";
		this.orderDate = "8/17/19";
		this.shipDate = "2/1/19";
		this.ship_to = "29958";
		this.total = 29.55;		
	}
	
	// Constructor
	public Order(String number, String orderDate, String shipDate, String ship_to, double total)
	{
		this.number = number;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.ship_to = ship_to;
		this.total = total;
	}
	
	public static void newOrder(String number, String orderDate, String shipDate, String ship_to, double total)
	{
		Order temp = new Order(number, orderDate, shipDate, ship_to, total);
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

	public Order getFirst()
	{
		return first;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getShip_to() {
		return ship_to;
	}

	public void setShip_to(String ship_to) {
		this.ship_to = ship_to;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order: number: " + number + ", orderDate: " + orderDate + ", shipDate: " + shipDate + ", ship_to: "
				+ ship_to + ", total: " + total + " ";
	}
}
