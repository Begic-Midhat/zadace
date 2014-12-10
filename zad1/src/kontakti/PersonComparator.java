package kontakti;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>
{
	//Članovi:
	private String attr;
	
	//Metodi:
		//Konstruktori:
	public PersonComparator(String in_attr)
	{
		attr=in_attr;
	}
		//Metod koga zahtjeva interface Comparator:
	public int compare(Person p1, Person p2)
    {
		if(attr=="birthday")
			return p2.bday().compareTo(p1.bday());
		else if(attr=="firstName")
			return p1.fName().compareTo(p2.fName());
		else
			return p1.lName().compareTo(p2.lName());
	}
}