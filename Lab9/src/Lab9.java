
/**
 * 
 * Lab9
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  9/11/2015
 * 
 * Uses the message and mailbox classes to store e-mails.
 * 
 */

public class Lab9 
{

	public static void main(String[] args) 
	{
		
		Mailbox mailBox = new Mailbox(); //New Mailbox object created
				
		Message m = new Message("Brenden", "Casey"); //New Message object created
		m.append("This is my first email"); //Append message to object
		mailBox.addMessage(m); //Add message to the Mailbox object
		
		m = new Message("Brenden", "Casey");	//New Message object created
		m.append("This is my second email"); //Append message to object
		mailBox.addMessage(m); //Add message to the Mailbox object
		
		m = new Message("Brenden", "Casey");    //New Message object created
		m.append("This is my third email"); //Append message to object
		mailBox.addMessage(m); //Add message to the Mailbox object
		
		//For loop to print out all messages
		for(int i=0; i<mailBox.getSize();i++)
		{
			System.out.println(mailBox.getMessage(i));
		}
		
		mailBox.removeMessage(2); //Remove message at index 2
		
		//Reprint all messages
		for(int i=0; i<mailBox.getSize();i++)
		{
			System.out.println(mailBox.getMessage(i));
		}
	}

}
