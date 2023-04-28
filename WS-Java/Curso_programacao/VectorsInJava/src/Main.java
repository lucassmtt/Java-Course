import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);

        int len_vector, i;
        System.out.println("Enter the lenght of vector");
        len_vector = mySc.nextInt();

        int[] myVect = new int[len_vector];

        for (i = 0; i < len_vector; i++)
        {
            System.out.println("Enter the value of index " + i);
            myVect[i] = mySc.nextInt();
        }

        for (i = 0; i < len_vector; i++)
        {
            System.out.println("Out of index: " + i);
            System.out.println(myVect[i]);
        }

    }
}