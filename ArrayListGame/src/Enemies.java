//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import javax.imageio.ImageIO;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.io.File;
public class Enemies
{
    private ArrayList<Enemy> enemies;
    private Person guy;
    public Enemies(Person p) throws IOException {
        enemies = new ArrayList<Enemy>();
        guy = p;
        addEnemy();
    }
    // DRAW AND COLLISION METHOD
    public void drawAndCollision(Graphics2D g) throws IOException
    {
        // ADD ENEMIES
    /*
        addEnemy();
        enemies.get(0).move();
        enemies.get(0).draw(g);
        if(guy.collide(enemies.get(0).getX(),enemies.get(0).getY()))
        {
            GAMEOVER(g);
        }

        if(enemies.get(0).getX()>800 || enemies.get(0).getX()<0 || enemies.get(0).getY() > 600 || enemies.get(0).getY()<0)
        {
            enemies.remove(0);
        }

        if(guy.getY() >= 550)
        {
            VICTORY(g);
        }


     */

        /*
        addEnemy();
        enemies.get(1).move();
        enemies.get(1).draw(g);
        if(guy.collide(enemies.get(1).getX(),enemies.get(1).getY()))
        {
            GAMEOVER(g);
        }

        if(enemies.get(1).getX()>800 || enemies.get(1).getX()<0 || enemies.get(1).getY() > 600 || enemies.get(1).getY()<0)
        {
            enemies.remove(1);
        }

        if(guy.getY() >= 550)
        {
            VICTORY(g);
        }

         */


        for (int i = 0; i < enemies.size(); i++)
        {
            enemies.get(i).move();
            enemies.get(i).draw(g);
            if(guy.collide(enemies.get(i).getX(),enemies.get(i).getY()))
            {
                GAMEOVER(g);
            }

            if(enemies.get(i).getX()>800 || enemies.get(i).getX()<0 || enemies.get(i).getY() > 600 || enemies.get(i).getY()<0)
            {
                enemies.remove(i);
                if(i == enemies.size()-1)
                {
                    addEnemy();
                }
            }

            if(guy.getY() >= 550)
            {
                VICTORY(g);
            }
        }






        // REMOVE ENEMIES THAT GO OUT OF BOUND
        // GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
        // IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method
    }
    public void GAMEOVER(Graphics2D g)
    {
        Game.RUNNING = false;
        Font f = new Font("Dialog", Font.PLAIN, 24);
        g.setFont(f);
        g.drawString("GAME OVER!", 400, 300);
    }
    public void VICTORY(Graphics2D g)
    {
        Font f = new Font("Dialog", Font.PLAIN, 24);
        g.setFont(f);
        g.drawString("VICTORY!", 400, 300);
        Game.RUNNING = false;
    }
    // ADDS AN ENEMY TO THE ENEMY LIST
    public void addEnemy() throws IOException
    {

        //enemies.add(new Enemy((int)Math.random()*800,(int)Math.random()*500+100,5));


        for (int i = 150; i<550; i+=50)
        {
            enemies.add(new Enemy(0,(int)(Math.random()*300)+150,(int)(Math.random()*20)+10));
        }

    }
    // RETURN HOW MANY ENEMIES THERE ARE
    public int numEnemies()
    {
        return enemies.size();
    }
}
