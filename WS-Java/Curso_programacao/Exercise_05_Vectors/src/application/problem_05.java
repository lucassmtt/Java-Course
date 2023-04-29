package application;

import java.util.Locale;
import java.util.Scanner;
public class problem_05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);

        System.out.print("Send the quantity of numbers: ");
        int quantity = myScan.nextInt();
        int[] vector = new int[quantity];
        int higt_number = 0;
        int position_hight_number = 0;

        for (int i = 0; i < quantity; i++){
            System.out.print("Send number: ");
            vector[i] = myScan.nextInt();
            if (vector[i] > higt_number){
                higt_number = vector[i];
                position_hight_number = i;
            }
        }
        System.out.print("High number: " + higt_number);
        System.out.print("\nPosition high number: " + (position_hight_number + 1));
    }
}
