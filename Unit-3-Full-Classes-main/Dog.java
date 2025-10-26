//(c) A+ Computer Science
//www.apluscompsci.com

public class Dog
{
  private int age;
  private String name;
	
  public Dog( String n )  //first constructor - in case an age isnt inputted
  {
    age = 1;
    name = n;
  }
  
	public Dog( String n, int a )  //second constructor - for both age and name
	{
 	 name = n;
   age = a;
	}
  
  public void increaseAgeByOne() // method
  {
  	 age++;
  }
  
  public int getPeopleAge( int val ) // method
  {
  	 //fill in this method
  	 return age * val;
  }
	
  public int getAge()    { // method
    return age;
  }
	
  public String getName()    { // method - returns the name of the dog
    return name;
  }
	
  public String toString()    {
    return "Dog - " + name + " " + age;
  }
}
