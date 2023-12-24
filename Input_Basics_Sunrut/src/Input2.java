// Sunrut Mohanty 3A
/* This program uses the Scanner class, as seen by the Scanner object "scan," to grab the users first
and last name upon request. After both questions are asked and answered, it prints first and last name between hashtag
borders and it does the same but in last name, first name form.
 */



import java.util.Scanner;


public class Input2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String firstName;
        String lastName;
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        System.out.println("##################");
        System.out.println("##################");
        System.out.println(firstName + " " + lastName);
        System.out.println("##################");
        System.out.println("##################");
        System.out.println(lastName + ", " + firstName);
        System.out.println("##################");
        System.out.println("##################");
    }
}
