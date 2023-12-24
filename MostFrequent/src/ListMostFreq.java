
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
import java.util.Collections;

public class ListMostFreq
{
    //method go will return the value
    //that appears the most
    //if several numbers all appear
    //the same number of times
    //return the first number found
    public static int go( ArrayList<Integer> ray )
    {
        ArrayList<Integer> numset = new ArrayList<>();
        for(Integer x:ray)
        {
            if(!numset.contains(x))
            {
                numset.add(x);
            }
        }

        int quants[] = new int[numset.size()];

        for(int i = 0; i<ray.size();i++)
        {
            quants[numset.indexOf(ray.get(i))]++;
        }

        int lind = 0;
        for(int y = 1; y<quants.length;y++)
        {
            if (quants[y]>quants[lind])
            {
                lind = y;
            }
        }

        return numset.get(lind);
    }
}

