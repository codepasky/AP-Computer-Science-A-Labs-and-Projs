//(c) A+ Computer Science
// www.apluscompsci.com
//Name - paschal

public class AB
{
	public static boolean check( String s, String a, String b)
	{	
		int index = s.indexOf(a + b); // look for the substring a+b

		if(index > 0 && index < s.length() - 2) // must exist and not be at position 0 or at the end
		   return true;
		return false;
	}
}