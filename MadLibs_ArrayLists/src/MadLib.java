//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
public class MadLib
{
    private ArrayList<String> verbs = new ArrayList<>();
    private ArrayList<String> nouns = new ArrayList<>();
    private ArrayList<String> adjectives = new ArrayList<>();
    private ArrayList <String> story = new ArrayList<>();
    String tempstor[];
    public MadLib()
    {
        System.out.println("Just put something!");
    }
    public MadLib(String fileName)
    {
        //load stuff
        try{
            Scanner file = new Scanner(new File(fileName));
            tempstor = file.nextLine().split(" ");
            loadNouns();
            loadAdjectives();
            loadVerbs();
        }
        catch(Exception e){
            out.println("Houston we have a problem!");
        }
    }
    public void loadNouns()
    {
        try{
            Scanner file = new Scanner(new File("/Users/Macbook/Desktop/School 23-24/AP CSA/MadLibs_ArrayLists/nouns.dat"));
            while(file.hasNext())
            {
                nouns.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }
    public void loadVerbs()
    {
        try{
            Scanner file = new Scanner(new File("/Users/Macbook/Desktop/School 23-24/AP CSA/MadLibs_ArrayLists/verbs.dat"));
            while(file.hasNext())
            {
                verbs.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }
    public void loadAdjectives()
    {
        try{
            Scanner file = new Scanner(new File("/Users/Macbook/Desktop/School 23-24/AP CSA/MadLibs_ArrayLists/adjectives.dat"));
            while(file.hasNext())
            {
                adjectives.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }
    public String getRandomVerb()
    {
        return verbs.get((int)(Math.random()*(verbs.size()-1)));
    }
    public String getRandomNoun()
    {
        return nouns.get((int)(Math.random()*(nouns.size()-1)));
    }
    public String getRandomAdjective()
    {
        return adjectives.get((int)(Math.random()*(adjectives.size()-1)));
    }
    public String toString()
    {

        String sent = "";
        for(int i = 0; i<tempstor.length;i++)
        {
            if (tempstor[i].equals("@"))
                sent+=getRandomVerb() + " ";
            else if (tempstor[i].equals("#"))
                sent+=getRandomNoun() + " ";
            else if (tempstor[i].equals("&"))
                sent+=getRandomAdjective() + " ";
            else
                sent += tempstor[i] + " ";
        }

        return sent;
    }
}
