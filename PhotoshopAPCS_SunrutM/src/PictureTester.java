import java.awt.*;
public class PictureTester
{
    public static void main(String[] args)
    {
        //construct a Picture object from a jpg image on disk
        Picture arch = new Picture("arch.jpg");
        arch.view();
        //arch.view(); //calling the view() method displays the picture with the PictureViewer GUI

        //PUT YOUR TESTS HERE
        arch = new Picture("arch.jpg");
        arch.zeroBlue();
        arch.view();

        arch = new Picture("arch.jpg");
        arch.keepOnlyBlue();
        arch.view();

        arch = new Picture("arch.jpg");
        arch.negate();
        arch.view();

        arch = new Picture("arch.jpg");
        arch.solarize(127);
        arch.view();

        arch = new Picture("arch.jpg");
        arch.grayscale();
        arch.view();

        arch = new Picture("arch.jpg");
        arch.tint(0.5,1,2);
        arch.view();

        arch = new Picture("arch.jpg");
        arch.posterize(63);
        arch.view();

        arch = new Picture("arch.jpg");
        arch.mirrorVertical();
        arch.view();

        arch = new Picture("arch.jpg");
        arch.mirrorHorizontal();
        arch.view();

        arch = new Picture("arch.jpg");
        arch.verticalFlip();
        arch.view();

        arch = new Picture("temple.jpg");
        arch.fixRoof();
        arch.view();

        arch = new Picture("swan.jpg");
        arch.edgeDetection(25);
        arch.view();

        testChromakey();

        testSteganography();

        arch = new Picture("arch.jpg");
        arch.simpleBlur().view();

        arch = new Picture("arch.jpg");
        arch.blur(2).view();

        arch = new Picture("arch.jpg");
        arch.glassFilter(20);
    }
    /** this method is static, you don't need to call it on an object (just
     "testChromekey()") */
    public static void testChromakey()
    {
        Picture one = new Picture("blue-mark.jpg");
        Picture two = new Picture("moon-surface.jpg");
        one.view(); //show original mustache guy picture
        two.view(); //show the untouched moon's surface pic
        one.chromakey(two, new Color(10, 40, 75), 60); //replace this color if within 60
        one.view();
    }
    /** this method is static, you don't need to call it on an object (just
     "testSteganography()") */
    public static void testSteganography()
    {
        Picture msg = new Picture("msg.jpg");
        Picture beach = new Picture("beach.jpg");
        beach.encode(msg); //hide message in beach picture
        beach.view(); //beach w/ hidden message inside, shouldn't look different
        beach.decode().view(); //see the hidden message in the beach picture
    }
}
