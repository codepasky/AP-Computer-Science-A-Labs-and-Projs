//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 01/13/2026

public class RayGetFirst
{
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static int[] go(int[] ray)
	{
		int count = 0;
		for (int i = 1; i < ray.length; i++) {
			if (ray[0] < ray[i]) {
				count++;
			}
		}

		int[] result = new int[count];
		int idx = 0;
		for (int j = 1; j < ray.length; j++) {
			if (ray[0] < ray[j]) {
				result[idx] = ray[j];
				idx++;
			}
		}
		return result;
	}
}