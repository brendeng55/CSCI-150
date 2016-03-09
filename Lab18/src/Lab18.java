/**
 * 
 * Lab18
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/02/2015
 * 
 * Palindrome Example
 * 
 */

public class Lab18
{

	public static void main(String[] args)
		{
		PalindromeTester pt = new PalindromeTester();
		if(pt.isPalindrome("bob"))
			{
				System.out.println("bob is a palindrome");
			}
		else
			{
				System.out.println("bob is not a palindrome");
			}
		if(pt.isPalindrome("amanaplanacanalpanama"))
			{
				System.out.println("amanaplanacanalpanama is a palindrome");
			}
		else
			{
				System.out.println("amanaplanacanalpanama is not a palindrome");
			}
		if(pt.isPalindrome("abcdefghijklmnopqrstuvwxyz"))
			{
				System.out.println("abcdefghijklmnopqrstuvwxyz is a palindrome");
			}
		else
			{
				System.out.println("abcdefghijklmnopqrstuvwxyz is not a palindrome");
			}

		}

}
