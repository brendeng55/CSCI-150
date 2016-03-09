/**
 * 
 * Lab11
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  9/23/2015
 * 
 * This program is an example showing the usefulness of inheritance 
 * 
 */

public class Lab11 {

	public static void main(String[] args) {
		
		//Create a Person object and print the results
		Person person = new Person("Casey Goldman", 1985);
		System.out.println(person.toString());
		
		//Create a Student object and print the results
		Student student = new Student("Information Systems", "Brenden Goldman", 1987);
		System.out.println(student.toString());

		//Create a Instructor object and print the results
		Instructor instructor = new Instructor("Gene Simmons", 1910, 50000.00);
		System.out.println(instructor.toString());
	}

}
