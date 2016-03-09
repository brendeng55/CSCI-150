import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Prog4
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/25/2015
 * 
 * 
 * This program simulates a small college's database.
 */

public class Prog4
{

	public static void main(String[] args)
		{
			//Boolean instance variables
			boolean done = false;
			boolean enrollStudentDone;
			
			//String instance variables
			String userInput;
			String letterGrade;
			String courseName;
			String courseNum;
			String fname;
			String lname;
			
			//Integer instance variables
			int courseSection;
			int dbSpot;
			
			//Scanner object
			Scanner in = new Scanner(System.in);
			
			//Custom objects
			Database db;
			Course c;
			Student s;
			
			//Initialize database and read in text file to populate courses 
			db = new Database();
			db.readFile();
			
			//While not done
			while(!done)
				{
					System.out.println("1)List courses 2)Enroll student"
							+ " 3)Sort courses 4)Enter grades 5)Display roll"
							+ " 6)Add course 7)Quit");					
					userInput = in.nextLine();
					
					//If 1, display list of courses
					if(userInput.equals("1"))
						{
							System.out.println("Name:   Sec:  #:");
							for(int i=0;i<db.getDbSize();i++)
								{
									
									System.out.printf("%-10s %1d %2d \n", db.getCourseName(i), db.getSectionNum(i), 
											db.getRosterSize(i));
									
								}
						}//End of if '1' option
					
					//If 2, Get student and course name and the student to the course
					if(userInput.equals("2"))
						{
							try
								{
							System.out.println("Enter student's first and last name: (EX. Brenden Goldman)");
							fname = in.next();
							lname = in.next();
							
							enrollStudentDone = false;
							
							while(!enrollStudentDone)
								{
							System.out.println("Enter course name, course number and section number to enroll " + fname + " " + lname + " in (EX. CSCI 150 2):");
							courseName = in.next();						
							courseNum = in.next();
							courseName = courseName.toUpperCase() + " " + courseNum.toUpperCase();
							courseSection = in.nextInt();
							
							dbSpot = db.find(courseName, courseSection);
						
									//if dbSpot is > 0, create new student object and add it to the roster of the specified course
									if(dbSpot >= 0)
										{
									 s = new Student(fname, lname, null);	
									db.addToRoster(dbSpot, s);
									System.out.println(fname + " " + lname + " enrolled in " + courseName + " section " + courseSection );
									
										}
									
									//if dbSpot = -1 the course is not in the list
									if(dbSpot == -1)
										{
											System.out.println("Course not found.");
										}
									
								
									System.out.println("Enroll in another class? (y/n)");
									userInput = in.next();
									in.nextLine();
									
									//Break out of loop if user is done registering for courses
									if(userInput.equalsIgnoreCase("n")) enrollStudentDone = true;									
								}		
							}//End of try block
							catch(InputMismatchException e)
								{
									in.nextLine(); //Consume next line character
									System.out.println("Wrong input, please use format of example.");
								}					
						}//End of if '2' option
					
					//Sort courses 
					if(userInput.equals("3"))
						{
								db.sortCourses();
								System.out.println("Courses Sorted.");
						}//End of if '3' option
					
					//Ask for course, display roster and ask for grades
					if(userInput.equals("4"))
						{
							try
								{
							System.out.println("What course and section would you like to enter grades for(EX. CSCI 150 2)?");
							courseName = in.next();						
							courseNum = in.next();
							courseName = courseName.toUpperCase() + " " + courseNum.toUpperCase();
							courseSection = in.nextInt();
							dbSpot = db.find(courseName, courseSection);
							in.nextLine();
							
							 if(dbSpot == -1)
								{									
									System.out.println("Course does not exist.");
								}
							 else if(db.getRosterSize(dbSpot) == 0)
								{
									System.out.println("Course does not have any students.");
								}
														
							 else
								{									
									for(int i=0;i< db.getRosterSize(dbSpot);i++)
										{
											System.out.println("Enter grade for " + db.getFullName(dbSpot, i) + "(EX. A+):");										
											letterGrade = in.nextLine();
											db.addGrade(dbSpot, letterGrade, i);
										}
									System.out.println("End of student list.");							
								}
							}//End of try block 
							catch(InputMismatchException e)
									{
										in.nextLine();
										System.out.println("Wrong input, please use format of example.");
									}	
						}//End of if '4' option
					
					//Prompt for course and then display roster with grades
					if(userInput.equals("5"))
						{
							try
								{
							System.out.println("Enter course name and section to see the roll (EX CSCI 150 1):");
							courseName = in.next();						
							courseNum = in.next();
							courseName = courseName.toUpperCase() + " " + courseNum.toUpperCase();
							courseSection = in.nextInt();
							dbSpot = db.find(courseName, courseSection);
							in.nextLine();
							
							 if(dbSpot == -1)
								{							
									System.out.println("Course does not exist.");
								}
							 else if(db.getRosterSize(dbSpot) == 0)
								{
									System.out.println("Course does not have any students.");
								} 
							 else
								{
									try
										{
									System.out.println(courseName + " " + courseSection + " roster:");
									db.c.sortNames();
									
									for(int i=0;i< db.getRosterSize(dbSpot);i++)
										{			
											db.getNameAndGrade(dbSpot,i);	
										}
										}//End of inner try block
									
									//If user has not entered grades yet it will throw a NullPointerException error
									//Because we initialized student grade to null
									catch(NullPointerException e)
										{
											System.out.println("You must enter grades first");
										}
								}
							}//End of outer try block
							catch(InputMismatchException e)
								{
									in.nextLine();
									System.out.println("Wrong input, please use format of example.");
								}	
						}//End of if '5' option
					
					//Prompt for course info and add it to the database
					if(userInput.equals("6"))
						{
							
							System.out.println("Enter course name, course number and section number to add(EX. CSCI 150 2):");
							courseName = in.next();						
							courseNum = in.next();
							courseName = courseName.toUpperCase() + " " + courseNum.toUpperCase();
							courseSection = in.nextInt();						
							dbSpot = db.find(courseName, courseSection);
							
							//If course is not in the database then create and add it
							if(dbSpot == -1)
								{
							c = new Course(courseName, courseSection, 0);
							db.addCourse(c);
							System.out.println("Course added.");
								}
							else //Course is already in database
								{
									System.out.println("Course already exists in the database.");
								}
							in.nextLine(); //Consume new line character
						}//End of if '6' option
					
					//Exit program by switching boolean value to true
					if(userInput.equals("7"))
						{
							System.out.println("Exiting program.");
							done = true;
						}//End of if '7' option
				}//End of while loop
				
			//Close scanner
			in.close();
		}//End of Main
}//End of Class