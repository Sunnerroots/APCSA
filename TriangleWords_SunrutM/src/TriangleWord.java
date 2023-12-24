import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
public class TriangleWord
{
    private String word;
    private int len;
    public TriangleWord(String w) //Creates new word variable and a word length variable
    {
        word=w;
        len = w.length();
    }

    public void draw() //Draws the triangle
    {
        int space = len-1;
        int inSpace = 1;
        for (int i = len-1; i >= 0; i--) //Iterates through all letters
        {
            if (i == len-1) //Prints first letter with appropriate spacing
            {
                System.out.print(" ".repeat(space) + word.substring((len-1)-i, (len-1)-i+1));
                space--;
            }

            else if (i != 0) //Print all letter levels before last letter
            {
                System.out.print(" ".repeat(space) + word.substring((len-1)-i, (len-1)-i+1) + " ".repeat(inSpace) + word.substring((len-1)-i, (len-1)-i+1));
                space--;
                inSpace += 2;
            }

            else //prints the word and the word reversed as the triangle base
            {
                String base[] = new String[len*2-1]; //Creates array
                for (int t = 0; t < len; t++) //Places reversed characters
                {
                    base[t] = word.substring(len-(t+1),len-t);
                }
                //int mid = len;
                for (int l = 0; l<(base.length-1)/2; l++) //Places normal order characters
                {
                    base[len+l] = word.substring(l+1, l+2);
                }
                String arword = "";
                for(String x:base) //Prints out the array elements
                {
                    arword += x;
                }
                System.out.println(arword);
            }

            System.out.println(); //Does a new line for each letter level

        }
    }
    public String toString()
    {
        String output="";
        return output+"\n";
    }
}
