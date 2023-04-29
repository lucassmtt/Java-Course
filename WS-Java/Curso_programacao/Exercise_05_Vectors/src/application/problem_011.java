package application;

import java.util.Locale;
import java.util.Scanner;
public class problem_011 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);
        System.out.print("How many peoples will to be send: ");
        int lenght_persons = myScan.nextInt();
        double[] myVect = new double[lenght_persons];
        double higher_height = 0.0;
        double shorter_height = 2.0;
        double sum = 0.0;
        int sum_f = 0;
        int sum_m = 0;

        int cont = 1;
        for (int i = 0; i < lenght_persons; i++, cont++){
            String gender = " ";
            System.out.print("Height of " + cont + "º person: ");
            myVect[i] = myScan.nextDouble();
            if (myVect[i] > higher_height){
                higher_height = myVect[i];
            }
            if (myVect[i] < shorter_height){
                shorter_height = myVect[i];
            }
            System.out.print("Gender of " + cont + "º person (F/M): ");
            gender = myScan.next().toUpperCase();
            if (gender.equals("F")){
                sum += myVect[i];
                sum_f += 1;
            }
            else{
                sum_m += 1;
            }
        }
        double mean_height_f = 0.0;
        mean_height_f = sum / sum_f;

        System.out.print("Shorter height: " + shorter_height + "\n");
        System.out.print("Higher height: " + higher_height + "\n");
        System.out.print("Mean of height feminine: " + mean_height_f + "\n");
        System.out.print("Numbers of man: " + sum_m);
    }
}
