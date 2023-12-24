//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Average //Drops the lowest number and averages the numbers
{
    private String first;
    Scanner scan;
    Integer low = Integer.MAX_VALUE;
    int sum;
    double count;

    public Average(String l)
    {
        first = l;
        scan = new Scanner(l);
        int a = 0;
        count = 0;
        while (scan.hasNextInt())
        {
            a = scan.nextInt();
            count++;
            sum += a;
            if (a<low)
            {
                low = a;
            }
        }

    }
    private int getLowest()
    {
        return low;
    }
    public double getAverage()
    {
        double one = sum-low;
        double len = count-1;
        return (one)/(len);
    }

    public String getLine()
    {
        return first;
    }
    public String toString()
    {
        return String.format(getLine() + "\naverage = %.2f", getAverage());
    }
}
