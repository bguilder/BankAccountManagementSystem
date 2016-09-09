
public class Check implements ICheck {

	int checkNumber;
	double amount;
	
	public Check(int checkNumber, double amount) {
		this.checkNumber = checkNumber;
		this.amount = amount;
	}
	
	@Override
	public int getCheckNumber() {
		return checkNumber;
	}
	
	@Override
	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString(){
		return "Check Number: " + getCheckNumber() + " Check Amount: $" + getAmount();
	}
	
	
}
