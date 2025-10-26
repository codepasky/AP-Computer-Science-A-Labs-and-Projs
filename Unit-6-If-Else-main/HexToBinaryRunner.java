//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		HexToBinary prog = new HexToBinary();
		
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter ) );  
		//add more test cases
		out.print("Enter a letter :: ");
		char letter2 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter2 ) );  

		out.print("Enter a letter :: ");
		char letter3 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter3 ) );  

		out.print("Enter a letter :: ");
		char letter4 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter4 ) );  	

		out.print("Enter a letter :: ");
		char letter5 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter5 ) );  	

		out.print("Enter a letter :: ");
		char letter6 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter6 ) );  	

		out.print("Enter a letter :: ");
		char letter7 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter7 ) );  	
		
		out.print("Enter a letter :: ");
		char letter8 = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter8 ) );  	

		keyboard.close();
	}
}