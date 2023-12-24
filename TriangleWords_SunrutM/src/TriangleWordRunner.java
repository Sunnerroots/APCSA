
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
//This class creates and draws the object
import java.util.Scanner;

public class TriangleWordRunner
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your word "); //Enter the word
        String word = scan.next();
        TriangleWord tri = new TriangleWord(word);//Creates object
        tri.draw();//Draws it
    }
}
