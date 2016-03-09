import java.util.Stack;


public class PalindromeTester
{
	
	public boolean isPalindrome(String s)
		{
			Stack<Character> stack = new Stack<Character>();
			String reverse = "";
			
			//Push each char of the string onto the stack
			for (int i = 0; i < s.length(); i++) {
	            stack.push(s.charAt(i));
	        }
			
			//Pop each char
			while (!stack.isEmpty()) {
	            reverse += stack.pop();
	        }
			
			//If they are equal then the string is a palindrome
			if(s.equalsIgnoreCase(reverse))
				{
					return true;
				}
			
			//Else they are not a palindrome
			else 
				{
					return false;
				}
		}

}
