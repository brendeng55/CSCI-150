/**
 * 
 * Prog 6
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/30/2015
 * 
 * Term class
 * 
 */

public class Term
{
	//Private instance variables 
	private int co;
	private int exponent;
	
	//Constructor 
	public Term(int co, int exponent)
	{
		this.co = co;
		this.exponent = exponent;
	}

	/**
	 * @return the coefficient
	 */
	public int getCoefficient()
		{
			return co;
		}

	/**
	 * @param coefficient the coefficient to set
	 */
	public void setCoefficient(int co)
		{
			this.co = co;
		}

	/**
	 * @return the exponent
	 */
	public int getExponent()
		{
			return exponent;
		}

	/**
	 * @param exponent the exponent to set
	 */
	public void setExponent(int exponent)
		{
			this.exponent = exponent;
		}
}//End class
