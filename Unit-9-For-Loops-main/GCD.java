//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class GCD
{
	public static String getGCD( int numOne, int numTwo )
	{
		int gcd=0;

		for(int x=1; x<numOne && x<numTwo; x++)
			if(numOne % x == 0 && numTwo % x == 0) //if x is a divisor of both numOne and numTwo
				gcd = x;
		return "the gcd of " + numOne + " and " + numTwo + " is " + gcd + "\n";
	}
}