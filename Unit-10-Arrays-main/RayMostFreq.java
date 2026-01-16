//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 01/13/2026

public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
		int mostFreq = ray[0];
		int maxCount = 1;
		for (int i = 0; i < ray.length; i++) {
			int count = 1;
			// counts how many times ray[i] appears
			for (int j = i + 1; j < ray.length; j++) {
				if (ray[j] == ray[i]) {
					count++;
				}
			}
			// updates mostFreq
			if (count > maxCount) {
				maxCount = count;
				mostFreq = ray[i];
			}
		}
		return mostFreq;
	}
}