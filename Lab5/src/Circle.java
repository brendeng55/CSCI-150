
public class Circle {
	
	private double radius; //Radius of circle
	private double area; //area of circle
	private double circumference; //circumference of circle

	//Constructor with empty param's 
	public Circle(){
		radius = 0.0;
	}
	
	//Constructor that takes a double and assigns it to radius
	public Circle(double r){
		radius = r;
	}
	
	public void setRadius(double rad){
		radius = rad;
	}
	
	public double getRadius(){	
		return radius;
	}
	
	public double getArea(){
		area = Math.PI * (radius * radius);
		return area;
	}
	
	//Calculate circumference
	public double getCircumference(){
		circumference = 2 * Math.PI * radius;
		return circumference;
	}
}
