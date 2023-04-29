package application;

import java.util.Scanner;
import java.util.Locale;
public class problem_07 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);

        System.out.print("How many elements will there be in the vector? ");
        int lenght = myScan.nextInt();
        int[] myvect = new int[lenght];

        int mean, sum = 0;

        for (int i = 0; i < lenght; i++){
            System.out.print("Send the number of index " + i + ": ");
            myvect[i] = myScan.nextInt();
            sum += myvect[i];
        }
        mean = sum / lenght;
        System.out.print("Vector mean: " + mean + "\n");
        System.out.print("Elements out mean: ");
        for (int i = 0; i < lenght; i++){
            if (myvect[i] < mean){
                System.out.print(myvect[i]);
            }
        }
    }
}
