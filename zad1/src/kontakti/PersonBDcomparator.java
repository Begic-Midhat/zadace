package kontakti;

import java.util.Comparator;

public class PersonBDcomparator implements Comparator<Person> {
	public int compare(Person p1, Person p2)
    {
		/*String year=p1.bday().substring(6,10);
		String month=p1.bday().substring(3,5);
		String day=p1.bday().substring(0,2);
		String sp1=year+month+day;
		
		year=p2.bday().substring(6,10);
		month=p2.bday().substring(3,5);
		day=p2.bday().substring(0,2);
		String sp2=year+month+day;*/
		return p2.bday().compareTo(p1.bday());
    }
}
