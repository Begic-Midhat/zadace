package packtask1;

import java.util.*;

public class MySorter
{
	public static void printAll(List<Person> contacts)
	{
		int i=1;
		for(Person p : contacts)
		{
	    	System.out.print(i +"."+'\t');
	    	p.print();
	    	++i;
		}
	}
	
	public static void sortByFirstName(List<Person> contacts)
    {
		Collections.sort(contacts, new PersonComparator("firstName"));
		printAll(contacts);
    }
	
    public static void sortByLastName(List<Person> contacts)
    {
    	Collections.sort(contacts, new PersonComparator("lastName"));
    	printAll(contacts);
    }
    
    public static void sortByBirthday(List<Person> contacts)
    {
    	Collections.sort(contacts, new PersonComparator("birthday"));
    	printAll(contacts);
    }
}


