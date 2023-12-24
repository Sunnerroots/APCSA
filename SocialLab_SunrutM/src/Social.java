
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty

import java.util.*;
public class Social //Takes the line, splits it up, then returns the sum
{
    private String socialNum;
    Scanner scan;

    public Social()
    {
        socialNum = "";
        scan = new Scanner(socialNum);
    }
    public Social(String soc)
    {
        socialNum = soc;
        scan = new Scanner(socialNum);
        scan.useDelimiter("-");
    }
    public void setSocial(String soc)
    {

    }
    public int getSum()
    {
        int a = 0;
        while (scan.hasNextInt())
        {
            a += scan.nextInt();

        }
        return a;
    }
    public String toString()
    {
        return "SS# " + socialNum + " has a sum of " + getSum();
    }
}

