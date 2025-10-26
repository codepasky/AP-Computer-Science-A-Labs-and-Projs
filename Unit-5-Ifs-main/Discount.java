//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class Discount
{
	private double amount;
	
	public Discount( double a )
	{
		amount = a;
	}
	
	public boolean check()
	{
		if (amount > 2000){
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getTheBill()
	{
		return .85 * amount;
	}
}