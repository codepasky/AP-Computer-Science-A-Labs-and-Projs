//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class Divisors
{
	public static String getDivisors( int number )
	{
		String divisors = number + " has divisors: ";
		int i = 1;
		while (i <= number)
		{
			if (number % i == 0)
			{
				divisors += i + " ";
			}
			i++;
		}
		return divisors; 
	}
}