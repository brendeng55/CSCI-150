

public class Message 
{
	
	private String sender;
	private String recipient;
	private String messageBody;
	
	public Message(String aSender, String aRecipient) 
	{
		sender = aSender;
		recipient = aRecipient;
		messageBody = "";
	}
	
	public String getSender()
	{
		return sender;
	}
	
	public String getRecipient()
	{
		return recipient;
	}
	
	public void append(String aMessage)
	{
		messageBody += aMessage;
	}
	
	public String toString()
	{
		String emailMessage;
		 emailMessage = "From:" + sender + "\n" + "To:" + recipient + "\n" + messageBody + "\n";
		return emailMessage;
	}
	
}
