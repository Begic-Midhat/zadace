package packtask1;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	// fields:
	private String attr;

	// constructors:
	public PersonComparator(String attrValue) {
		this.attr = attrValue;
	}

	public int compare(Person p1, Person p2) {
		if (p1 == null || p2 == null) {
			throw new NullPointerException("List contains null pointer");
		} else {
			if (this.attr.equals("birthday")) {
				if (p1.getBirthday() == null) {
					return (p2.getBirthday() == null) ? 0 : 1;
				}
				if (p2.getBirthday() == null) {
					return -1;
				}
				return p2.getBirthday().compareTo(p1.getBirthday());
			}

			else if (this.attr.equals("firstName")) {
				if (p1.getFirstName() == null) {
					return (p2.getFirstName() == null) ? 0 : 1;
				}
				if (p2.getFirstName() == null) {
					return -1;
				}
				return p1.getFirstName().compareTo(p2.getFirstName());
			} else {
				if (p1.getLastName() == null) {
					return (p2.getLastName() == null) ? 0 : 1;
				}
				if (p2.getLastName() == null) {
					return -1;
				}
				return p1.getLastName().compareTo(p2.getLastName());
			}
		}
	}
}