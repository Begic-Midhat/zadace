package kontakti;

import java.util.*;

public class MySorter
{
	public static void print_all(List<Person> kontakti)
	{
		int i=1;
		for(Person p : kontakti)
		{
	    	System.out.print(i +"."+'\t');
	    	p.ispis();
	    	++i;
		}
	}
	
	public static void SortByFirstName(List<Person> kontakti)
    {
		Collections.sort(kontakti, new PersonComparator("firstName"));
		print_all(kontakti);
    }
	
    public static void SortByLastName(List<Person> kontakti)
    {
    	Collections.sort(kontakti, new PersonComparator("lastName"));
    	print_all(kontakti);
    }
    
    public static void SortByBirthday(List<Person> kontakti)
    {
    	Collections.sort(kontakti, new PersonComparator("birthday"));
    	print_all(kontakti);
    }
}


