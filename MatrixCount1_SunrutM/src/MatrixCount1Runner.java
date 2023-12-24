//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.util.*;
public class MatrixCount1Runner
{
    public static void main( String args[] ) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        MatrixCount1 newM = new MatrixCount1();
        int num;
        while(true)
        {
            System.out.print("Enter a number: ");
            num = scan.nextInt();
            if (num == -1)
            {
                break;
            }
            System.out.println("The " + num + " count is :: " + newM.count(num));
        }
    }
}
