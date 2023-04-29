package application;

import java.util.Scanner;
import java.util.Locale;
public class problem_4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);

        System.out.print("Send the quantity of numbers: ");
        int lenght = myScan.nextInt();
        int[] vector = new int[lenght];

        for (int i = 0; i < lenght; i++){
            System.out.print("Send the number: ");
            vector[i] = myScan.nextInt();
        }

        int sum = 0;

        for (int j = 0; j < lenght; j++){
            if (vector[j] % 2 == 0){
                System.out.print("Pair numbers: " + vector[j]);
                sum += 1;
            }
        }
        System.out.print("\nQuantity pair numbers: " + sum);
    }
}
