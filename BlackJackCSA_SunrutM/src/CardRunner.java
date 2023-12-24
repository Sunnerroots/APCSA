
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import static java.lang.System.*;
public class CardRunner
{
    public static void main( String args[] )
    {

        //Runs the BlackJack Card class, outputting suits and the faces

        Card one = new Card("SPADES", 9);
        out.println(one.getSuit());
        out.println(one.getFace());
        Card two = new Card("DIAMONDS", 1);
        out.println(two);
        two.setFace(3);
        out.println(two);
        Card three = new Card("CLUBS", 4);
        out.println(three);
        Card four = new BlackJackCard("SPADES", 1);
        out.println(four);
        Card five = new BlackJackCard("HEARTS", 13);
        out.println(five);
        Card six = new BlackJackCard("HEARTS", 11);
        out.println(six);
        Card seven = new BlackJackCard("CLUBS", 12);
        out.println(seven);


    }
}
