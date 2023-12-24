//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
public class Person
{
    private ArrayList<Image> list = new ArrayList<>();
    private int x, y, current;
    public Person(int x, int y) throws IOException
    {
        this.x=x;
        this.y=y;
        Image down = ImageIO.read(new File("dudeFront.gif"));
        list.add(down);
        Image left = ImageIO.read(new File("dudeL.gif"));
        list.add(left);
        Image right = ImageIO.read(new File("dudeR.gif"));
        list.add(right);
        Image up = ImageIO.read(new File("dudeU.gif"));
        list.add(up);
    }
        // will return true if person collides with another object
    public boolean collide(int x, int y)
    {
        Rectangle a = new Rectangle(this.x, this.y, 50, 50);
        Rectangle b = new Rectangle(x, y, 50, 50);
        return a.intersects(b);
    }
    public void drawPerson(Graphics2D g)
    {
        g.drawImage(getCurrent(),x,y,null);
    }
    public Image getCurrent()
    {
        //return the current image
        return list.get(current);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void moveRight()
    {
        x+=4;
        current = 2;
    }
    public void moveLeft()
    {
        x-=4;
        current = 1;
    }
    public void moveUp()
    {
        y-=4;
        current = 3;
    }
    public void moveDown()
    {
        y+=4;
        current = 0;
    }
}
