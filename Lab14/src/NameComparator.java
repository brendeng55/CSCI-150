import java.util.Comparator;


public class NameComparator implements Comparator<Employee>
{
	public int compare(Employee a, Employee b)
		{
			if(a.getName().compareTo(b.getName()) < 0) return -1;				
			else if(a.getName().compareTo(b.getName()) > 0) return 1;
			else return 0;
		}
}
