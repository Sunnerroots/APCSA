
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty

//This is where all the action takes place:
public class StringStuff
{
    private String w;

    //Constructor method, takes in the variable and makes another variable in this class with the same value
    public StringStuff( String w )
    {
        this.w = w;
    }
    public String getFirstLastLetters() //Returns the first and last letters of the string
    {
        return w.substring(0,1) + w.substring(w.length()-1,w.length());
    }
    public char getMiddleLetter() //Returns the middle letter of the string
    {
        char letNum = 'A';
        letNum = (w.length()-1) % 2 == 0 ? w.charAt((w.length()-1)/2) : w.charAt((w.length()/2));
        return letNum;
    }
    public int diffInASCII( String letter ) //Returns the difference in the ASCII value of the first letter of the given word and a given letter
    {
        return w.substring(0,1).compareTo(letter);
    }
    public boolean sameFirstLastLetters() //Returns true or false depending on whether the first and last letter are the same
    {
        return w.substring(0,1).equalsIgnoreCase(w.substring(w.length()-1,w.length()));
    }
    public String toString() //returns the string
    {
        return "" + this.w;
    }
}

