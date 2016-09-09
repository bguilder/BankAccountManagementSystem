import java.util.Comparator;

public class ClientIDComparator implements Comparator<IClient> {

	@Override
	public int compare(IClient client1, IClient client2) {
		if(client1.getClientID() > client2.getClientID()){
			return -1;
		}
		else if(client1.getClientID() < client2.getClientID()){
		return 1;
	}
		else if(client1.getClientID() == client2.getClientID())
		return 0;

	return 0;
}
}
