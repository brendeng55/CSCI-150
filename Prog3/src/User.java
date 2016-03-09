/**
 * 
 * Prog3
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/4/2015
 * 
 * User objects created with a name and a mailbox
 * 
 */
public class User
{

	private String name;
	private Mailbox mb;

	/**
	 * Constructor
	 * @param name user's name
	 * @param mb user's mailbox
	 */
	public User(String name, Mailbox mb)
		{
			this.name = name;
			this.mb = new Mailbox();
		}

	/**
	 * Sets the user's name 
	 * @param name user's name
	 */
	public void setName(String name)
		{
			this.name = name;
		}

	/**
	 * Sets the user's mailbox
	 * @param mb
	 */
	public void setMailbox(Mailbox mb)
		{
			this.mb = mb;
		}

	/**
	 * Get user's name
	 * @return user's name
	 */
	public String getName()
		{
			return this.name;
		}

	/**
	 * Get user's mailbox
	 * @return user's mailbox
	 */
	public Mailbox getMailbox()
		{
			return this.mb;
		}

	/**
	 * Print all messages in the user's mailbox
	 * @param mb user's mailbox
	 */
	public void printAll(Mailbox mb)
		{
			for (int i = 0; i < mb.getSize(); i++)
				{
					System.out.println(mb.getMessage(i));
				}
		}

}