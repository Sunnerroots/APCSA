
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class Card
{
    //Constant array of the faces
    public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
    //instance variables
    private String suit;
    private int face;
    //constructors
    public Card( String s, int f) //Creates a Card with a given suit and face
    {
        suit = s;
        face = f;
    }
    // modifiers
    public void setFace( int f) //Modifies the face
    {
        face = f;
    }
    public void setSuit( String s) //Modifies the suit
    {
        suit = s;
    }
    //accessors - Returns the face or suit
    public String getSuit()
    {
        return suit;
    }
    public int getFace()
    {
        return face;
    }
    //toString
    public String toString() //Returns object face and suit
    {
        return FACES[face] + " of " + suit;
    }
}

