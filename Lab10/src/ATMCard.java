
public class ATMCard extends Card
{
	private String AccountNumber;
	private String pin;
	
	public ATMCard(String n, String acctnum, String pnum)
	{
		super(n);
		AccountNumber = acctnum;
		pin = pnum;
	}
	
	public String format()
	{
		return super.format() + " Account Number: "+ AccountNumber + " Pin: " + pin;
	}
}
