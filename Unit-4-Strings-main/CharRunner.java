//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class CharRunner
{
	public static void main( String args[] )
	{
		// create object
		CharSum s = new CharSum();
		// add test cases here
		s.setWord("Dallas", 'a');
		s.locateAndAdd();
		System.out.println(s);
		s.setWord("Houston", 'o');
		s.locateAndAdd();
		System.out.println(s);
		s.setWord("Statue", 't');
		s.locateAndAdd();
		System.out.println(s);
		s.setWord("copper", 'p');
		s.locateAndAdd();
		System.out.println(s);
		s.setWord("happypeople", 'p');
		s.locateAndAdd();
		System.out.println(s);
	}
}