
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Color;

//Creates the tablet on which the shapes will be drawn
public class DrawIt extends JFrame
{
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    public DrawIt()
    {
        super("DrawIt");
        setSize(WIDTH, HEIGHT);
        setBackground(Color.BLACK);
        Tablet tb = new Tablet(this);
        ((Component)tb).setFocusable(true);
        getContentPane().add( tb );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main( String args[] )
    {
        DrawIt run = new DrawIt();
    }
}
