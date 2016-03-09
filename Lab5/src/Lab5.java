/**
 * 
 * Lab5 
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  8/28/2015
 * 
 * This program creates 2 circle objects and calculates the area and circumference
 * 
 */
public class Lab5 {

	public static void main(String[] args) {
	
		//Create 2 circle objects
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(10.0);
		
		//Print Radius of circle 1
		System.out.printf("Radius of circle 1: %.2f \n", circle1.getRadius());
		

		//Set radius of circle 1 to 2.0
		circle1.setRadius(2.0);
		
		
		//Print area of circle 1
		System.out.printf("Area of circle 1: %.2f \n", circle1.getArea());
		
		
		//Print circumference of circle 2
		System.out.printf("Circumference of circle 2: %.2f" , circle2.getCircumference());
	}

}
