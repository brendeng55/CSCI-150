import java.util.Arrays;

/**
 * 
 * Lab14
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/14/2015
 * 
 * This program uses comparator classes to sort array.
 * 
 */

public class Lab14
{

	public static void main(String[] args)
		{
			Employee[] emp = new Employee[5];

			emp[0] = new Employee("sam", 1000);
			emp[1] = new Employee("john", 500);
			emp[2] = new Employee("sue", 900);
			emp[3] = new Employee("sam", 800);
			emp[4] = new Employee("sam", 100);
		
			
			System.out.println("Sorting the employees by salary \n");
			Arrays.sort(emp, new SalaryComparator());

			for (int i = 0; i < emp.length; i++)
				{
					System.out.println(emp[i].getName() + " " + emp[i].getSalary());
				}
			System.out.println("");
			
			System.out.println("Sorting the employees by name \n");
			Arrays.sort(emp, new NameComparator());

			for (int i = 0; i < emp.length; i++)
				{
					System.out.println(emp[i].getName() + " " + emp[i].getSalary());
				}
			
			System.out.println("");

			System.out.println("Sorting the employees by name and salary \n");
			Arrays.sort(emp, new NameSalaryComparator());

			for (int i = 0; i < emp.length; i++)
				{
					System.out.println(emp[i].getName() + " " + emp[i].getSalary());
				}

		}

}
