//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.util.*;
import java.io.*;
public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
            { 6, 7, 8, 9, 0},
            { 6, 7, 1, 2, 5},
            { 6, 7, 8, 9, 0},
            { 5, 4, 3, 2, 1}};

    public MatrixCount1() {
        Arrays.toString(m);
    }
    public static int count( int val )
    {
        int c = 0;
        for (int a[] : m)
        {
            for(int b : a)
            {
                if (b == val)
                {
                    c++;
                }
            }
        }
        return c;
    }
}
