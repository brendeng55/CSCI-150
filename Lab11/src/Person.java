
public class Person 
{
	
	private String name;
	private int yearOfBirth;
	
	public Person(String aName, int aYearOfBirth)
	{
		name = aName;
		yearOfBirth = aYearOfBirth;
	}
	
	public String toString()
	{
		return "Name: " + name + " \n" + "Year of Birth: " + yearOfBirth + "\n";
	}
	
}
