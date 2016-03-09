import java.util.Comparator;


public class SalaryComparator implements Comparator<Employee>
{

	public int compare(Employee a, Employee b)
	{
		if(a.getSalary() > b.getSalary()) return 1;
		else if(a.getSalary() < b.getSalary()) return -1;
		else return 0;
	}
}
