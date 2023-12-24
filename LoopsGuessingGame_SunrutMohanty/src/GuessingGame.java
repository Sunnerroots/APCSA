
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Sunrut Mohanty
import java.util.Scanner;
import static java.lang.System.*;
public class GuessingGame
{
    private int upperBound;
    public GuessingGame(int stop)
    {
        upperBound = stop; //Creates range in the object using passed in value
    }
    public void playGame()
    {
        Scanner keyboard = new Scanner(System.in);
        int min = 1;
        int max = upperBound; //Creates both ranges
        double num = Math.floor(Math.random()*(max-min+1) + min); //Generates a random variable within the given range
        double ans = 0; //Declares and intializes the variable
        int tries = 0; //Attempts
        while (ans != num) //Loop keeps going until player guesses the number
        {
            out.print("Enter a number between 1 and " + upperBound + " ");
            ans = keyboard.nextDouble(); //Player enters their numbers
            tries++; //Goes up one attempt
            if (ans > max || ans < min) // If number is too big or small, gives warning
            {
                out.println("Number out of range!");
            }
            else if (ans == num) //If number is guessed, the loop breaks
            {
                break;
            }
        }
        out.println("It took " + tries + " guesses to guess " + num + "."); //Gives you how many tries it took
        out.println("You guessed wrong " + (int)Math.floor(100/upperBound*(tries-1)) + "% of the time"); //Gives you % wrong by dividing 100 by the number and multiplying it by trials - 1.

    }
    public String toString()
    {
        String output="";
        return output;
    }
}
