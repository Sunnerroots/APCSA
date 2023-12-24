//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class MouseButtonTester extends JFrame implements MouseListener
{
    private int mouseX, mouseY;
    private int mouseButton;
    private boolean isFirstRun;
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final long serialVersionUID = 0; //use this if you do not like warnings
    public MouseButtonTester()
    {
        super("Mouse Button Tester");
        //set up all variables
        mouseX = mouseY = 0;
        mouseButton = 0;
        isFirstRun = true;
        //set up the Frame
        setSize(WIDTH,HEIGHT);
        setBackground(Color.WHITE);
        setVisible(true);
        //start trapping for mouse clicks
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) //Gets the location of the mouse and which button is used
    {
        mouseX=e.getX();
        mouseY=e.getY();
        mouseButton = e.getButton();
        repaint();
    }
    public void paint( Graphics window ) //Sets up the window if it's the first run
    {
        if(isFirstRun)
        {
            window.setColor(Color.WHITE);
            window.fillRect(0,0,WIDTH, HEIGHT);
            isFirstRun = !isFirstRun;
        }
        window.setFont(new Font("TAHOMA",Font.BOLD,12));
        window.setColor(Color.BLUE);
        window.drawString("MOUSE BUTTON TESTER", 420,55);
        draw(window);
    }
    public void draw(Graphics window) //Checks which button is pressed (left or right click) and draws the shape depending on which
    {
        if(mouseButton==MouseEvent.BUTTON1) //left mouse button pressed
        {
            //window.drawString("BUTTON1", 50,200); //debug code
            window.setColor(Color.RED);
            window.drawRect(mouseX,mouseY,10,10);
        }
        else if (mouseButton == MouseEvent.BUTTON3) //Right mouse button pressed
        {
            window.setColor(Color.BLUE);
            window.drawArc(mouseX, mouseY, 10,10,0,360);
        }



    }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
}
