
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
public class Prime
{
    private int number;


    public void setPrime(int num)
    {
        number = num;
    }
    public static boolean isPrime(int num) //Checks if a number is prime, then returns the boolean
    {
        if (num%2 == 0)
            return false;
        else
        {
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }
    public String toString()
    {
        return "";
    }
}
