//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
public class Ground
{
    private ArrayList<Image> tiles = new ArrayList<>();
    public Ground() throws IOException
    {
        //point the tiles at new array list
        //add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
        //tiles.add(ImageIO.read(new File("grass.gif")));
        tiles.add(ImageIO.read(new File("grass.gif")));
        tiles.add(ImageIO.read(new File("gtoroad.gif")));
        tiles.add(ImageIO.read(new File("road.gif")));
        tiles.add(ImageIO.read(new File("rtograss.gif")));



    }
    public void drawGround(Graphics2D g)
    {
        for (int y = 0; y<= 50; y+=50)
        {
            for(int i = 0; i<=800; i+=50)
            {
                g.drawImage(tiles.get(0),i,y,null);
            }
        }

        for(int i = 0; i<=800;i+=50)
        {
            g.drawImage(tiles.get(1),i,100,null);
        }

        for(int y = 150; y<=450; y+=50)
        {
            for(int i = 0; i<=800;i+=50)
            {
                g.drawImage(tiles.get(2),i,y,null);
            }
        }

        for (int i = 0; i<=800; i+=50)
        {
            g.drawImage(tiles.get(3),i,500,null);
        }

        for (int i = 0; i<=800; i+=50)
        {
            g.drawImage(tiles.get(0),i,550,null);
        }


    }
}
