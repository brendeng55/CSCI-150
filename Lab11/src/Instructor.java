
public class Instructor extends Person
{
	private double salary;
	
	public Instructor(String aName, int aYearOfBirth, double aSalary) {
		super(aName, aYearOfBirth);
		salary = aSalary;		
	}

	public String toString()
	{
		return super.toString() + "Salary " + salary;
	}
	
}
