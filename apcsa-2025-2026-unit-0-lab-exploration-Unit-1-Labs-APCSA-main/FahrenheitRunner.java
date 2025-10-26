//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class FahrenheitRunner
{
	public static double go( double fahr )
	{
		return (fahr - 32) * 5.0 / 9.0;
	}
	
	public static void main( String[] args )
	{
		System.out.printf( "%.2f degrees Celsius\n", go( 98.6 ) );
		
		//add more test cases
		System.out.printf( "%.2f degrees Celsius\n", go( 52.30 ) );
		System.out.printf( "%.2f degrees Celsius\n", go( 82.45 ) );
		System.out.printf( "%.2f degrees Celsius\n", go( 75.00 ) );
		System.out.printf( "%.2f degrees Celsius\n", go( 100.00 ) );
	}
}

/*
 
Sample Data: 
98.6
52.30
82.45
75.00
100.00

Sample Output : 
37.00 degrees Celsius
11.28 degrees Celsius
28.03 degrees Celsius
23.89 degrees Celsius
37.78 degrees Celsius


*/
