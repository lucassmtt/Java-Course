package application;

import java.util.Scanner;
import java.util.Locale;
public class problem_08 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);
        System.out.println("How many elements will be the vector? ");
        int lenght_vector = myScan.nextInt();
        int[] myVect = new int[lenght_vector];

        int sum = 0;
        int lenght_even_numbers = 0;
        int mean = 0;
        for (int i = 0; i < lenght_vector; i++){
            System.out.print("\nSend the value of index " + i + ": ");
            myVect[i] = myScan.nextInt();

            if (myVect[i] % 2 == 0){
                sum += myVect[i];
                lenght_even_numbers += 1;
            }
        }

        if (sum > 0){
            mean = sum / lenght_even_numbers;
            System.out.print("Mean of even numbers: " + mean);
        }
        else{
            System.out.print("No even number");
        }
    }
}
