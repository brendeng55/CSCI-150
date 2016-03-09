/**
 * 
 * Prog 6
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/30/2015
 * 
 * This program adds 2 polynomials together.
 * 
 */

public class Prog6
{

	public static void main(String[] args)
		{
			//Create first polynomial and prompt for input
			Polynomial p = new Polynomial();
			System.out.println("Enter first Polynomial:");
			p.input();
			
			//Create second polynomial and prompt for input
			Polynomial q = new Polynomial();
			System.out.println("Enter second Polynomial:");
			q.input();
			
			//Display individual polynomials
			System.out.println("First Polynomial:");
			System.out.println(p.toString());
			System.out.println("Second Polynomial:");
			System.out.println(q.toString());
			
			//Create result polynomial to store p + q
			Polynomial result = p.addPolynomial(q);	
			
			//Print result 
			System.out.println("Polynomials added:");
			System.out.println(result);
			
			
		}//End main

}//End Class
