//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creates panel for moving shapes
public class MovingShapePanel extends JPanel implements Runnable
{
    private Shape sh[];

    public MovingShapePanel() //Makes each shape
    {
        setBackground(Color.WHITE);
        setVisible(true);
        sh = new Shape[3];
        sh[0] = new Shape(150,290,140,80,Color.GREEN,2,2);
        sh[1] = new Shape(350,490,50,150,Color.red,2,2);
        sh[2] = new Shape(400,250,170,140,Color.blue,2,2);
        new Thread(this).start();
    }
    public void update(Graphics window)
    {
        paint(window);
    }
    public void paint(Graphics window) //Paints them on the screen and calls method to move them.
    {
        window.setColor(Color.WHITE);
        window.fillRect(0,0,getWidth(), getHeight());
        window.setColor(Color.BLUE);
        window.drawRect(20,20,getWidth()-40,getHeight()-40);
        window.setFont(new Font("TAHOMA",Font.BOLD,18));
        window.drawString("CREATE YOUR OWN SHAPE!",40,40);

        sh[0].moveAndDraw(window);

        if(!(sh[0].getX()>=10 && sh[0].getX()<=730))
        {
            sh[0].setXSpeed(-sh[0].getXSpeed());
            sh[0].moveAndDraw(window);
        }

        if(!(sh[0].getY()>=10 && sh[0].getY()<=530))
        {
            sh[0].setYSpeed(-sh[0].getYSpeed());
            sh[0].moveAndDraw(window);
        }

        sh[1].moveAndDraw(window);

        if(!(sh[1].getX()>=10 && sh[1].getX()<=730))
        {
            sh[1].setXSpeed(-sh[1].getXSpeed());
            sh[1].moveAndDraw(window);
        }

        if(!(sh[1].getY()>=10 && sh[1].getY()<=530))
        {
            sh[1].setYSpeed(-sh[1].getYSpeed());
            sh[1].moveAndDraw(window);
        }

        sh[2].moveAndDraw(window);

        if(!(sh[2].getX()>=10 && sh[2].getX()<=730))
        {
            sh[2].setXSpeed(-sh[2].getXSpeed());
            sh[2].moveAndDraw(window);
        }

        if(!(sh[2].getY()>=10 && sh[2].getY()<=530))
        {
            sh[2].setYSpeed(-sh[2].getYSpeed());
            sh[2].moveAndDraw(window);
        }


    }
    public void run()
    {
        try
        {
            while(true)
            {
                Thread.currentThread().sleep(10);
                repaint();
            }
        }catch(Exception e)
        {
        }
    }
}
