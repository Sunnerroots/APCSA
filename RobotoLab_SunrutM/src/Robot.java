
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty

//Class uses the Graphics class to make a drawing with various methods that draw certain shapes

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
class Robot extends Canvas
{
    public Robot() //constructor method - sets up the class
    {
        setSize(800,600);
        setBackground(Color.WHITE);
        setVisible(true);
    }
    public void paint( Graphics window )
    {
        window.setColor(Color.BLUE);
        window.drawString("Robot Lab - Sunrut Mohanty", 35, 35);
        Robot.head(window);
        Robot.upperBody(window);
        Robot.lowerBody(window);
    }
    public static void head( Graphics window ) //Draws the head
    {
        window.setColor(Color.YELLOW);
        window.fillOval(300, 100, 200, 100);
        //add more code here
    }
    public static void upperBody( Graphics window ) //Draws the eyes, torso, nose, smile, and arms
    {
        window.setColor(Color.BLUE);
        window.fillRect(375,200,50,200);
        window.setColor(Color.BLACK);
        window.drawLine(375,300,250,120);
        window.drawLine(425,300,550,120);
        window.fillOval(385,150,30,20);
        window.setColor(Color.GREEN);
        window.fillOval(350,125,20,20);
        window.fillOval(430,125,20,20);
        window.setColor(Color.RED);
        window.drawArc(365,140,70,50,0,-180);
    }
    public static void lowerBody( Graphics window ) //Draws legs
    {
        window.setColor(Color.PINK);
        window.drawLine(375,400,250,520);
        window.drawLine(425,400,525,520);
    }
}
