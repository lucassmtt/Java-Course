package application;

import java.util.Locale;
import java.util.Scanner;
public class problem_09 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);
        System.out.println("How many peoples will you send?");
        int lenght_vector = myScan.nextInt();
        int[] ages = new int[lenght_vector];
        String[] names = new String[lenght_vector];
        int high_age = 0;
        String older_person = " ";
        for (int i = 0; i < lenght_vector; i++){
            System.out.println("Send the values of people " + i + ": ");
            System.out.print("Name: ");
            names[i] = myScan.next();

            System.out.print("Age: ");
            ages[i] = myScan.nextInt();

            if (ages[i] > high_age){
                high_age = ages[i];
                older_person = names[i];
            }
        }
        System.out.print("Older person: " + older_person);


    }
}
