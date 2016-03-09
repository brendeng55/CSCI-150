/**
 * 
 * Lab13
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/13/2015
 * 
 * This program sorts an array list of Employee Objects by name and salary
 * 
 * 
 */

public class Lab13
{

	public static void main(String[] args)
		{
			Employee[] emp = new Employee[5];

			emp[0] = new Employee("sam", 1000);
			emp[1] = new Employee("john", 500);
			emp[2] = new Employee("sue", 900);
			emp[3] = new Employee("sam", 800);
			emp[4] = new Employee("sam", 100);
		
			
			System.out.println("Sorting the employees by name first, and salary second: \n");
			SelectionSorter.sort(emp);

			for (int i = 0; i < emp.length; i++)
				{
					System.out.println(emp[i].getName() + " " + emp[i].getSalary());
				}
		}
}