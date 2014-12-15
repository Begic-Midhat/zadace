package packtask1;

import java.text.*;
import java.util.*;

public class Person {
	// fields:
	private String firstName;
	private String lastName;
	private Date birthday;

	// constructors:
	public Person(String fName, String lName, String bd) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		this.firstName = fName;
		this.lastName = lName;
		if (bd != null) {
			this.birthday = formatter.parse(bd);
		} else {
			this.birthday = null;
		}
	}

	public Person() throws ParseException {
		this("Nepoznato", "Nepoznato", "01.01.1000");
	}

	// getters:
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getBirthday() {
		if (this.birthday != null) {
			DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
			return formatter.format(this.birthday).toString();
		} else {
			return null;
		}
	}

	// other methods:
	@Override
	public String toString() {
		return getFirstName() + "\t" + getLastName() + "\t" + getBirthday();
	}
}
