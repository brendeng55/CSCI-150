import java.util.Scanner;

/**
 * 
 * Prog3
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/4/2015
 * 
 * This program allows users to login and send/receive messages. Messages are
 * stored in their mailboxes.
 * 
 */

public class Prog3
{
	public static void main(String[] args) 
		{

			// String variables
			String sender;
			String recipient;
			String message = "";
			String currentUser = null;
			String userChoice;

			// Integer variable
			int currentUserMb;

			// Boolean variables
			boolean done = false;
			boolean loggedIn = false;
			boolean blankLine;

			// Creation of objects and initialization to null
			Scanner in = new Scanner(System.in);
			MessageSystem system = new MessageSystem();
			Mailbox mb = null;
			User user = null;

			// Continue until user quits
			while (!done)
				{
					System.out.println("Log I)n  S)end message  R)ead messages  Log O)ut  Q)uit");
					userChoice = in.nextLine();
					userChoice = userChoice.toUpperCase(); // Convert to upper-case

					//Check to see if user is logged in
					if(!userChoice.equals("I") && !loggedIn && !userChoice.equals("Q"))
						{
							System.out.println("You must login");
						}
					//Check to see if a user is already logged in 
					if(userChoice.equals("I") && loggedIn)
						{
							System.out.println("You are already logged in as " + currentUser);
						}
					
					if (userChoice.equals("I") && !loggedIn)
						{

							System.out.print("Username: ");
							currentUser = in.nextLine().toLowerCase();							
							loggedIn = true;
							
						} else if (userChoice.equals("S") && loggedIn)
						{
							sender = currentUser;
							System.out.print("Recipient: ");
							recipient = in.nextLine().toLowerCase();
							
							

							//If recipient is not in the current list, create a new
							//mailbox and user, then add the user to the system
							if (!system.inTheList(recipient))
								{
									mb = new Mailbox();
									user = new User(recipient, mb);
									system.addUser(user);
								}

							//New message object with sender and recipient parameters
							Message email = new Message(sender, recipient);

							//Prompt to enter message
							System.out.println("Enter message (blank line to quit)");
							
							//Set boolean value to false to enter loop
							blankLine = false;
							
							//Loop and append message until user enters blank line
							while(!blankLine)
								{
									email.append(message);
									message = in.nextLine();
									if(message.equals(""))
									{
										blankLine = true;
									}
								}

							//Deliver message to the correct mailbox
							system.deliver(recipient, email);
							
						} else if (userChoice.equals("R") && loggedIn)
						{
							try
								{
									//Set currentUserMb to the index value of the currentUser's mailbox
									currentUserMb = system.mailboxToPrint(currentUser);
									
									//Pass that index value into the setMbToPrint and call printAll 
									user.printAll(system.setMbToPrint(currentUserMb));
									
								//If currentUser is not in the list, catch the NullPointerException
								} catch (NullPointerException e)
								{
									//If user not located in user list, they have no messages
									System.out.println("No Messages.");
								}

						} else if (userChoice.equals("O") && loggedIn)
						{
							System.out.println(currentUser + " has logged out.");
							loggedIn = false; //No longer logged in
							currentUser = null; //Set to null
						} else if (userChoice.equals("Q"))
						{
							System.out.print("Exiting program.");
							done = true; //Set done to true to kick us out of loop
						}
				}//End of while loop

			in.close(); //Close scanner
		}//End of Class
}

