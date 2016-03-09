/**
 * 
 * Prog5
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/05/2015
 * 
 * Customer class
 * 
 */

public class Customer
{

	private int arrivalTime;
	private int occupyTime;
	
	public Customer(int occupyTime, int arrivalTime)
	{
		this.occupyTime = occupyTime;
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public int getArrivalTime()
		{
			return arrivalTime;
		}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(int arrivalTime)
		{
			this.arrivalTime = arrivalTime;
		}

	/**
	 * @return the inLineTime
	 */
	public int getOccupyTime()
		{
			return occupyTime;
		}

	/**
	 * @param inLineTime the inLineTime to set
	 */
	public void setOccupyTime(int inLineTime)
		{
			this.occupyTime = inLineTime;
		}
	
}
