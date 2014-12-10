package kontakti;

import java.util.*;

public class MySorter {
	public static void SortByFirstName(List<Person> kontakti)
    {
		Collections.sort(kontakti, new PersonFNcomparator());
		for(int i=0;i<kontakti.size();++i)
		{
			System.out.print((i+1)+"."+'\t');
			kontakti.get(i).ispis();
		}
    }
    public static void SortByLastName(List<Person> kontakti)
    {
    	Collections.sort(kontakti, new PersonLNcomparator());
    	for(int i=0;i<kontakti.size();++i)
		{
	    	System.out.print((i+1)+"."+'\t');
	    	kontakti.get(i).ispis();
		}
    }
    public static void SortByBirthday(List<Person> kontakti)
    {
    	Collections.sort(kontakti, new PersonBDcomparator());
    	for(int i=0;i<kontakti.size();++i)
    	{
    		System.out.print((i+1)+"."+'\t');
    		kontakti.get(i).ispis();
    	}
    }
}


