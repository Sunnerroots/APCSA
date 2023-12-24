//(c) A+ Computer Science
//www.apluscompsci.com
//Sunrut Mohanty 3A
/*
This program uses the Scanner object, named 'scan', to grab the radius after the user answers the question given, "Enter
the radius. It then uses the radius to print out the area of a circle with this radius. It's goes on inside a while loop
until it breaks once the user types 0.
 */
import java.util.Scanner;

public class CircleRunner {
    public static void main (String args[]) {


        Scanner scan = new Scanner (System.in);
        double radius;
        while (true) {
            System.out.print("Enter the radius (Enter 0 to break): ");
            radius = scan.nextDouble();
            if (radius == 0) {
                break;
            }
            double area = Math.PI*Math.pow(radius,2);
            System.out.printf("Area: %.2f", area);
            System.out.println();
        }

    }
}


