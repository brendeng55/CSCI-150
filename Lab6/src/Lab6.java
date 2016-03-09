/**
 * 
 * Lab6
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  8/31/2015
 * 
 * This simulates a vending machine
 * 
 */
public class Lab6 {

	public static void main(String[] args) {
		
		VendingMachine machine1 = new VendingMachine();
		VendingMachine machine2 = new VendingMachine(20);
		machine1.fillUp(5);
		machine1.insertToken();
		machine1.insertToken();
		System.out.print("Token count for machine1: ");
		System.out.println(machine1.getTokenCount());
		System.out.println("Expected: 2");
		System.out.print("Can count for machine1: ");
		System.out.println(machine1.getCanCount());
		System.out.println("Expected: 3");
		machine2.insertToken();
		System.out.print("Can count for machine2: ");
		System.out.println(machine2.getCanCount());
		System.out.println("Expected: 19");
		
	}
}
