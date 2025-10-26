//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
		double totalHours = (int)hrs + (int)mins / 60.0;
		return Math.round(dist / totalHours);
	}
}

