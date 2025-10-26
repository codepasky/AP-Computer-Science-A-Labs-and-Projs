//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal


public class Social
{
   public static String go( String a )
	{
		if (a.charAt(3) == '-' && a.charAt(6) == '-'){
			return a.substring(7);
		}
		else {
			return "bad";
		}
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/