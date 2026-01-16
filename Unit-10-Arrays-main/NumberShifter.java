//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 01/13/2026

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] ray = new int[size];
		for (int i = 0; i < size; i++) {
			ray[i] = (int) (Math.random() * 10);
		}
		return ray;
	}
	public static void shiftEm(int[] array)
	{
		int spot = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 7)
			{
				int temp = array[spot];
				array[spot] = array[i];
				array[i] = temp;

				spot++;
			}
		}
	}
}