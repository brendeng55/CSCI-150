import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * 
 * Prog 6
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/30/2015
 * 
 * Polynomial Class
 * 
 */
public class Polynomial
{

	//Only instance variable
	private LinkedList<Term> list;
	
	//Constructor initializes list
	public Polynomial()
	{
		list = new LinkedList<Term>();
	}
	
	/**
	 * Adds a Term to the calling polynomial
	 * @param t term to be added
	 */	
	public void addTerm(Term t)
	{
		//list Iterator 
		ListIterator<Term> iterator = list.listIterator();
		
		//Int values to store coefficient and exponent of term
		int co = t.getCoefficient();
	    int ex = t.getExponent();
	    
	    //Boolean to determine 
	    boolean has= false;
	    
	    //Current term
	    Term current;
	     
	    //If list is empty go ahead and add the first term in
	     if (list.isEmpty())list.addFirst(t);
    
	     //Check to see if term has same exponent
	     else 
	    	 { 
	          while (iterator.hasNext() && !has)
	        	  {
	               current = (Term)iterator.next();
	               if( ex == current.getExponent())
	            	   {
	            		//If the terms have the same exponents we add the coefficients together
	            		   current.setCoefficient(current.getCoefficient() + co);
	                    has = true;
	            	   }//end if
	               
	               //Check to see exponent is larger
	               else if(ex > current.getExponent())
	            	   {
	            		   iterator.previous();
	            		   iterator.add(t);
	            		   has = true;
	            	   }
	        	  }//End while
	     if (!has)
	          list.addLast(t);
	    	 }//End else
	}
	
	public Polynomial addPolynomial(Polynomial q)
	{
			//Holds results of p + q
		    Polynomial result = new Polynomial();
			
		    //Iterators for polinomials 
			ListIterator<Term> piterator = list.listIterator();
			ListIterator<Term> qiterator = q.list.listIterator();
			
			//Term objects
			Term pTerm;
			Term qTerm;

			while (piterator.hasNext() && qiterator.hasNext()) 
				{
					//Store term then return to previous to keep us on track
					pTerm = piterator.next();
				    piterator.previous();
				    qTerm = qiterator.next();
				    qiterator.previous();
		            
			        //If exponents are the same, add the coefficients together
				    if (pTerm.getExponent() == qTerm.getExponent())
				    	{
			                Term term1 = new Term((pTerm.getCoefficient() + qTerm.getCoefficient()),pTerm.getExponent());
			                result.list.addLast(term1);
			                piterator.next();
			                qiterator.next();
				    	}
			        //If q's exponent is larger, we add it 
				    else if (pTerm.getExponent() < qTerm.getExponent())
				    	{
			                Term term2 = new Term(qTerm.getCoefficient(),qTerm.getExponent());
			                result.list.addLast(term2);
			                qiterator.next();
				    	}
				    //Else we add p's (since it's larger)
				    else 
				    	{
			                Term term3 = new Term(pTerm.getCoefficient(),pTerm.getExponent());
			                result.list.addLast(term3);
			                piterator.next();
				    	}
			}//End while 
			
			//In case this list still has terms
			while (piterator.hasNext())
				{
				pTerm = piterator.next();
		            Term term4 = new Term(pTerm.getCoefficient(),pTerm.getExponent());
		            result.list.addLast(term4);
				}
			//In case this list still has terms
			while (qiterator.hasNext())
				{
				qTerm = qiterator.next();
		            Term term5 = new Term(qTerm.getCoefficient(),qTerm.getExponent());
		            result.list.addLast(term5);
				}
			//Return our result polynomial
			return result;
	}
			
	/**
	 * Turn our polynomial into a string
	 */
	public String toString()
	{
		//Needed variables
		ListIterator<Term> iterator = list.listIterator();
		Term nextTerm;
		String result = "";
		boolean firstTerm = true;
	        
	       //Handle special cases for when Gene tries to break it
		while (iterator.hasNext()) 
			{
		    nextTerm = iterator.next();
		    
		    //firstTerm boolean value makes sure the first term
		    //Doesn't have a plus sign in front of it
		    if ((nextTerm.getCoefficient() > 0) && !firstTerm)
		    	{
		    		result += "+ ";
		    		firstTerm = false;
		    	}
		    
		    //Handle special cases
	        if (nextTerm.getCoefficient() == 0)
	                result += "";
	        else if (nextTerm.getExponent() == 1)
	                result += nextTerm.getCoefficient() + "x ";
            else if (nextTerm.getCoefficient() == 1)
	                result += "x^" + nextTerm.getExponent() + " ";
            else if (nextTerm.getCoefficient() == -1)
	                result += "-x^" + nextTerm.getExponent() + " ";
	        else if (nextTerm.getExponent() == 0)
	                result += nextTerm.getCoefficient() + " ";
	        else
	                result += nextTerm.getCoefficient() + "x^" + nextTerm.getExponent() + " ";
	        
	        //firstTerm = false since we will be working on the 
	        //second term next go around
	        firstTerm = false;
		}
			//If result is empty we return 0 instead of an empty string
	        if (result.equals(""))
	            result = "0";
	        
	    //Return final string
		return result;
		
	}//End toString method
	
	/**
	 * Prompt for input and create new term for each co/exponent entered
	 */
	public void input()
	{
		//Needed variables
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Term t;
		int co, exponent;		
		
		
		//Prompt
		System.out.println("Add terms by inputting coefficient followed by the exponent (EX. 3 2) q to quit:");
		
		//Prime co to 0 to enter loop
		co = 0;
		
		//Continue input until user enters q
		while (in.hasNextInt())
		{
		try{
		co = in.nextInt();
		exponent = in.nextInt();
		
		//Create new Term object and add it to list	
		t = new Term(co, exponent);
		addTerm(t);
		}catch(InputMismatchException e)
			{
				 //Break from loop, input is done when letter is entered
			}
			
		
		}//End while
	}//End input method
}//End class


