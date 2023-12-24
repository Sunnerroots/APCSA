import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
/**
 * A class that represents a picture made up of a rectangle of {@link Pixel}s
 */
public class Picture {
    /** The 2D array of pixels that comprise this picture */
    private Pixel[][] pixels;
    /**
     * Creates a Picture from an image file in the "images" directory
     * @param picture The name of the file to load
     */
    public Picture(String picture) {
        //new File(" .image/" + picture); -- Changed for macbook
        File file = new File(picture);
        BufferedImage image;
        if (!file.exists()) throw new RuntimeException("No picture at the location "+file.getPath()+"!");
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        pixels = new Pixel[image.getHeight()][image.getWidth()];
        for (int y = 0; y<pixels.length; y++) {
            for (int x = 0; x<pixels[y].length; x++) {
                int rgb = image.getRGB(x, y);
/*
* For the curious - BufferedImage saves an image's RGB info into a
hexadecimal integer
* The below extracts the individual values using bit-shifting and
bit-wise ANDing with all 1's
*/
                pixels[y][x] = new Pixel((rgb>>16)&0xff, (rgb>>8)&0xff, rgb&0xff);
            }
        }
    }
    /**
     * Creates a solid-color Picture of a given color, width, and height
     * @param red The red value of the color
     * @param green The green value of the color
     * @param blue The blue value of the color
     * @param height The height of the Picture
     * @param width The width of the Picture
     */
    public Picture(int red, int green, int blue, int height, int width) {
        pixels = new Pixel[height][width];
        for (int y = 0; y<pixels.length; y++) {
            for (int x = 0; x<pixels[y].length; x++) {
                pixels[y][x] = new Pixel(red, green, blue);
            }
        }
    }
    /**
     * Creates a solid white Picture of a given width and height
     * @param color The {@link Color} of the Picture
     * @param height The height of the Picture
     * @param width The width of the Picture
     */
    public Picture(int height, int width) {
        this(Color.WHITE, height, width);
    }
    /**
     * Creates a solid-color Picture of a given color, width, and height
     * @param color The {@link Color} of the Picture
     * @param width The width of the Picture
     * @param height The height of the Picture
     */
    public Picture(Color color, int height, int width) {
        this(color.getRed(), color.getGreen(), color.getBlue(), height, width);
    }
    /**
     * Creates a Picture based off of an existing {@link Pixel} 2D array
     * @param pixels A rectangular 2D array of {@link Pixel}s. Must be at least 1x1
     */
    public Picture(Pixel[][] pixels) {
        if (pixels.length==0 || pixels[0].length==0) throw new
                RuntimeException("Can't have an empty image!");
        int width = pixels[0].length;
        for (int i = 0; i<pixels.length; i++) if (pixels[i].length!=width)
            throw new RuntimeException("Pictures must be rectangles. pixels[0].length!=pixels["+i+"].length!");
        this.pixels = new Pixel[pixels.length][width];
        for (int i = 0; i<pixels.length; i++) {
            for (int j = 0; j<pixels[i].length; j++) {
                this.pixels[i][j] = new Pixel(pixels[i][j].getColor());
            }
        }
    }
    /**
     * Creates a Picture based off of an existing Picture
     * @param picture The Picture to copy
     */
    public Picture(Picture picture) {
        this(picture.pixels);
    }
    /**
     * Gets the width of the Picture
     * @return The width of the Picture
     */
    public int getWidth() {
        return pixels[0].length;
    }
    /**
     * Gets the height of the Picture
     * @return The height of the Picture
     */
    public int getHeight() {
        return pixels.length;
    }
    /**
     * Gets the {@link Pixel} at a given coordinate
     * @param x The x location of the {@link Pixel}
     * @param y The y location of the {@link Pixel}
     * @return The {@link Pixel} at the given location
     */
    public Pixel getPixel(int x, int y) {
        if (x>=getWidth() || y>=getHeight() || x<0 || y<0) throw new
                RuntimeException("No pixel at ("+x+", "+y+")");
        return pixels[y][x];
    }
    /**
     * Sets the {@link Pixel} at a given coordinate
     * @param x The x location of the {@link Pixel}
     * @param y The y location of the {@link Pixel}
     * @param pixel The new {@link Pixel}
     */
    public void setPixel(int x, int y, Pixel pixel) {
        if (x>=getWidth() || y>=getHeight() || x<0 || y<0) throw new
                RuntimeException("No pixel at ("+x+", "+y+")");
        if (pixel==null) throw new NullPointerException("Pixel is null"); //guard is required because pixel's value isn't used in this method
        pixels[y][x] = pixel;
    }
    /**
     * Opens a {@link PictureViewer} to view this Picture
     * @return the {@link PictureViewer} viewing the Picture
     */
    public PictureViewer view() {
        return new PictureViewer(this);
    }
    /**
     * Save the image on disk as a JPEG
     * Call programmatically on a Picture object, it will prompt you to choose a
     save location
     * In the save dialogue window, specify the file AND extension (e.g.
     "lilies.jpg")
     * Extension must be .jpg as ImageIO is expecting to write a jpeg
     */
    public void save()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        BufferedImage image = new BufferedImage(this.pixels[0].length,
                this.pixels.length, BufferedImage.TYPE_INT_RGB);
        for (int r = 0; r < this.pixels.length; r++)
            for (int c = 0; c < this.pixels[0].length; c++)
                image.setRGB(c, r, this.pixels[r][c].getColor().getRGB());
//user's Desktop will be default directory location
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home")
                + "/Desktop");
        chooser.setDialogTitle("Select picture save location / file name");
        File file = null;
        int choice = chooser.showSaveDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION)
            file = chooser.getSelectedFile();
//append extension if user didn't read save instructions
        if (!file.getName().endsWith(".jpg") && !
                file.getName().endsWith(".JPG") && !file.getName().endsWith(".jpeg") && !
                file.getName().endsWith(".JPEG"))
            file = new File(file.getAbsolutePath() + ".jpg");
        try {
            ImageIO.write(image, "jpg", file);
            System.out.println("File created at " + file.getAbsolutePath());
        }
        catch (IOException e) {
            System.out.println("Can't write to location: " +
                    file.toString());
        }
        catch (NullPointerException|IllegalArgumentException e) {
            System.out.println("Invalid directory choice");
        }
    }
    /** return a copy of the reference to the 2D array of pixels that comprise
     this picture */
    public Pixel[][] getPixels() {
        return pixels;
    }
/********************************************************
 *************** STUDENT METHODS BELOW ******************
 ********************************************************/
    /** remove all blue tint from a picture */
    public void zeroBlue()
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                pixels[i][y].setBlue(0);
            }
        }
    }
    /** remove everything BUT blue tint from a picture */
    public void keepOnlyBlue()
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                pixels[i][y].setRed(0);
                pixels[i][y].setGreen(0);
            }
        }
    }
    /** invert a picture's colors */
    public void negate()
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                pixels[i][y].setBlue(255 - (pixels[i][y].getBlue()));
                pixels[i][y].setRed(255 - (pixels[i][y].getRed()));
                pixels[i][y].setGreen(255 - (pixels[i][y].getGreen()));
            }
        }
    }
    /** simulate the over-exposure of a picture in film processing */
    public void solarize(int threshold)
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                if(pixels[i][y].getBlue() <= threshold)
                    pixels[i][y].setBlue(255 - (pixels[i][y].getBlue()));
                else if(pixels[i][y].getRed() <= threshold)
                    pixels[i][y].setRed(255 - (pixels[i][y].getRed()));
                else if(pixels[i][y].getGreen() <= threshold)
                    pixels[i][y].setGreen(255 - (pixels[i][y].getGreen()));
            }
        }
    }
    /** convert an image to grayscale */
    public void grayscale()
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                int avg = (pixels[i][y].getBlue() + pixels[i][y].getRed() + pixels[i][y].getGreen())/3;
                pixels[i][y].setBlue(avg);
                pixels[i][y].setRed(avg);
                pixels[i][y].setGreen(avg);
            }
        }
    }

    /** change the tint of the picture by the supplied coefficients */
    public void tint(double red, double blue, double green)
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                if(red * pixels[i][y].getRed() > 255)
                    pixels[i][y].setRed(255);
                else
                    pixels[i][y].setRed((int)(red*pixels[i][y].getRed()));

                if(blue * pixels[i][y].getBlue() > 255)
                    pixels[i][y].setRed(255);
                else
                    pixels[i][y].setBlue((int)(blue*pixels[i][y].getBlue()));

                if(green * pixels[i][y].getGreen() > 255)
                    pixels[i][y].setGreen(255);
                else
                    pixels[i][y].setGreen((int)(red*pixels[i][y].getGreen()));
            }
        }
    }
    /** reduces the number of colors in an image to create a "graphic poster"
     effect */
    public void posterize(int span)
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                pixels[i][y].setBlue(pixels[i][y].getBlue()/span*span);
                pixels[i][y].setRed(pixels[i][y].getRed()/span*span);
                pixels[i][y].setGreen(pixels[i][y].getGreen()/span*span);
            }
        }
    }
    /** mirror an image about a vertical midline, left to right */
    public void mirrorVertical()
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int r = 0; r < pixels.length; r++)
        {
            for (int c = 0; c < width / 2; c++)
            {
                leftPixel = pixels[r][c];
                rightPixel = pixels[r][(width - 1) - c];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    /** mirror about a vertical midline, right to left */
    public void mirrorRightToLeft()
    {
//TODO
    }
    /** mirror about a horizontal midline, top to bottom */
    public void mirrorHorizontal()
    {
        Pixel topPixel = null;
        Pixel botPixel = null;
        int height = pixels.length;
        for (int r = 0; r < height; r++)
        {
            for (int c = 0; c < pixels[r].length; c++)
            {
                topPixel = pixels[r][c];
                botPixel = pixels[(height-1)-r][c];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }
    /** flip an image upside down about its bottom edge */
    public void verticalFlip()
    {
        Pixel topPixel = null;
        Pixel botPixel = null;
        int height = pixels.length;
        for (int r = 0; r < height/2; r++)
        {
            for (int c = 0; c < pixels[r].length; c++)
            {
                topPixel = pixels[r][c];
                botPixel = pixels[(height-1)-r][c];
                Color temp = botPixel.getColor();
                botPixel.setColor(topPixel.getColor());
                topPixel.setColor(temp);
            }
        }
    }
    /** fix roof on greek temple */
    //[28][277]
    public void fixRoof()
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int r = 0; r < pixels.length; r++)
        {
            for (int c = 0; c < width / 2; c++)
            {
                leftPixel = pixels[r][c];
                rightPixel = pixels[r][(width - 1) - c];
                rightPixel.setColor(leftPixel.getColor());
            }
        }

        // Or call mirrorVertical()
    }
    /** detect and mark edges in an image */
    public void edgeDetection(int dist)
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length-1;y++)
            {
                if(pixels[i][y+1].colorDistance(pixels[i][y].getColor()) > dist)
                {
                    pixels[i][y].setColor(Color.BLACK);
                }
                else
                    pixels[i][y].setColor(Color.WHITE);
            }
        }

        for(int i = 0; i< pixels.length-1; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                if(pixels[i+1][y].colorDistance(pixels[i][y].getColor()) > dist)
                {
                    pixels[i][y].setColor(Color.BLACK);
                }
                else
                    pixels[i][y].setColor(Color.WHITE);
            }
        }
    }
    /** copy another picture's pixels into this picture, if a color is within
     dist of param Color */
    public void chromakey(Picture other, Color color, int dist)
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[0].length;y++)
            {
                if(pixels[i][y].colorDistance(color)< dist)
                {
                    pixels[i][y].setColor(other.pixels[i][y].getColor());
                }
            }
        }
    }
    /** steganography encode (hide the message in msg in this picture) */
    public void encode(Picture msg)
    {
        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                if(pixels[i][y].getRed() % 2 != 0)
                    pixels[i][y].setRed(pixels[i][y].getRed()-1);
            }
        }

        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                if(msg.pixels[i][y].colorDistance(Color.BLACK) <= 50)
                {
                    pixels[i][y].setRed(pixels[i][y].getRed()+1);
                }
            }
        }
    }
    /** steganography decode (return a new Picture containing the message hidden
     in this picture) */
    public Picture decode()
    {
        Picture npic = new Picture(getHeight(),getWidth());

        for(int i = 0; i< pixels.length; i++)
        {
            for (int y = 0; y<pixels[i].length;y++)
            {
                if(pixels[i][y].getRed() % 2 != 0)
                {
                    npic.pixels[i][y].setColor(Color.BLACK);
                }
                else
                {
                    npic.pixels[i][y].setColor(pixels[i][y].getColor());
                }
            }
        }
        return npic;
    }
    /** perform a simple blur using the colors of neighboring pixels */
    public Picture simpleBlur()
    {
        Picture npic = new Picture(getHeight(),getWidth());
        for(int i = 1; i< pixels.length-1; i++)
        {
            for (int y = 1; y<pixels[i].length-1;y++)
            {
                Pixel left = pixels[i][y-1];
                Pixel right = pixels[i][y+1];
                Pixel top = pixels[i-1][y];
                Pixel bot = pixels[i+1][y];
                int redAvg = (left.getRed()+ right.getRed()+ top.getRed()+ bot.getRed()+pixels[i][y].getRed())/5;
                int bluAvg = (left.getBlue()+ right.getBlue()+ top.getBlue()+ bot.getBlue()+pixels[i][y].getBlue())/5;
                int greAvg = (left.getGreen()+ right.getGreen()+ top.getGreen()+ bot.getGreen()+pixels[i][y].getGreen())/5;
                npic.pixels[i][y].setColor(redAvg,greAvg,bluAvg);
            }
        }
        return npic;
    }
    /** perform a blur using the colors of pixels within radius of current pixel
     */
    public Picture blur(int radius)
    {
        Picture npic = new Picture(getHeight(),getWidth());
        for(int i = radius; i < pixels.length-radius; i++)
        {
            for (int y = radius; y<pixels[i].length-radius;y++)
            {
                int redAvg = 0;
                int greAvg = 0;
                int bluAvg = 0;
                int divisor = (1+2*radius)*(1+2*radius);
                for(int z = i-radius; z<=i+radius;z++)
                {
                    for (int x = y-radius; x<=y+radius; x++)
                    {
                        redAvg += pixels[z][x].getRed();
                        greAvg += pixels[z][x].getGreen();
                        bluAvg += pixels[z][x].getBlue();
                    }
                }
                redAvg /= divisor;
                greAvg /= divisor;
                bluAvg /= divisor;
                npic.pixels[i][y].setColor(redAvg,greAvg,bluAvg);
            }
        }
        return npic;
    }
    /**
     * Simulate looking at an image through a pane of glass
     * @param dist the "radius" of the neighboring pixels to use
     * @return a new Picture with the glass filter applied
     */
    public Picture glassFilter(int dist)
    {
        Picture rect = new Picture(getHeight(),getWidth());
        for(int i = 0; i < pixels.length;i++)
        {
            for(int y = 0; y<pixels[i].length;y++)
            {
                int ypos = random(i-dist,i+dist);
                if(ypos < 0)
                    ypos = 0;
                if(ypos >= pixels.length)
                    ypos = pixels.length-1;

                int xpos = random(y-dist,y+dist);
                if(xpos < 0)
                    xpos = 0;
                if(xpos >= pixels[i].length)
                    xpos = pixels[i].length-1;

                if(xpos < 0 || ypos<0)
                    System.out.println("brh");
                rect.pixels[i][y].setColor(pixels[ypos][xpos].getColor());
            }
        }
        return rect;
    }
    public int random(int low, int high)
    {
        Random rand = new Random();
        int num = rand.nextInt(low,high+1);
        return num;
    }
}
