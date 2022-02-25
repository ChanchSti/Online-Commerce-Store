package OnlineStore;

public class Product {

	/*
	 String: id (ID)
	 String: name
	 Supplier: supplier
	 */
	private String id;
	private String name;
	private String supplier;
	public Product next;
	private static Product first, last;
	
	
	// Default Constructor
	public Product()
	{
		first = last = null;
		this.id = "787";
		this.name = "RVCA Tee";
		this.supplier = "Zumiez";
	}
	
	// Constructor
	public Product(String id, String name, String supplier)
	{
		this.id = id;
		this.name = name;
		this.supplier = supplier;
	}
	
	public static void newProduct(String id, String name, String supplier)
	{
		Product temp = new Product(id, name, supplier);
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
	
	public Product getFirst()
	{
		return first;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product: id: " + id + ", name: " + name + ", supplier: " + supplier + " ";
	}
	
}
