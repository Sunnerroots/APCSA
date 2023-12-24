
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class BoxRunner
{
    public static void main( String args[] ) throws IOException //Runs the box maker classes and grabs iteration amount from file
    {
        Scanner sc = new Scanner(new File("/Users/Macbook/Desktop/School 23-24/AP CSA/BoxesLab_SunrutM/src/box.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<n; i++)
        {
            Box b = new Box(sc.next(),Integer.parseInt(sc.next()));
            sc.nextLine();
            System.out.println(b);
        }

    }
}

