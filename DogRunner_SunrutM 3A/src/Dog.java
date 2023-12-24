//(c) A+ Computer Science
//www.apluscompsci.com
//Sunrut Mohanty 3A

//This is where the math is done, The most notable being getpeopleage, which multiplies dog age by the given value and outputs the result

public class Dog
{
    private int age;
    private String name;
    public Dog(String n)
    {
        age = 1;
        name = n;
    }
    public Dog( String n, int a )
    {
        name = n;
        age = a;
    }
    public void increaseAgeByOne()
    {
        age++;
    }
    public int getPeopleAge( int val ) //Outputs age of dog in people years
    {

        return age * val;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Dog - " + name + " " + age;
    }
}