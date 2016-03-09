import java.util.Arrays;

/**
 * This program takes an array and rotates it one place forward, taking the end element and placing it at the beginning. 
 * @author Brenden
 *
 */

public class Lab2 {

	/**
	 * Entry into the program
	 * @param args command line args
	 */
	
	public static void main(String[] args){
	
		String hey = "Hello";
		
		for(int i = hey.length() - 1; i >= 0; i--)
			{
				System.out.print(hey.charAt(i));
			}
		
	}
	
}
