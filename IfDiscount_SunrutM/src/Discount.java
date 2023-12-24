
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty
public class Discount /*Where the action happens, uses sets up the discount object, uses if statement to see if amount is above
 2500, and it if that's true, it returns 15% off, or 85% of the original price.
*/{
    private double amount;
    public Discount( double a )
    {
        amount = a;
    }
    public boolean check() //Checks if value is above 2000
    {
        if (amount > 2000)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double getTheBill() //If the value is above 2000, it returns 85% of the original price
    {
        if (check())
        {
            return amount * 0.85;
        }
        else
        {
            return amount;
        }
    }
}
