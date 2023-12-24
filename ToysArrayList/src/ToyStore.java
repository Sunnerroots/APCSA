
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToyStore
{
    private ArrayList<Toy> toyList;
    public ToyStore()
    {
        toyList = new ArrayList<>();
    }
    public void loadToys( String[] toys )
    {
        List<String> t = Arrays.asList(toys);
        ArrayList<String> nam = new ArrayList<>();
        for(String x:toys)
        {
            if(!nam.contains(x))
            {
                nam.add(x);
            }
        }
        for (int i = 0; i< nam.size();i++)
        {
            toyList.add(new Toy(nam.get(i)));
            toyList.get(i).setCount(Collections.frequency(t,toyList.get(i).getName()));
        }

    }
    public Toy getThatToy( String nm )
    {

        for(int i = 0; i<toyList.size();i++)
        {
            if (toyList.get(i).getName().equalsIgnoreCase(nm))
            {
                return toyList.get(i);
            }
        }

        return null;
    }
    public String getMostFrequentToy()
    {
        int most = -1;
        int ind = -1;
        for(int i = 0; i<toyList.size();i++)
        {
            if (toyList.get(i).getCount() > most)
            {
                most = toyList.get(i).getCount();
                ind = i;
            }
        }

        return toyList.get(ind).getName();
    }
    public void sortToysByCount()
    {

    }
    public String toString()
    {
        return toyList.toString();
    }
}
