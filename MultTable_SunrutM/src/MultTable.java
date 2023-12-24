
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
public class MultTable
{
    private int number;
    private int stop;
    public MultTable(int n, int s) //Intializes variables
    {
        number = n;
        stop = s;
    }
    public void printTable( ) //Prints the table
    {
        for (int i = 1; i <= stop; i++)
        {
            System.out.printf(i + "%7d",(number*i)); //Prints each multiple and formats it to 7 spots from the right
            System.out.println();
        }
    }
}
