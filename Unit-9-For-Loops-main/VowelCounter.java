//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		String result = "";
		int vowelCount = -1;
		for(int x=0; x<s.length(); x++)
		{
			char ch = s.charAt(x);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				vowelCount++;
				result += vowelCount;
			}
			else
			{
				result += ch;
			}
		}
		return result;
	}
}


