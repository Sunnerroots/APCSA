//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class AverageRunner
{
    public static void main( String args[] ) throws IOException //Runs the program the right number of iterations
    {
        Scanner s = new Scanner(new File("/Users/Macbook/Desktop/School 23-24/AP CSA/Averager_SunrutM/src/average.dat"));
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i<n;i++)
        {
            Average avg = new Average(s.nextLine());
            System.out.println(avg);
        }
    }
}

