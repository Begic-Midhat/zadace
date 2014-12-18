package packtask4;

import java.text.*;
import java.util.*;

public class Person {
	private String firstName;
	private String lastName;
	private Date birthday;

	private Person() {
	};

	public static Person getInstance() {
		Person instance = new Person();
		return instance;
	}

	public Person withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Person withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person bornOn(String birthday) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		if (birthday != null) {
			this.birthday = formatter.parse(birthday);
		} else {
			this.birthday = null;
		}
		return this;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getBirthday() {
		if (this.birthday != null) {
			DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
			return formatter.format(this.birthday);
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return getFirstName() + "\t" + getLastName() + "\t" + getBirthday();
	}

}
