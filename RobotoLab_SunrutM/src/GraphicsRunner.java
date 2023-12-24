
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import javax.swing.JFrame;
public class GraphicsRunner extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public GraphicsRunner() //Sets up canvas and uses Robot class to draw
    {
        super("Graphics Runner");
        setSize(WIDTH,HEIGHT);
        getContentPane().add(new Robot());
        //add other classes to run them
        //BigHouse, Robot, Character, or ShapePanel
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main( String args[] ) //Run from here
    {
        GraphicsRunner run = new GraphicsRunner();
    }
}
