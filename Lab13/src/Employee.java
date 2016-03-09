public class Employee implements Comparable

{
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
		{
			this.name = name;
			this.salary = salary;
		}

	/**
	 * Compare names and salaries amongst each other to determine order. Names will be alphabetically sorted
	 * and salaries are in ascending order with their corresponding name.
	 */
	public int compareTo(Object otherObj)
		{
			Employee e = (Employee) otherObj;
			
			if(this.name.compareTo(e.getName()) < 0) //If this.name is smaller
				{
					return -1;
				}
			
			if(this.name.compareTo(e.getName()) > 0) //If this.name is larger
				{
					return 1;
				}
			
			//If the names are the same then sort the same names by salary (using code provided by professor)
			if(this.name.compareTo(e.getName()) == 0) //If names are the same
				{
					if(this.salary < e.getSalary())
						{
							return -1;
						}
					if(this.salary > e.getSalary())
						{
							return 1;
						}
				}
			return 0; //Return 0 if names and salary are equal
		}

	public String getName()
		{
			return name;
		}

	public double getSalary()
		{
			return salary;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public void setSalary(double salary)
		{
			this.salary = salary;
		}

}

