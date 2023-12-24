
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class TheLineRunner
{
    public static void main( String args[] ) throws IOException //Runs the program the number of iterations
    {
        Scanner file = new Scanner(new File("line.dat"));
        int size = file.nextInt();
        file.nextLine();
        for(int i=0; i<size; i++)
        {
            TheLine line = new TheLine(file.nextLine());
            System.out.println(line);
        }
    }
}
