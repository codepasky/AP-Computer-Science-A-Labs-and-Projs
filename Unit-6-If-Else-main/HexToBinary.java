//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class HexToBinary
{
	public static String getBinary( char hex )
	{
		hex = Character.toUpperCase(hex);

		String binary = "";
		binary = hex + " is ";

		if (hex == 'A')
			binary += "1010 in binary!";
		else if (hex == 'B')
			binary += "1011 in binary!";
		else if (hex == 'C')
			binary += "1100 in binary!";
		else if (hex == 'D')
			binary += "1101 in binary!";
		else if (hex == 'E')
			binary += "1110 in binary!";
		else if (hex == 'F')
			binary += "1111 in binary!";
		else
			binary += "ERROR in binary!";
		return binary;
	}
}