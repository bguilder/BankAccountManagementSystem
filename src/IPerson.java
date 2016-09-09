import java.util.Date;

public interface IPerson {

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	Date getDateOfBirth();

	void setDateOfBirth(Date dateOfBirth);

	String getAddress();

	void setAddress(String address);

	String toString();

}