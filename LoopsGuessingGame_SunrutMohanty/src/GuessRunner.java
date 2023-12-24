
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Sunrut Mohanty

import java.util.Scanner;
import static java.lang.System.*;
public class GuessRunner //Main class where the game runs
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        boolean pg = true;
        String p = "y";
        do //Do while loop, which plays the game until you say no, making the boolean false, stopping the loop
        {
            out.print("Guessing Game - how many numbers? ");
            int response = keyboard.nextInt(); //Grabs the range
            GuessingGame dagame = new GuessingGame(response); //Enters the range into the object and creates it
            dagame.playGame(); //Method that plays the game
            out.print("Do you want to play again? Select y or n - "); //Checks if you want play or not
            p = keyboard.next();
            if (p.equalsIgnoreCase("y"))
            {
                pg = true;
            }
            else if (p.equalsIgnoreCase("n")) //If no, playgame boolean becomes false
            {
                pg = false;
            }
        } while (pg); //If false, code ends

    }
}
