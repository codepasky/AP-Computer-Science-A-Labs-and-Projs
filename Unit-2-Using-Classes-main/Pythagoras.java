//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Pythagoras
{
	public static double getSide(int sideA, int sideB)
	{
		double sideC = Math.pow(sideA, 2) + Math.pow(sideB, 2);	
		return Math.sqrt(sideC);
	}
}