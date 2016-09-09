import java.util.Comparator;

public class AccountNumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account account1, Account account2) {
		if(account1.getAccountNumber() > account2.getAccountNumber()){
			return -1;
		}
		else if(account1.getAccountNumber() < account2.getAccountNumber()){
		return 1;
	}
		else if(account1.getAccountNumber() == account2.getAccountNumber())
		return 0;

	//??????
	return 0;
}
}
