//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class ReverseNumber
{
	public static int getReverse( int number )
	{
		int rev = 0;
		while (number > 0)
		{
			rev = rev * 10 + number % 10; // multiply the reverse by 10 and add the last digit of the number
			number /= 10; // remove the last digit of the number
		}
		return rev;
	}	
}