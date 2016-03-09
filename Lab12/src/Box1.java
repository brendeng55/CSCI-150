
public class Box1 extends Rectangle 
{

	private int height;
	
	public Box1(int length, int width,int height) 
	{	
		super(length, width);
		this.height = height;
	}
	
	public int surfaceArea()
	{
		return 2 * ((super.area()) + (super.getWidth() * height) + (height*super.getLength()));
	}

	public int volume()
	{
		return super.area()  * height;
	}
}
