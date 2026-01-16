//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 01/13/2026

import java.util.*;

public class NumberShifterRunner
{
	public static void main( String args[] )
	{
		int[] ray = NumberShifter.makeLucky7Array(10);
		System.out.println(Arrays.toString(ray));
		NumberShifter.shiftEm(ray);
		System.out.println(Arrays.toString(ray));
	}
}