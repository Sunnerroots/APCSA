
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
public class Box //The Box class, makes the box of letters and returns it
{
    private String let;
    private int size;
    public Box()
    {
        let = "";
        size = 1;
    }

    public Box(String letter, int num) //Takes in values
    {
        let = letter;
        size = num;
    }


    public String toString() //Uses nested for-loop to print rows and columns
    {
        String output="";
        for (int f = 0; f<size;f++)
        {
            for(int t = 0;t<size;t++)
            {
                output+=let;
            }
            output+="\n";
        }
        return output;
    }
}
