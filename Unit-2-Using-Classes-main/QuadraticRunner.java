//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import java.util.Scanner;
import static java.lang.System.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		//use a Scanner for keyboard input		
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter a :: ");
		int a = keyboard.nextInt();
		out.print("Enter b :: ");
		int b = keyboard.nextInt();
		out.print("Enter c :: ");
		int c = keyboard.nextInt();

		out.println();

		double r1 = Quadratic.getRootOne(a,b,c);
		double r2 = Quadratic.getRootTwo(a,b,c);
		out.printf("rootone :: %.2f\n", r1);
		out.printf("roottwo :: %.2f\n", r2);

		keyboard.close();
	}
}

/*

Sample Data :
5 -8 3
3 2 -7
9 6 1

Sample Output : 
Enter a :: 5
Enter b :: -8
Enter c :: 3

rootone :: 1.00
roottwo :: 0.60


Enter a :: 3
Enter b :: 2
Enter c :: -7

rootone :: 1.23
roottwo :: -1.90


Enter a :: 9
Enter b :: 6
Enter c :: 1

rootone :: -0.33
roottwo :: -0.33

*/