import java.util.Comparator;

/**
 * 
 * Prog4
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/25/2015
 * 
 * Sort Courses by comparing names and sections
 * 
 */

public class NameCourseSectionComparator implements Comparator<Course>
{
	public int compare(Course a, Course b) {
		if(a.getCourseName().compareTo(b.getCourseName()) < 0) return -1;				
		if(a.getCourseName().compareTo(b.getCourseName()) > 0) return 1;
		if(a.getCourseName().compareTo(b.getCourseName()) == 0) 
			{
				if(a.getSection() < b.getSection()) return -1;				
				if(a.getSection() > b.getSection()) return 1;					
			}
		return 0;
	}
}
