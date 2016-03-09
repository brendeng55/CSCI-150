
public class Student extends Person
{
	private String major;
	
	public Student(String aMajor, String aName, int aYearOfBirth)
	{
		super(aName, aYearOfBirth);
		major = aMajor;
	}

	public String toString()
	{
		return super.toString() + "Major: " + major + "\n";
	}
	

}
