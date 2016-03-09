import java.util.ArrayList;

/**
 * A simulated cash register that tracks the item count and the total amount
 * due.
 */
public class CashRegister {

	private ArrayList<Double> a; //The only instance variable in this class :)

	/**
	 * Constructs a cash register with a new ArrayList.
	 */
	public CashRegister() {
		a = new ArrayList<Double>();
	}

	/**
	 * Adds an item to this cash register.
	 * 
	 * @param price the price of this item
	 */
	public void addItem(double itemPrice) 
	{
		a.add(itemPrice);

	}

	/**
	 * Gets the price of all items in the current sale.
	 * 
	 * @return the total amount
	 */
	public double getTotal() 
	{
		double total = 0;
		for (int i = 0; i < a.size(); i++) 
		{
			total += a.get(i);
		}
		return total;
	}

	/**
	 * Gets the number of items in the current sale.
	 * 
	 * @return the item count
	 */
	public int getCount() 
	{
		return a.size();
	}

	/**
	 * Display the current cash register list
	 */

	public void displayAll() 
	{
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.printf("%10.2f \n", a.get(i));
		}
		System.out.println("--------------");
	}

	/**
	 * Clears the item count and the total.
	 */
	public void clear() {
		a = new ArrayList<Double>();
	}
}
