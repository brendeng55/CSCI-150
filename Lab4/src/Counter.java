public class Counter
{
   private int value; //Value of the number of clicks
   
   
   /**
    *  Constructs a Counter object whose value is 
    *  initialized to 0.
    */
   public Counter()
   {
	   value = 0; //Initialize at 0
   }

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void count() 
   {
      value = value + 1;
   }
   
   /**
   Decreases the value of this counter by 1 if and only if value is greater than 0
*/
public void undo() 
{
	if(value > 0){
   value = value - 1;
	}else{
		value = 0;
	}
}

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
}