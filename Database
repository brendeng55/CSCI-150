import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * Prog4
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/25/2015
 * 
 * Database to hold Course and roster lists
 * 
 */

public class Database 
{	
	
	private ArrayList<Course> db;
	private String courseName;
	private String courseNum;
	private int section;
	Course c;
	
		/**
		 * Database constructor
		 */
	public Database()
		{
			db = new ArrayList<Course>();
		}
	
	/**
	 * @return the courseName
	 */
	public String getCourseName(int i)
		{
			return db.get(i).getCourseName();
		}
	
	/**
	 * Add student to roster
	 * @param dbSpot index of roster to add student to 
	 * @param s student to add to roster
	 */
	public void addToRoster(int dbSpot, Student s)
	{
		db.get(dbSpot).addStudent(s);
	}
	
	/**
	 * Add Grade to student
	 * @param dbSpot index of roster to get
	 * @param letterGrade letterGrade to enter
	 * @param i index of students inside the roster
	 */
	public void addGrade(int dbSpot, String letterGrade, int i)
		{
			db.get(dbSpot).getRoster(i).setLetterGrade(letterGrade);			
		}
	
	/**
	 * Gets size of roster
	 * @param dbSpot index of roster 
	 * @return return number of students enrolled
	 */
	public int getRosterSize(int i)
	{
		return db.get(i).getNumEnrolled();
	}
	
	/**
	 * Create full name 
	 * @param dbSpot index of course
	 * @param i index of student
	 * @return full name
	 */
	public String getFullName(int dbSpot, int i)
	{
		return db.get(dbSpot).displayName(i);		
	}
	
	/**
	 * 
	 * @param dbSpot index of course
	 * @param i index of student
	 * @return return last name, first name - letter grade
	 */
	public PrintStream getNameAndGrade(int dbSpot, int i)
	{
		return db.get(dbSpot).displayNameAndGrade(i);
	}

	
	/**
	 * @return the section
	 */
	public int getSectionNum(int i)
		{
			return db.get(i).getSection();
		}

	/**
	 * Populate database with text file
	 */
	public void readFile()
	{	
		File file = new File("prog4.txt");
	try
		{
			Scanner fileScan = new Scanner(file);
			while(fileScan.hasNext())
				{
			courseName = fileScan.next();
			courseNum = fileScan.next();
			section = fileScan.nextInt();
			courseName = courseName + " " + courseNum;
			c = new Course(courseName, section, 0);
			db.add(c);		
				}
			fileScan.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("prog4.txt was not found.");
		}			
	}
	
	/**
	 * Get the current size of the database
	 * @return return the size
	 */
	public int getDbSize()
	{
		return db.size();
	}
		
	/**
	 * Add course to the database
	 * @param c course to be added to database
	 */
	public void addCourse(Course c)
	{
		db.add(c);
	}
	
	/**
	 * Find the index of course 
	 * @param courseName name of course
	 * @param courseSection section number of course
	 * @return return index of course, or -1 if the course does not exist
	 */
	public int find(String courseName, int courseSection)
		{			
			for(int i=0;i<db.size(); i++)
				{
					if (courseName.equals(db.get(i).getCourseName()) && courseSection == db.get(i).getSection())
								{
									return i;
								}	
				}
			return -1;
		}
	
	/**
	 * Sort courses by name and section
	 */
	public void sortCourses()
		{
				Collections.sort(db, new NameCourseSectionComparator());		
		}
}
