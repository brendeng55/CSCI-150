import java.util.Scanner;


/**
 * 
 * Lab15 
 * CSCI 150 
 * Programmer: Brenden Goldman 
 * Last Revised: 10/16/2015
 * 
 * This program prompts for a string and then reverses it using recursion 
 * 
 */

public class Lab15
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.println("PLease enter a string:");
		userInput = in.nextLine();
		
		System.out.print(reverse(userInput));;
		
		in.close();
	}

	public static String reverse(String userInput) 
		{
		//Base Case
	    if (userInput.length() <= 1) {
	        return userInput;
	    }
	    //Recursion happens here when we call reverse again
	    return reverse(userInput.substring(1)) + userInput.charAt(0);
	}
}
