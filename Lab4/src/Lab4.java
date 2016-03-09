
/**
 * 
 * Lab4 - Counter class example
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  8/26/2015
 * 
 * This program demonstrates the Counter class.
 * 
 */

public class Lab4
{
   public static void main(String[] args)
   {
	  //Create new Counter object
      Counter tally = new Counter();
    
      //Click the "button" 2 times
      tally.count();
      tally.count();
      
      //Undo 1 click
      tally.undo();
      //tally.undo(); //Uncomment tally.undo() to check the negative cases
      //tally.undo(); //Uncomment tally.undo() to check the negative cases
      
      //Get value 
      int result = tally.getValue();
      
     
    	  System.out.println("Value: " + result);
      
     
   }
}