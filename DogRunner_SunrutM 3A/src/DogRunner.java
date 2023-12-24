//(c) A+ Computer Science
//www.apluscompsci.com
//Sunrut Mohanty 3A

//This is supposed to take the age of a Dog and its name (Age defaults to 1 if not given) and it outputs the dog's people age. The increase age by one method just increases the dog's age by one.
//getpeopleage uses the given number to output the age of the dog in dog years.
public class DogRunner
{
    public static void main( String[] args )
    {
        Dog d = new Dog( "rover" );
        System.out.println( "The people age of " + d.getName() + d.getPeopleAge( 7 ) );
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println( d.getPeopleAge( 11 ) );
        System.out.println( d.getName() );
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println( d.getPeopleAge( 8 ) );
        Dog g = new Dog( "bob", 3 );
        System.out.println( g.getName() );
        System.out.println( g.getPeopleAge( 5 ) );

    }
}
