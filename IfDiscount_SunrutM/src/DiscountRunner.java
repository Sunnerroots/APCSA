
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
import static java.lang.System.*;
import java.util.Scanner;
public class DiscountRunner
{
    public static void main( String args[] ) //Takes the normal bill amount, creates the discount object, returns the final price
    {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter the original bill amount :: ");
        double amt = keyboard.nextDouble();
        Discount d = new Discount(amt);
        out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());
    }
}
