//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty

import java.util.HashMap;

public class BlackJackCard extends Card //Inherits the Card class
{


    HashMap<String,Integer> points = new HashMap<>(); //Got bored, but in simple terms it's just an array with a smaller
    //time complexity. I'm using it to store point values for each face
    public BlackJackCard (String s, int f) //Calls parent constructor, basically creating a Card but with point values
    {
        super(s,f);

        for (int i = 0; i<FACES.length; i++) //Cycles through HashMap
        {
            //Places point value for Faces with names
            if (FACES[i].equals("ACE"))
            {
                points.put(FACES[i], 11);
                continue;
            }
            if (FACES[i].equals("JACK") || FACES[i].equals("QUEEN") || FACES[i].equals("KING"))
            {
                points.put(FACES[i], 10);
                continue;
            }

            //Places point value for name
            points.put(FACES[i],i);
        }
    }

    public String toString() //Overrides the toString method and adds point value
    {
        return FACES[getFace()] + " of " + getSuit() + " " + points.get(FACES[getFace()]);
    }
}