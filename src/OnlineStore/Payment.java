package OnlineStore;

public class Payment {

	/*
	 {ordered, unique}
	 String: id (ID)
	 Date: paid
	 Real: total
	 String: details
	 */
	private String id;
	private String datePaid;
	private double total;
	private String details;
	public Payment next;
	private static Payment first, last;
	
	
	// Default Constructor
	public Payment()
	{
		first = last = null;
		this.id = "3567";
		this.datePaid = "1/27/16";
		this.total = 23.55;
		this.details = "Any Comments";
	}
	
	// Constructor
	public Payment(String id, String datePaid, double total, String details)
	{
		this.id = id;
		this.datePaid = datePaid;
		this.total = total;
		this.details = details;
	}
	
	public static void newPayment(String id, String datePaid, double total, String details)
	{
		Payment temp = new Payment(id, datePaid, total, details);
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

	public Payment getFirst()
	{
		return first;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDatePaid() {
		return datePaid;
	}

	public void setDatePaid(String datePaid) {
		this.datePaid = datePaid;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Payment: id:" + id + ", datePaid: " + datePaid + ", total: " + total + ", details: " + details + " ";
	}
	
}
