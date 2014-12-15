package packtask1;

import java.text.*;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		try {
			List<Person> persons = new ArrayList<Person>();
			persons.add(new Person("Adnan", "Alicic", "19.03.1987"));
			persons.add(new Person("Amir", "Trajanakovski", "29.04.1978"));
			persons.add(new Person("Samer", null, "19.10.1980"));
			persons.add(new Person("Denis", "Delic", "01.01.2000"));
			// persons.add(new Person("Denis","Delic","0101.2000"));
			// persons.add(null);
			persons.add(new Person("Mirza", "Osmic", null));
			persons.add(new Person(null, "Delic", "19.03.1987"));

			System.out.println("\nSorted by first name:");
			MySorter.sortByFirstName(persons);
			System.out.println("\nSorted by last name:");
			MySorter.sortByLastName(persons);
			System.out.println("\nSorted by birthday:");
			MySorter.sortByBirthday(persons);
		} catch (NullPointerException | ParseException e) {
			System.err.println(e.getMessage());
		}
	}
}
