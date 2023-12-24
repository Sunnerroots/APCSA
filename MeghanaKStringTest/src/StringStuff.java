//Name - Meghana Kothamasu
public class StringStuff
{
    private String word;
    public StringStuff( String w )
    {
        word = w;
    }
    public String getFirstLastLetters()
    {
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        String firstLast = String.valueOf(firstLetter) + String.valueOf(lastLetter);
        return firstLast;
    }

    public String getMiddleLetter()
    {
        int length = word.length();
        int m = length/2;
        String middle = String.valueOf(word.charAt(m));
        return middle;
    }

    public int diffInASCII( String letter )
    {
        char fl = word.charAt(0);
        char reference = letter.charAt(0);
        int difference = fl - reference;
        return difference;
    }

    public boolean sameFirstLastLetters()
    {
        if (word.charAt(0) == word.charAt(word.length()-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return "" + word;
    }
}
