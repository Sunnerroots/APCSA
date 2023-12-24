
//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.Arrays;

//Creates the array of Dogs and returns youngest and oldest dog
public class Doggies
{
    private Dog[] pups;
    public Doggies(int size)
    {
        pups = new Dog[size];
    }
    public void set(int spot, int age, String name)
    {
        pups[spot] = new Dog (age, name);
    }
    public String getNameOfOldest()
    {
        int oage = -1;
        int place = -1;
        for (int i = 0; i< pups.length;i++)
        {
            if(pups[i].getAge() > oage)
            {
                oage = pups[i].getAge();
                place = i;
            }
        }
        return pups[place].getName();
    }
    public String getNameOfYoungest()
    {
        int oage = 5000;
        int place = -1;
        for (int i = 0; i< pups.length;i++)
        {
            if(pups[i].getAge() < oage)
            {
                oage = pups[i].getAge();
                place = i;
            }
        }
        return pups[place].getName();
    }
    public String toString()
    {
        return ""+Arrays.toString(pups);
    }
}
