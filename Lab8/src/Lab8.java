import java.util.Scanner;

/**
 * 
 * Lab8
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  9/9/2015
 * 
 * Uses a message class to print an email
 * 
 */

public class Lab8 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String sender;
		String recipient;
		String message = "";
		
		System.out.print("Sender: ");
		sender = in.next();
		System.out.print("Recipient: ");
		recipient = in.next();
		
		Message email = new Message(sender, recipient);
		
		System.out.println("Enter message (*** to quit)");
		
		
		while(!message.equals("***")){	
			email.append(message);
			message = in.nextLine();
		}
		
		System.out.printf(email.toString());
		in.close();
	}

}
