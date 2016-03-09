import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * Lab17
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  10/30/2015
 * 
 * This program is a simple example of a LinkedList and the use of an iterator.
 * 
 */

public class Lab17
{

	public static void main(String[] args)
	{
		LinkedList<String> letters = new LinkedList<String>();
		
		letters.addLast("aaa");
		letters.addLast("bbb");
		letters.addLast("ccc");
		letters.addLast("ddd");
		letters.addLast("eee");
		letters.addLast("fff");
		letters.addLast("ggg");
		letters.addLast("hhh");
		letters.addLast("iii");
		
		// | in the comments indicates the iterator position
		
		ListIterator<String> iterator = letters.listIterator(); // |DHRT
		
		
		
		iterator = letters.listIterator();
		System.out.println("First runthrough going forward:");
		while(iterator.hasNext())
			{
				String s = iterator.next();
				System.out.println(s);
			}
		System.out.println("\nWalking backwards and deleting all vowels...\n");
		while(iterator.hasPrevious())
			{
				String s = iterator.previous();
				if(s.substring(0, 1).equals("a") || s.substring(0, 1).equals("e") || s.substring(0, 1).equals("i") || s.substring(0, 1).equals("o") || s.substring(0, 1).equals("u"))
					{
						iterator.remove();
					}		
			}
		
System.out.println("Walking forward again and printing list (should not contain any vowels)");

		while(iterator.hasNext())
			{
				String s = iterator.next();
				System.out.println(s);
			}
	}
}
