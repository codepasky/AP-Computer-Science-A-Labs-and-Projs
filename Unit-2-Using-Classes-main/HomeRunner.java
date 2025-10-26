//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 9/11/2025

import java.util.Scanner;
import static java.lang.System.*;

public class HomeRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		double dist = Home.getDistance(x1, y1, x2, y2);
		out.println("distance == " + (int)dist);

		keyboard.close();
	}
}

/*

Sample Data :
4 -8 5 -3
10 -4 -2 5
5 -11  18 -6
 


Sample Output : 
Enter X1 :: 4
Enter Y1 :: -8
Enter X2 :: 5
Enter Y2 :: -3
distance == 2


Enter X1 :: 10
Enter Y1 :: -4
Enter X2 :: -2
Enter Y2 :: 5
distance == 9


Enter X1 :: 5
Enter Y1 :: -11
Enter X2 :: 18
Enter Y2 :: -6
distance == 6




Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/