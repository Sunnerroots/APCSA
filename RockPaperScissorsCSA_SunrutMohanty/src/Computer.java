
//(c) A+ Computer Science
//www.apluscompsci.com
//Computer class
//This is where the computer's choice is made
import java.util.Random;
public class Computer
{
    //instance / member variables
    private String choice;
    private int num;
    Random r = new Random();
    public Computer()
    {
        //Creates new computer and gives it a random choice
        randomSetChoice();
    }
    public String getChoice()
    {
        return choice;
    }
    public void randomSetChoice()
    {
        //Uses Random class to randomly pick an integer 1-3, each representing a choice to play
        num = r.nextInt(3)+1;
        if (num == 1)
        {
            choice = "rock";
        }
        else if (num == 2)
        {
            choice = "paper";
        }
        else
        {
            choice = "scissors";
        }
    }
    /*
        didIWin(Player p) will return the following values
        0 - both players have the same choice
        1 - the computer had the higher ranking choice
        -1 - the player had the higher ranking choice
    */
    public int didIWin(Player p)
    {
        //This checks who won (You or the computer)
     if (p.getChoice().equalsIgnoreCase("scissors") && getChoice().equalsIgnoreCase("paper") ||
         p.getChoice().equalsIgnoreCase("rock") && getChoice().equalsIgnoreCase("scissors") ||
         p.getChoice().equalsIgnoreCase("paper") && getChoice().equalsIgnoreCase("rock"))
         return -1;
     else if (p.getChoice().equalsIgnoreCase("scissors") && getChoice().equalsIgnoreCase("rock") ||
              p.getChoice().equalsIgnoreCase("rock") && getChoice().equalsIgnoreCase("paper") ||
              p.getChoice().equalsIgnoreCase("paper") && getChoice().equalsIgnoreCase("scissors"))
         return 1;
     else
         return 0;
    }
    public String toString()
    {
        return choice;
    }
}
