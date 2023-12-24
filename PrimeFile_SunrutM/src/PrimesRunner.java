
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
//Runs the program
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class PrimesRunner
{
    public static void main( String args[] ) throws IOException
    {
        //Creates a new file object with my file's filepath
        //NOTICE: CHANGE FILEPATH FOR REPRODUCIBILITY
        File abc = new File ("/Users/Macbook/Desktop/School 23-24/AP CSA/PrimeFile_SunrutM/primenum.txt");
        Scanner scan = new Scanner(abc);


        int n = scan.nextInt(); //Takes the first number, which gives how many lines to go through
        for (int i = 1; i<= n; i++) //Iterates through the list of numbers
        {
            int num = scan.nextInt();
            if (Prime.isPrime(num) == false)
                System.out.println(num + " IS NOT PRIME");
            else
                System.out.println(num + " IS PRIME");

        }
    }
}

