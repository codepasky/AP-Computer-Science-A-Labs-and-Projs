//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class LineRunner
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		return (double)(y2 - y1) / (x2 - x1);
	}	
	
   public static void main( String[] args )
   {
		System.out.printf( "Slope is :: %.2f\n" , getSlope( 1,9,14,2 ) );

		//add more test cases
		System.out.printf( "Slope is :: %.2f\n" , getSlope( 1,7,18,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , getSlope( 6,4,2,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , getSlope( 1,7,2,9 ) );
	}
}

/*
	Sample Data: 
	1 9 14 2
	1 7 18 3
	6 4 2 2
	4 4 5 3
	1 1 2 9
	1 7 2 9

	Sample Output : 
	Slope is :: -0.54
	Slope is :: -0.24
	Slope is :: 0.50
	Slope is :: -1.00
	Slope is :: 8.00
	Slope is :: 2.00

*/