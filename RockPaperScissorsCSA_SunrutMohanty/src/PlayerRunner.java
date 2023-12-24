
//(c) A+ Computer Science
//www.apluscompsci.com
//Player Runner
public class PlayerRunner
{
    public static void main(String[] args)
    {

        Player s = new Player("Michael Jackson", "rock");
        System.out.println(s.getChoice()); //outs rock
        //call the getName() method //outs Michael Jackson
        System.out.println(s); //outs Michael Jackson rock
        s.setChoice("paper");
        System.out.println(s); //outs Michael Jackson paper
        Player jb = new Player("Jim Bob", "paper");
        System.out.println(jb.getName());
        //print out Jim Bob


    }
}
