public class Box2 
{
	private int height; 
	private int length; 
	private int width; 

	
	public Box2(int length, int width, int height) 
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int getLength() 
	{
		return length;
	}

	public int getWidth() 
	{
		return width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setLength(int length) 
	{
		this.length = length;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public int surfaceArea() 
	{
		return 2 * ((length * width) + (width * height) + (height * length));
	}

	public int volume() 
	{
		return length * width * height;
	}
}