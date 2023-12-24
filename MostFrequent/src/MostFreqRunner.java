import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
//Date - 11/14/2023
//add imports as needed
//Runs the program and adds the numbers to be used
public class MostFreqRunner
{
    public static void main( String args[] )
    {
        ArrayList<Integer> samp = new ArrayList<>();
        samp.add(9);
        samp.add(10);
        samp.add(-88);
        samp.add(-88);
        samp.add(-555);
        samp.add(1000);

        System.out.print(ListMostFreq.go(samp));
    }
}
