
public class ClientIDGenerator {

	private int lastIDUsed = 1;
	
	public int generateID(){
		int id = lastIDUsed;
		lastIDUsed++;
		return id;
	}
}
