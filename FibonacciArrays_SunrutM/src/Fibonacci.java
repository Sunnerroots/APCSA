
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty

//Creates array with fibonacci sequence and takes in requests
import java.util.*;
public class Fibonacci
{
    int range;
    int[] far;
    Scanner sc = new Scanner(System.in);

    public Fibonacci()
    {
        //Creates the array
        while(true)
        {
            System.out.print("set size to ");
            range = sc.nextInt();
            if (range == -1)
                break;
            far = new int[range];
            for (int i = 0; i<far.length;i++)
            {
                if (i==0 || i==1)
                {
                    far[i] = 1;
                }
                else
                {
                    far[i] = far[i-1] + far[i-2];
                }
            }
            //Asks for a spot to return a value, or -1 to make a array
            while (true)
            {
                System.out.print("Which value to return (-1 to make a new range)? >> ");
                int spot = sc.nextInt();
                if (spot == -1)
                    break;
                System.out.println(getNum(spot));
            }
        }
    }


    //Returns the number needed
    public int getNum(int ind)
    {
        if (ind<=range)
        {
            return far[ind-1];
        }
        else
        {
            return -1;
        }
    }





    //instance variable
    //constructors
    //set method
    //get method
    //toString
}

