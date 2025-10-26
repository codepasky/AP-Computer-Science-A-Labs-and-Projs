//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num)); 
		System.out.println(num + " is even :: " + NumberVerify.isEven(num)); 
		
		//add more test cases
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num)); 
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));

		keyboard.close();
				
	}
}