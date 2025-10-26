//(c) A+ Computer Science
// www.apluscompsci.com
//Name - paschal

public class LastFirst
{
	public static String check( String s)
	{
		if ( s.charAt(0) > s.charAt(s.length() - 1))
			return "aplus";
		if (s.charAt(s.length() - 1) > s.charAt(0))
			return "compsci";
		return "apluscompsci";
	}
}