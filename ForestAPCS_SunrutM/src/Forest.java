
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Forest
{
    private Thing[][] grid;
    public Forest(int rows, int cols)
    {
        final String[] typeList = "cat dog tree rock".split(" ");
        final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
        grid = new Thing[rows+2][cols+2];
        for(int f = 0; f<grid.length; f++)
            grid[f][0] = null;
        for(int g = 0; g<grid[0].length; g++)
            grid[0][g] = null;
        for (int i = 1; i < grid.length-1; i++)
        {
            for (int y = 1; y<grid[i].length-1; y++)
            {
                int type = (int)(Math.random()*4); //round math.random*3
                int name = (int)(Math.round((Math.random()* (nameList.length-1))));
                int size = (int)(Math.random()*40);
                grid[i][y] = (new Thing(typeList[type], nameList[name],size));
            }
        }
    }
    public int setTrappedToNull( )
    {
        //Iterate through each element and set nulls accordingly *Works*

        int traps = 0;
        for(int i = 1; i < grid.length-1; i++)
        {
            for(int y = 1; y<grid[i].length-1;y++)
            {

                if(isTrapped(i,y))
                {
                    grid[i][y] = null;
                    traps++;
                }


            }
        }
        return traps;
    }
    //if location ! a rock &&
    //is surrounded by > 5 trees or rocks larger than 10
    // [9][1] example
    //Checks [8][0], [8][1], [8][2], [9][0], [9][2], [10][0], [10][1], [10][2]
    public boolean isTrapped( int r, int c)
    {

        String curT = grid[r][c].getType();
        boolean check = (curT.equalsIgnoreCase("rock")) || (curT.equalsIgnoreCase("tree"));
        if (!check)
        {
            int obs = 0;
            for(int i = r-1; i<=r+1;i++)
            {
                for (int y = c-1; y<=c+1; y++)
                {
                    if(i==r && y==c)
                    {
                        continue;
                    }

                    else
                    {
                        if(grid[i][y] == null)
                            continue;
                        if((grid[i][y].getType().equalsIgnoreCase("tree") || grid[i][y].getType().equalsIgnoreCase("rock")) && grid[i][y].getSize() >= 10)
                            obs++;
                    }
                }
            }
            if(obs >= 5)
                return true;
            else
                return false;
        }


        /*
        int obs = 0;
        if(grid[r][c].getType() != "rock" && grid[r][c].getType() != "tree")
        {


            if(r>0 && r<grid.length-1 && c>0 && c<grid[r].length-1)
            {
                for(int i = r-1; i<=r+1;i++)
                {
                    for (int y = c-1; y<=c+1; y++)
                    {
                        if(i==r && y==c)
                            continue;
                        else
                        {
                            if(grid[i][y] == null)
                                continue;
                            else if((grid[i][y].getType() == "tree" || grid[i][y].getType() == "rock") && grid[i][y].getSize() > 10)
                                obs++;
                        }
                    }
                }
            }
        }
        if (obs >= 5)
        {
            return true;
        }
        */

        return false;
    }
    private boolean inBounds( int r, int c)
    {
        return false;
    }
    public String toString()
    {
        String fF = "";
        for(int i = 1; i < grid.length-1; i++)
        {
            for(int y = 1; y<grid[i].length-1;y++)
            {
                if(grid[i][y] != null)
                    fF += grid[i][y].toString();
                else
                    fF += null + "  ";
            }
            fF += "\n";
        }
        return fF;
    }
}
