//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class Box
{
	public static String go( int size )
	{
		String output="";
		for(int x=0; x<size; x++){
			for(int y=x; y<size; y++)
				output += "* ";
			for (int z=x; z>=0; z--)
				output += "# ";
			output += "\n";
		}
		return output;
	}
}