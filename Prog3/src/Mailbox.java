import java.util.ArrayList;
/**
 * 
 * Prog3
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/4/2015
 * 
 * Mailbox class to store messages in
 * 
 */
public class Mailbox
{

	private ArrayList<Message> list;

	/**
	 * Mailbox constructor
	 */
	public Mailbox()
		{
			list = new ArrayList<Message>();
		}

	/**
	 * Add message to list
	 * 
	 * @param m message to be added
	 */
	public void addMessage(Message m)
		{
			list.add(m);
		}

	/**
	 * Get message
	 * 
	 * @param i index of message
	 * @return message at index value
	 */
	public Message getMessage(int i)
		{
			return list.get(i);
		}

	/**
	 * Remove message
	 * 
	 * @param i index to be removed
	 */
	public void removeMessage(int i)
		{
			list.remove(i);
		}

	/**
	 * Get current size of list
	 * 
	 * @return size of array list
	 */
	public int getSize()
		{
			return list.size();
		}
}
