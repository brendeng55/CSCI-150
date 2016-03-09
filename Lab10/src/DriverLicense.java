import java.util.Calendar;


public class DriverLicense extends Card
{
	private int expirationYear;
	
	public DriverLicense(String n, int expyear)
	{
		super(n);
		expirationYear = expyear;
	}
	
	public boolean isExpired()
	{
		boolean isItExpired = false;
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(expirationYear < currentYear)
		{
			isItExpired = true;
		}
		return isItExpired;
	}
	
	public String format()
	{
		return super.format() + " Expiration Year: " + expirationYear + " Expired: " + isExpired();
	}
}
