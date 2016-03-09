/**
 * 
 * Lab12
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  9/28/2015
 * 
 * This program shows an example of using inheritance and aggregation.
 * 
 */
public class Lab12 {

	public static void main(String[] args)
	{
		
		Box1 box1 = new Box1(2,2,2);
		System.out.println("Box 1 Surface Area: " + box1.surfaceArea());
		System.out.println("Box 1 Volume: " + box1.volume());
		
		System.out.print("\n");
		
		Box2 box2 = new Box2(2,2,2);
		System.out.println("Box 2 Surface Area: " + box2.surfaceArea());
		System.out.println("Box 2 Volume: " + box2.volume());
	}
}
