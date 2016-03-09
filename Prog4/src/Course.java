import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Prog4
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/25/2015
 * 
 * Course object
 * 
 */

public class Course
{
	private String courseName;
	private int section;
	private int numEnrolled;
	private ArrayList<Student> roster;
	
	public Course(String courseName, int section, int numEnrolled)
	{
		this.courseName = courseName;
		this.section = section;
		this.numEnrolled = numEnrolled;
		roster = new ArrayList<Student>();
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName()
		{
			return courseName;
		}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName)
		{
			this.courseName = courseName;
		}

	/**
	 * @return the section
	 */
	public int getSection()
		{
			return section;
		}

	/**
	 * @param section the section to set
	 */
	public void setSection(int section)
		{
			this.section = section;
		}

	/**
	 * @return the numEnrolled
	 */
	public int getNumEnrolled()
		{
			return numEnrolled;
			
		}

	/**
	 * @param numEnrolled the numEnrolled to set
	 */
	public void setNumEnrolled(int numEnrolled)
		{
			this.numEnrolled = numEnrolled;
		}
		
	/**
	 *  
	 * @param s student to be added 
	 */
	public void addStudent(Student s)
		{
			roster.add(s);
			numEnrolled++;
		}
	
	/**
	 * 
	 * @return return roster size
	 */
	public int getRosterSize()
	{
		return this.roster.size();
	}
	
	/**
	 * 
	 * @param dbSpot index of needed roster
	 * @return return roster
	 */
	public Student getRoster(int dbSpot)
	{
		return roster.get(dbSpot);
	}

	/**
	 * 
	 * @param i index of roster to get
	 * @return return full name
	 */
	public String displayName(int i)
	{
		return roster.get(i).getFname() + " " + roster.get(i).getLname();
	}
	
	/**
	 * 
	 * @param i index of roster to get
	 * @return return full name in reverse and add letter grade
	 */
	public PrintStream displayNameAndGrade(int i)
		{
			return System.out.printf("%s, %s - %s \n", roster.get(i).getLname(), roster.get(i).getFname(), roster.get(i).getLetterGrade().toUpperCase());
		}
	
	/**
	 * Sort names alphabetically 
	 */
	public void sortNames()
		{
			Collections.sort(roster, new LastNameFirstNameComparator());				
		}
}