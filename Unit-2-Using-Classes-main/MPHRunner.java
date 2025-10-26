//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner mphrunner = new Scanner(System.in);
		out.print("Enter the distance :: ");
		int distance = mphrunner.nextInt();
		out.print("Enter the hours :: ");
		int hours = mphrunner.nextInt();
		out.print("Enter the minutes :: ");
		int minutes = mphrunner.nextInt();

		int mph = (int)MilesPerHour.getMPH(distance, hours, minutes);
		out.println(distance + " " + hours + " " + minutes + " = " + mph + " MPH");
		mphrunner.close();
	}
}

/*
 
45 0 32 = 84 MPH
96 1 43 = 56 MPH
100 2 25 = 41 MPH
50 2 25 = 21 MPH
10 10 19 = 1 MPH
100 50 77 = 2 MPH

*/