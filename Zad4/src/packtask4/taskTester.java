package packtask4;

import java.text.ParseException;

public class taskTester {
	public static void main(String[] args) {
		try {
			Person p = Person.getInstance().withFirstName("Adnan").withLastName("Alicic").bornOn("19.03.1987");
			System.out.println(p);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
	}
}
