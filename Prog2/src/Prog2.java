import java.util.Scanner;

/**
 * 
 * Prog2 CSCI 150 
 * Programmer: Brenden Goldman 
 * Last Revised: 9/9/2015
 * 
 * This program simulates a cash register
 * 
 */

public class Prog2 {

	public static void main(String[] args) 
	{

		CashRegister cr = new CashRegister(); //Create new CashRegister object
		Scanner in = new Scanner(System.in); // New Scanner object created for user input
		boolean done = false; // Sentinel value to determine when input is over
		String decision; // User input
		double itemPrice; // price of item entered by user
		double grandTotal = 0; // Running total of all transactions

		// Menu
		System.out.println("What would you like to do?");
		System.out.println("A = add item");
		System.out.println("T = total");
		System.out.println("C = clear");
		System.out.println("D = display");
		System.out.println("Q = quit");

		// Keep going until user enters q to quit and n for no more customers
		while (!done) 
		{

			System.out.println("What would you like to do? (A, T, C, D or Q)"); // Prompt user
			decision = in.next(); // Store users decision
			decision = decision.toUpperCase(); // Convert to upper case
												
			// Logic to determine user input
			if (decision.equals("A")) 
			{
				System.out.print("Item Price: ");
				itemPrice = in.nextDouble();
				cr.addItem(itemPrice);
			} 
			else if (decision.equals("T")) 
			{
				System.out.println("Total: $" + cr.getTotal());
			} 
			else if (decision.equals("C")) 
			{
				cr.clear();
			} 
			else if (decision.equals("D")) //Display 
			{
				cr.displayAll();
				
			}
			else if (decision.equals("Q")) 
			{
				grandTotal += cr.getTotal(); //Keep track of total
				cr.displayAll();
				System.out.printf("%10.2f Total \n", cr.getTotal());
				System.out.printf("Number items: %d \n", cr.getCount());

				System.out.print("Do you have another customer?(Y/N)");
				decision = in.next();
				decision = decision.toUpperCase();
				if (decision.equals("Y")) 
				{
					cr.clear();

				} 
				else if (decision.equals("N")) 
				{
					done = true; // Break out of loop
					System.out.print("Total for day: $" + grandTotal); //Print grandTotal before terminating 
				}

			} 
			else 
			{
				System.out.println("Please choose one of the options (A, T, C, D or Q)");
			}

		} // End of while loop

		in.close(); //Close scanner
	}

}
