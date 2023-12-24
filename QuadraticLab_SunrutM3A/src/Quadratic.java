//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty - 3B

//Uses the quadratic formula to output the two roots.
public class Quadratic
{
    double a;
    double b;
    double c;
    double discriminant;


    public static double getRootOne(double a, double b, double c )
    {
        //Finds discriminant and puts it in the quadratic formula, then returns root one (Using subtraction)
        double discriminant = Math.sqrt(Math.pow(b,2) - 4 * a * c);
        double root1 = (-b - discriminant)/(2*a);
        return root1;
    }
    public static double getRootTwo( double a, double b, double c )
    {
        //Same thing as the first, but using addition
        double discriminant = Math.sqrt(Math.pow(b,2) - 4 * a * c);
        double root2 = (-b + discriminant)/(2*a);
        return root2;
    }
}
