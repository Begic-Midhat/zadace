package kontakti;

import java.text.*;
import java.util.*;

public class Zadatak1 {
	public static void main(String [] args) throws ParseException
    {
		List<Person> persons  = new ArrayList<Person>();
		persons.add(new Person("Adnan","Alicic","19.03.1987"));
		persons.add(new Person("Amir","Trajanakovski","29.04.1978"));
		persons.add(new Person("Denis","Delic","01.01.2000"));
	
		System.out.println("\nSorted by persons first name:");
		MySorter.SortByFirstName(persons);
		System.out.println("\nSorted by persons last name:");
		MySorter.SortByLastName(persons);
		System.out.println("\nSorted by persons birthday:");
		MySorter.SortByBirthday(persons);
    }
}
