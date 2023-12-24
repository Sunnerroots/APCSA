//Name - Meghana Kothamasu
import java.util.Scanner;
public class StringRunner
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word :: ");
        String word = keyboard.next();

        StringStuff obj = new StringStuff(word);

        System.out.print("Enter a letter :: ");
        String character = keyboard.next();

        System.out.println("The first and last letters are: " + obj.getFirstLastLetters());
        System.out.println("The middle letter is: " + obj.getMiddleLetter());
        System.out.println("Are the first and last letters the same: " + obj.sameFirstLastLetters());
        System.out.println("The difference in ascii values is " + word + " minus " + character + " == " + 		obj.diffInASCII(character));
    }
}