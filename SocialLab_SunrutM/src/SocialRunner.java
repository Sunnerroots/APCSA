
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class SocialRunner
{
    public static void main( String args[] ) throws IOException //Runs program a certain number of iterations from file
    {
        Scanner file = new Scanner(new File("/Users/Macbook/Desktop/School 23-24/AP CSA/SocialLab_SunrutM/src/social.dat"));
        int n = file.nextInt();
        file.nextLine();
        for (int i = 0; i<n; i++)
        {
            Social so = new Social(file.nextLine());
            System.out.println(so);
        }
    }
}
