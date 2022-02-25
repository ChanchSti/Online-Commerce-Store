package OnlineStore;

public class WebUser {

	/*
	 String: login_id (ID)
	 String: password
	 UserState: state
	 */
	private String login_id;
	private String password;
	private boolean userState;  ////////////////////// still need to implement
	public WebUser next;
	private static WebUser first, last;
	
	
	// Default Constructor
	public WebUser()
	{
		first = last = null;
		this.login_id = "johnDoe2";
		this.password = "password";
	}
	
	// Constructor
	public WebUser(String login_id, String password)
	{
		this.login_id = login_id;
		this.password = password;
	}
	
	public static void addWebUser(String login_id, String password)
	{
		WebUser temp = new WebUser(login_id, password);
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

	public WebUser getFirst()
	{
		return first;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "WebUser: login_id: " + login_id + ", password: " + password + " ";
	}
}
