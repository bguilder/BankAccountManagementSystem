
public abstract class Account {
	
	int accountNumber;
	double balance;
	
	public Account(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) {
		
		if(balance - amount < 0){
			return balance;
		}
		else{
			balance -= amount;
		}
			
		
		return balance;
	}

	public double deposit(double amount) {
		balance +=amount;
		return balance;
	}
	public String toString(){
		return " Number: " + getAccountNumber() + " Balance: $" + getBalance();
	}
}
