import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * Lab16
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/26/2015
 * 
 * This program attempt to guess your last name, with a little help of course.
 * 
 */

public class Lab16
{

	public static void main(String args[]) throws MalformedURLException, IOException
	{
		ArrayList<String> lastNames = new ArrayList<String>();
		URL url = new URL("http://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");
		
		String currentName;
		Scanner in = new Scanner(url.openStream());
		System.out.println("This program tries to guess your last name, but you have to give some hints.");
		
		//Enter code for reading all names and sorting them
		while(in.hasNext())
			{
				currentName = in.next();
				in.nextLine();
				lastNames.add(currentName);	
			}
		//Sort data
		Collections.sort(lastNames);
		
		//Call method
		guessName(lastNames);
		in.close();
	}
	
	
	public static void guessName(ArrayList<String> lastNames)
	{
		int low = 0;
		int high = lastNames.size();
		int mid = (low + high) / 2;
		boolean found = false;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String userInput;
		String usersName;

		
		while(!found)
			{
				
				System.out.println("Is your name \"" + lastNames.get(mid) + "\"? (Y/N)");
				userInput = in.nextLine();
				
				if(userInput.equalsIgnoreCase("y"))
					{
						usersName = lastNames.get(mid);
						System.out.print("Your name is " + lastNames.get(mid) + "!!!");
						found = true; 
						break;
					}
				
				System.out.println("Does your name come before " + lastNames.get(mid) + " in the dictionary? (Y/N)");
				userInput = in.nextLine();	
				
				if(userInput.equalsIgnoreCase("y"))
					{
						
						high = mid - 1;
						mid = (low + high) / 2;
					}
				else 
					{
						low = mid + 1;
						mid = (low + high) / 2;
					}						
			}
	}
}
