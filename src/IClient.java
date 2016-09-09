import java.util.Date;
import java.util.HashMap;

public interface IClient extends IPerson {
	
	public IPerson getAccountHolder();

	public int getClientID();

	public Date getTimeCreated();

	public void setTimeCreated(Date timeCreated);

	public Account getAccount(int accountNumber);

	public HashMap<Integer, Account> viewAccounts();

	public void addSavingsAccount(double interestRate);

	public void addCheckingAccount();

	public String toString();

	public String sortAccountBalance();
	
	public String sortAccountNumber();


}