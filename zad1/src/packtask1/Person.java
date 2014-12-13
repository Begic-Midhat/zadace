package packtask1;

import java.text.*;
import java.util.*;

public class Person {
	//fields:
    private String firstName;
    private String lastName;
    private Date birthday;
    
    //constructors:
    public Person(String fName,String lName, String bd) throws ParseException
    {
    	DateFormat formatter=new SimpleDateFormat("dd.MM.yyyy");
    	this.firstName=fName;
    	this.lastName=lName;
    	this.birthday = formatter.parse(bd);
    }
    public Person() throws ParseException{this("Nepoznato","Nepoznato","01.01.1000");}
    //getters:
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getBirthday()
    {
    	DateFormat formatter=new SimpleDateFormat("dd.MM.yyyy");
    	return formatter.format(this.birthday).toString();
    }

	//other methods:
    public void print()
    {
    	System.out.println(getFirstName()+"\t"+getLastName()+"\t"+getBirthday());
    }
}
