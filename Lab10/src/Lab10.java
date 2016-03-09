
/**
 * 
 * Lab10
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  9/16/2015
 * 
 * This program is an example showing the usefulness of inheritance 
 * 
 */

public class Lab10 {

	public static void main(String[] args) 
	{
		Card card = new Card("John Doe");
		System.out.println("Contents of card " + card.format());
		
		IDCard id = new IDCard("Sam Smith", "99999");
		System.out.println("Contents of id " + id.format());
		
		ATMCard atm = new ATMCard("Sue Jones", "1111", "123");
		System.out.println("Contents of atm " + atm.format());
		
		DriverLicense license = new DriverLicense("Jane Smith", 2014);
		System.out.println("Contents of car " + license.format());

	}

}
