
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class Card
{
    private static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    private String s;
    private int f;
    public Card(String suits, int face) {
        s = suits;
        f = face;
    }

    public String getSuit()
    {
        return s;
    }

    public String getFace()
    {
        return FACES[f];
    }

    public void setFace(int face)
    {
        f = face;
    }

    public void setSuit(String suit)
    {
        s = suit;
    }

    public String toString ()
    {
        return getFace() + " of " + getSuit();
    }
}

