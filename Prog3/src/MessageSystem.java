import java.util.ArrayList;
/**
 * 
 * Prog3
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/4/2015
 * 
 * Initializes an ArrayList of User objects.
 * 
 */
public class MessageSystem
{

	private ArrayList<User> userList; //ArrayList of Users

	/**
	 * Constructor initializes userList
	 */
	public MessageSystem()
		{
			userList = new ArrayList<User>();
		}

	/**
	 * Add user to the list 
	 * @param u user 
	 */
	public void addUser(User u)
		{
			userList.add(u);
		}

	/**
	 * Determine if user is already in the list or not
	 * @param user user
	 * @return boolean value
	 */
	public boolean inTheList(String user)
		{
			for (int i = 0; i < userList.size(); i++)
				{
					if (userList.get(i).getName().contains(user))
						{
							return true;
						}
				}

			return false;
		}

	/**
	 * Return index value at which the user's name is located at, return null if user not found.
	 * @param currentUser user currently logged in
	 * @return index value
	 */
	@SuppressWarnings("null")
	public int mailboxToPrint(String currentUser)
		{
			for (int i = 0; i < userList.size(); i++)

				if (userList.get(i).getName().contains(currentUser))
					{
						return i;
					}

			return (Integer) null;
		}

	/**
	 * Prepare user's mailbox for printing
	 * @param currentUserMb index value of user's mailbox
	 * @return user's mailbox
	 */
	public Mailbox setMbToPrint(int currentUserMb)
		{
			return userList.get(currentUserMb).getMailbox();
		}

	/**
	 * Deliver message into user's mailbox
	 * @param recipient name of user who is getting mail delivered to
	 * @param m message to be delivered
	 */
	public void deliver(String recipient, Message m)
		{
			for (int i = 0; i < userList.size(); i++)

				if (userList.get(i).getName().contains(recipient))
					{
						userList.get(i).getMailbox().addMessage(m);
					}
		}
}
