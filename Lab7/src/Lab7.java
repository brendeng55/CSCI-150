/**
 * 
 * Lab7
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  9/2/2015
 * 
 * This program simulates a vending machine
 * 
 */

import java.util.Scanner;


public class Lab7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int userInput;
		VendingMachine a[] = new VendingMachine[12];
		
		
		for(int i=0; i<12; i++)
		{
			a[i] = new VendingMachine(20);
		}
		
		System.out.println("Please choose a machine number: " );
		userInput = in.nextInt();
		
		a[userInput].fillUp(10);
		a[userInput].insertToken();
		a[userInput].insertToken();
		
		System.out.printf("Machine \t Can Count \t Token Count \n");
		
		for(int j=0; j<12;j++)
		{
		System.out.printf("%d \t\t %d \t\t %d \n", j, a[j].getCanCount(), a[j].getTokenCount());
		}
		in.close();
	}

}
