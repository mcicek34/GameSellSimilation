package entities;

import java.util.Date;

public class Gamer {

	public int id;
	public String firstName;
	public String lastName;
	public Date dateofBirth;
	public String nationalityId;

	public Gamer(int id, String firstName, String lastName, Date dateofBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}
	
	
}
