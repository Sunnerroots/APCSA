import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        /*
        Do prime factorization on the number
        This is done by taking the number and going to the smallest number divisble by it (that's not 1), then dividing
        thenumber by that number. Whichever number is larger, divide that down more, until you get to the multiple of 1           and the number. Each time you get a smaller number
        */
        ArrayList<Integer> fac = new ArrayList<>();
        int num = sc.nextInt();
        int c = num;
        while(true)
        {
            int i;
            for(i = 2; i<c;i++)
            {
                if (c % i == 0)
                {
                    fac.add(i);
                    break;
                }
            }
            if (c/i == i )
            {
                fac.add(i);
                break;
            }
            else if (c/i==1)
            {
                fac.add(c);
                break;
            }

            c/=i;

        }
        int count = 0;
        for (Integer i : fac)
            count++;
        if (count<=3)
            System.out.print(""+ num + " " + fac + " YES");
        else
            System.out.print(""+ num + " " + fac + " NO");
    }
}