//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 01/13/2026

public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{		
		for (int i = 0; i < ray.length-1; i++)
		{
			if (ray[i] == ray[i + 1])
				return false;
		}
		return true;
	}
}