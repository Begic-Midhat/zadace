package kontakti;

import java.util.Comparator;

public class PersonFNcomparator implements Comparator<Person> {
	public int compare(Person p1, Person p2)
    {
		return p1.fName().compareTo(p2.fName());
    }
}
