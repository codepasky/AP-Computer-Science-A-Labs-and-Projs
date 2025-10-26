//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class Quadratic
{
	public static double getRootOne( int a, int b, int c )
	{
		double aa = a;
		double bb = b;
		double cc = c;
		double discriminant = bb * bb - 4 * aa * cc;
		if (aa == 0) return 0.0;
		if (discriminant < 0) return Double.NaN;
		double root = (-bb + Math.sqrt(discriminant)) / (2 * aa);
		return Math.round(root * 100.0) / 100.0;
	}
	
	public static double getRootTwo( int a, int b, int c )
	{
		double aa = a;
		double bb = b;
		double cc = c;
		double discriminant = bb * bb - 4 * aa * cc;
		if (aa == 0) return 0.0;
		if (discriminant < 0) return Double.NaN;
		double root = (-bb - Math.sqrt(discriminant)) / (2 * aa);
		return Math.round(root * 100.0) / 100.0;
	}
}