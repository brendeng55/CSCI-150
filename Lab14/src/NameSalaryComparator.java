

public class NameSalaryComparator implements java.util.Comparator<Employee>
{
	public int compare(Employee a, Employee b)
	{
	if(a.getName().compareTo(b.getName()) < 0) return -1;				
	if(a.getName().compareTo(b.getName()) > 0) return 1;
	if(a.getName().compareTo(b.getName()) == 0) 
		{
			if(a.getSalary() < b.getSalary()) return -1;				
			if(a.getSalary() > b.getSalary()) return 1;
				
		}
	return 0;
	}
}
