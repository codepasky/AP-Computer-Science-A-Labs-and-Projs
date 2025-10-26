//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class CountOdds
{
   public static int go( int number )
	{
		int count = 0;
		while (number > 0)
		{
			if (number % 2 != 0)
			{
				count++;
			}
			number /= 10; // remove the last digit
		}
		return count;
	}
}