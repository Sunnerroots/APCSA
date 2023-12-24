
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.util.*;
import java.util.Stack;

import static java.lang.System.*;
public class TheLine //Makes a stack of the largest numbers then returns the top
{

    Scanner scan;
    private String nLine;

    public TheLine()
    {
        nLine = "";
        scan = new Scanner(nLine);
    }
    public TheLine(String s)
    {
        nLine = s;
        scan = new Scanner(nLine);
    }
    public int getLargest()
    {
        int largest = Integer.MIN_VALUE;
        while (scan.hasNextInt())
        {
            int num = scan.nextInt();
            if(num > largest)
                largest = num;
        }

        return largest;
    }
    public String toString( )
    {
        return nLine + " -  Largest == " + getLargest();
    }
}

