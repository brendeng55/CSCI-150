import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Prog5
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/05/2015
 * 
 * This program simulates a line for an ATM machine.
 * 
 */

public class Prog5
{

	public static void main(String[] args)
		{
			//Integer variables 
			int currentTime = 0; //Simulation starts at 0 minutes and increments per minute
			int timeLimit = 60; //Simulation stops after 60 loops
			int numOfCustomersToAdd; //Stores return value of either 0, 1 or 2
			int totalAmountOfCustomersServed = 0; //Incremental count of total customers served
			int waitTime = 0; //Stores total amount of wait time 
			int timeInLine = 0; //A customer can either be a 1,2 or 3 minute customer
						
			//Boolean variable
			boolean removed = false;
			
			//Customer and Queue objects created
			Customer c, c1;
			Queue<Customer> atm = new LinkedList<Customer>();
			
			//While loop will run 60 times
			while(currentTime < timeLimit)
				{		 
					if(timeInLine > 0) timeInLine--; //Decrement variable 
					
					if(removed && timeInLine == 0)
						{
							removed = false; //Set to false in order to get a new timeInLine
							totalAmountOfCustomersServed++; //Count the customer before removing						
							atm.remove(); //Remove since timeInLine is at 0
							
							//As long as someone is in line, get how long they have been waiting
							if(atm.size() > 0)
								{
									//Increment waitTime with new calculation as long as someone was waiting
									waitTime += currentTime - atm.peek().getArrivalTime(); 
								}
						}
								
					//Determine how many customers show up (0, 1 or 2) 
					numOfCustomersToAdd = addCustomers();
					
					//Add 1 customer
					if(numOfCustomersToAdd == 1)
						{
							c = new Customer(occupyTime(), currentTime);
							atm.add(c);									
						}
					
					//Add 2 customers 
					if(numOfCustomersToAdd == 2)
						{
							c = new Customer(occupyTime(), currentTime);
							c1 = new Customer(occupyTime(), currentTime);
							atm.add(c);
							atm.add(c1);										
						}
									
					if(atm.size() > 0 && !removed && timeInLine == 0)
						{
							removed = true;
							//The time the front customer will spend at the machine (1,2 or 3)
							timeInLine = atm.peek().getOccupyTime();
						}
					 
					//Increment 
					currentTime++;
				}//End of while loop
			
			//totalAmountOfCustomersServed = the number of customers removed from Queue
			System.out.println("Customers served: " + totalAmountOfCustomersServed);
			//Average time in line = waitTime total / totalAmountOfCustomersServed
			System.out.println("Average time in line: " + waitTime/totalAmountOfCustomersServed + " minutes");
			//Customers still in line is the remaining number still in the Queue
			System.out.println("Customers still in line: " + atm.size());
			
		}//End of main
	
	/**
	 * Determine how much time will be spent at the machine
	 * @return return the amount of minutes 
	 */
	public static int occupyTime()
	{
		double num;
		num = Math.random();		
			if(num < .333) return 1; //.333% chance
			else if(num < .666) return 2; //.333% chance
			else return 3; //.333% chance
	}
	
	/**
	 * Determine how many customers will be added to the queue
	 * @return return the number of customers to be added to the queue
	 */
	
	public static int addCustomers()
	{
		double num;
		num = Math.random();		
			if(num < .5) return 0; // 50% chance
			else if(num < .9) return 1; // 40% chance
			else return 2; // 10% chance
	}

}//End of Class
