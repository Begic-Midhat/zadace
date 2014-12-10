package kontakti;

import java.text.*;
import java.util.*;

public class Person {
	//Članovi:
    private String firstName;
    private String lastName;
    private Date birthday;
    //Metodi:
    	//Konstruktori:
    public Person(String fn,String ln, String bd) throws ParseException
    {
    	DateFormat formatter=new SimpleDateFormat("dd.MM.yyyy");
    	firstName=fn;
    	lastName=ln;
    	birthday = formatter.parse(bd);
    }
    public Person() throws ParseException{this("Nepoznato","Nepoznato","01.01.1000");}
    	//Getter-i:
    public String fName(){return firstName;}
    public String lName(){return lastName;}
    public String bday()
    {
    	DateFormat formatter=new SimpleDateFormat("dd.MM.yyyy");
    	return formatter.format(birthday);
    }

	//Ostali metodi:
    public void ispis()
    {
    	DateFormat formatter=new SimpleDateFormat("dd.MM.yyyy");
    	System.out.println(firstName + "\t" + lastName + "\t" + formatter.format(birthday));
    }
}
