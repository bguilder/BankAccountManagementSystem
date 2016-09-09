import java.util.Date;

public interface IBankingSystemController {

	//public IBankingSystemController createInstance(ClientIDGenerator clientIDGen, AccountNumberGenerator accountNumGen);

	public String addClient(String firstName, String lastName, Date date, String address, Date timeCreated);

	public void addSavingsAccount(int clientID, double interestRate);

	public void addCheckingAccount(int clientID);

	public String viewAccount(int clientID, int accountNumber);

	public String viewClient(int clientID);

	public void deposit(int clientID, int accountNumber, double amount);

	public boolean withdraw(int clientID, int accountNumber, double amount);

	public void cashCheck(int clientID, int accountNumber, double amount);

	public void closeAccount(int clientID, int accountNumber);

    public void removeClient(int clientID);

	public boolean checkClient(int clientID);

	public String sortClientID();

	public String sortClientLastName();
	
	public String sortClientFirstName();
	
	public String sortCreationDate();
	
	public IClient getClient(int clientID);

}
