import java.util.Comparator;

public class ClientLastNameComparator implements Comparator<IClient> {

	@Override
	public int compare(IClient client1, IClient client2) {
		if(client1.getLastName().compareToIgnoreCase(client2.getLastName()) < 0){
			return -1;
		}
		else if(client1.getLastName().compareToIgnoreCase(client2.getLastName()) > 0){
		return 1;
	}
		else if(client1.getLastName().compareToIgnoreCase(client2.getLastName()) == 0)
		return 0;
	
	return 0;
	}

	
}
