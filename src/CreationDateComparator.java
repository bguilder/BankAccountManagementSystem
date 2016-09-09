import java.util.Comparator;

public class CreationDateComparator implements Comparator<IClient> {

	@Override
	public int compare(IClient client1, IClient client2) {
		if(client1.getTimeCreated().compareTo(client2.getTimeCreated()) < 0){
			return -1;
		}
		else if(client1.getTimeCreated().compareTo(client2.getTimeCreated()) > 0){
		return 1;
	}
		else if(client1.getTimeCreated().compareTo(client2.getTimeCreated()) == 0)
		return 0;
	
	return 0;
	}

}
