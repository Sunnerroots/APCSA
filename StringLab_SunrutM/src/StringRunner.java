
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
// This program takes in a given String, and it prints out the first and last letters, the middle letter, whether it has the same first and last letters,
// and the difference between the first letter of the given string's ascii value and a given letter's ascii formula
import java.util.Scanner;
public class StringRunner
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word :: ");
        String word = scan.next();
        StringStuff finder = new StringStuff(word);
        //Uses all methods to print it out
        System.out.println("Has first and last letters: " + finder.getFirstLastLetters());
        System.out.println("Has middle letter: " + finder.getMiddleLetter());
        System.out.println("Has same first and last letters: " + finder.sameFirstLastLetters());
        System.out.print("Difference in ascii values " + word + " minus ");
        //Takes in letter argument
        String letter = scan.next();
        System.out.println(letter + " == " + finder.diffInASCII(letter));
    }
}

