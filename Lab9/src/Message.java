public class Message 
{
	
	private String sender;
	private String recipient;
	private String messageBody;
	
	/**
	 * Message constructor
	 * @param aSender sender of email
	 * @param aRecipient recipient of email
	 */
	public Message(String aSender, String aRecipient) 
	{
		sender = aSender;
		recipient = aRecipient;
		messageBody = ""; //Set to null string
	}
	
	/**
	 * Get sender of email
	 * @return sender's name
	 */
	public String getSender()
	{
		return sender;
	}
	
	/**
	 * Get recipient of email
	 * @return recipient's name
	 */
	public String getRecipient()
	{
		return recipient;
	}
	
	/**
	 * Add to the current message
	 * @param aMessage message to be added
	 */
	public void append(String aMessage)
	{
		messageBody += aMessage;
	}
	
	/**
	 * Format output of email
	 */
	public String toString()
	{
		String emailMessage;
		emailMessage = "From:" + sender + "\n" + "To:" + recipient + "\n" + messageBody + "\n";
		return emailMessage;
	}
	
}
