/**
 *The Bug class contains the options the user can choose from
 */
public class Bug 
{

	private int currentPosition; //lady bug's current position
	private int direction = 1; //Determines if we will move left or right
	
	/**
	 * Constructs an initial position for our bug
	 * @param initialPosition initial position of our bug
	 */
	public Bug(int initialPosition)
	{
		currentPosition = initialPosition;
	}
	
	/**
	 * Turn method changes the current value of direction every time its called upon
	 */
	
	public void turn()
	{
		if(direction == 1)
		{
			direction = -1; //Turn left
		}else
		{
			direction = 1; //Turn right
		}
	}
	
	/**
	 * The move method determines if the turn method was called, then advances in the correct direction
	 */
	public void move()
	{
		if(direction == 1)
		{
			currentPosition += 1; //We move right 1 
		}
		else
		{
			currentPosition -= 1; //We move left 1
		}
	}
	
	/**
	 * Gets the current position of our lady bug
	 * @return current position
	 */
	public int getPosition()
	{
		return currentPosition;
	}
}
