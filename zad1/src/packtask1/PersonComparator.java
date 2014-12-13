package packtask1;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>
{
	//fields:
	private String attr;
	
	//constructors:
	public PersonComparator(String attrValue)
	{
		this.attr=attrValue;
	}
	
	public int compare(Person p1, Person p2)
    {
		if(p1==null || p2==null)
		{
			throw new NullPointerException("List contains null pointer");
		}
		else
		{
			if(this.attr.equals("birthday"))
				return p2.getBirthday() .compareTo(p1.getBirthday());
			else if(this.attr.equals("firstName"))
				return p1.getFirstName().compareTo(p2.getFirstName());
			else
				return p1.getLastName().compareTo(p2.getLastName());
		}
	}
}