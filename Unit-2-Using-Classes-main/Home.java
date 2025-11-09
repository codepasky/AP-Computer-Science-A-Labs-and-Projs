//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class Home
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		int totalDisplacement = xOne + yOne + xTwo + yTwo;
		return Math.abs((double)totalDisplacement);	
	}
}