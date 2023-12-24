//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sunrut Mohanty - 3A
import java.util.Scanner;
import static java.lang.System.*;

//This takes 3 arguments for a quadratic equation: a,b,c. It then finds the roots of the equation with these values.
public class QuadraticRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        //Created Quadratic Object
        Quadratic quad = new Quadratic();
        //Declaring the values
        double a;
        double b;
        double c;
        //Questions, scanner grabs it
        out.print("Enter an 'a' value: ");
        a = scan.nextDouble();
        out.print("Enter a 'b' value: ");
        b = scan.nextDouble();
        out.print("Enter a 'c' value: ");
        c = scan.nextDouble();

        //Methods that return each root called then prints
        System.out.println("Root One: " + quad.getRootOne(a,b,c));
        System.out.println("Root Two: " + quad.getRootTwo(a,b,c));

    }
}