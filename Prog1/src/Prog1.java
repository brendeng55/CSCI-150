import java.util.Scanner;

/**
 * 
 * Prog1
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  8/31/2015
 * 
 * This program simulates a lady bug crawling on the ground, how fun!
 * 
 */

public class Prog1 
{
	
	public static void main(String[] args) 
	{
		
		String playerDecision; //User input to either move, turn, get or quit
		boolean done = false; //Sentinel value to determine when game is over
		
		
		Bug ladyBug = new Bug(10); //New Bug object created with a parameter of 10
		
		Scanner in = new Scanner(System.in); //New Scanner object created for user input
		
		//Welcome message and game options
		System.out.println("You're in control of lady bug! Choose your option:");
		System.out.println("t = turn");
		System.out.println("m = move");
		System.out.println("g = get position");
		System.out.println("q = quit");
		
		//Keep going until user enters q to quit
		while(!done)
		{
		
			System.out.println("What's your move? (t, m, g or q)"); //Prompt user for move
			
			playerDecision = in.next(); //Store users move
			playerDecision = playerDecision.toLowerCase(); //If user entered capital letter, convert it to lower case
			
				//Game logic to determine what the player entered
				if(playerDecision.equals("t"))
				{
					ladyBug.turn();
				}else if(playerDecision.equals("m"))
				{
					ladyBug.move();
				
				}else if(playerDecision.equals("g"))
				{
					System.out.println("Current Position: " + ladyBug.getPosition()); //Display the bug's current position
				}
				else if(playerDecision.equals("q"))
				{
					done = true; //Break out of loop
				}else{
					System.out.println("Please choose one of the f options (t,m, g or q)");
				}
		
		} //End of while loop
		
		System.out.println("Final Position: " + ladyBug.getPosition()); //Display the bug's final position
		System.out.println("Goodbye! ");
		
		in.close(); //Close scanner
		
	}
}
