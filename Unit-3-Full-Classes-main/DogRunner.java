//(c) A+ Computer Science
//www.apluscompsci.com

public class DogRunner
{
	public static void main( String[] args )
	{
		Dog d = new Dog( "rover" ); // for name only - name = "rover", default age = 1

		System.out.println( d.getPeopleAge( 7 ) ); //age * val --> 1 * 7 = 7
		d.increaseAgeByOne(); //age + 1 = 2
		d.increaseAgeByOne(); //age + 1 = 3
		System.out.println( d.getPeopleAge( 11 ) ); //age * val --> 3 * 11 = 33

		System.out.println( d.getName() ); //"rover"

		d.increaseAgeByOne(); //age + 1 = 4
		d.increaseAgeByOne(); //age + 1 = 5
		d.increaseAgeByOne(); //age + 1 = 6
		d.increaseAgeByOne(); //age + 1 = 7
		System.out.println( d.getPeopleAge( 8 ) ); //age * val --> 7 * 8 = 56

		Dog g = new Dog( "bob", 3 ); //for name & age - name = "bob", age = 3

		System.out.println( g.getName() ); //"bob"
		System.out.println( g.getPeopleAge( 5 ) ); //age * val --> 3 * 5 = 15
	}
}