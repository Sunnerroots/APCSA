
//(c) A+ Computer Science
//www.apluscompsci.com
//Player class
//This is where your choice is made
public class Player
{
    private String name;
    private String choice;
    public Player(String nm)
    {
        //This constructor is used if you don't give a choice, although you'd have to in the actual program
        name = nm;
        System.out.println("No choice given, defaulting scissors");
        choice = "scissors";
    }
    public Player(String nm, String ch)
    {
        //This takes your name and choice and assigns it
        name = nm;
        choice = ch;
    }
    public void setName( String nm)
    {
        name = nm;
    }
    public void setChoice( String ch )
    {
        choice = ch;
    }
    public String getChoice()
    {
        return choice;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return name + " " + choice;
    }
}
