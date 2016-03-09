import java.util.Comparator;

/**
* 
* Prog4
* CSCI 150
* Programmer: Brenden Goldman
* Last Revised:  10/25/2015
* 
* Sort Students by last and first names
* 
*/

	public class LastNameFirstNameComparator implements Comparator<Student>
		{
			public int compare(Student a, Student b) {
				if(a.getLname().compareTo(b.getLname()) < 0) return -1;				
				if(a.getLname().compareTo(b.getLname()) > 0) return 1;
				if(a.getLname().compareTo(b.getLname()) == 0) 
					{
						if(a.getFname().compareTo(b.getFname()) < 0) return -1;				
						if(a.getFname().compareTo(b.getFname()) > 0) return 1;					
					}
				return 0;
			}
		}