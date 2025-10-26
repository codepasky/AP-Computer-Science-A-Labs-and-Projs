//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

public class CharSum
{
   private String word;
   private int sum;
   private char letter;

	public CharSum()
	{
		word = "";
		letter = ' ';
		sum = 0;
	}

	public CharSum(String w, char let)
	{
		word = w;
		letter = let;
		sum = 0;
	}


	public void setWord(String w,char let)
	{
		word = w;
		letter = let;
	}

	public void locateAndAdd()
	{
		sum = 0;
		int first = word.indexOf(letter); // find the first occurrence of the letter
		if(first == -1) // check if the letter is not in the string
		{
			return;
		}
		int last = word.lastIndexOf(letter); // find the last occurrence of the letter
		
		if(first - 1 >= 0) // check if the letter is not at the beginning of the string
		{
			sum += word.charAt(first - 1); // add the character before the first occurrence of the letter
		}
		if(first + 1 < word.length()) // check if the letter is not at the end of the string
		{
			sum += word.charAt(first + 1); // add the character after the first occurrence of the letter
		}
		if(last != first) // check if the letter is not at the beginning and end of the string
		{
			if(last - 1 >= 0) // check if the letter is not at the beginning of the string
			{
				sum += word.charAt(last - 1); // add the character before the last occurrence of the letter
			}
			if(last + 1 < word.length()) // check if the letter is not at the end of the string
			{
				sum += word.charAt(last + 1); // add the character after the last occurrence of the letter
			}
		}
	}

	public String toString()
	{
		return "The letters surrounding the "+letter+"'s in " + word + " have a total of " + sum + "\n";
	}
}