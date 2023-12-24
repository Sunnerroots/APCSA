
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
//Creates multiplication table object
import java.util.Scanner;

public class MultTableRunner
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which number? "); //Takes the number
        int num = scan.nextInt();
        System.out.print("Up to what range? "); //How many multiples
        int range = scan.nextInt();
        MultTable tab = new MultTable(num, range); //Creates object
        tab.printTable();
    }
}
