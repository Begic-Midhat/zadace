package kontakti;

import java.util.Comparator;

public class PersonLNcomparator implements Comparator<Person> 
{
	public int compare(Person p1, Person p2)
    {
		return p1.lName().compareTo(p2.lName());
    }

}
