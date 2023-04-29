package application;

import java.util.Locale;
import java.util.Scanner;

public class problem_3
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);
        int lenght_peoples;

        System.out.print("Send the peoples amount: ");
        lenght_peoples = myScan.nextInt();

        String[] names = new String[lenght_peoples];
        int[] ages = new int[lenght_peoples];
        double[] heights = new double[lenght_peoples];
        for (int i = 0; i < lenght_peoples; i++){
            System.out.println("Send the values of people " + i);
            System.out.print("Name: ");
            names[i] = myScan.next();

            System.out.print("Age: ");
            ages[i] = myScan.nextInt();

            System.out.print("Height: ");
            heights[i] = myScan.nextDouble();
        }
        int height_mean, sum = 0;
        double people_under_sixteen = 0.0;
        for (int j = 0; j < lenght_peoples; j++){
            sum += ages[j];
            if (ages[j] < 16){
                people_under_sixteen += 1.0;
            }
        }
        double percent_under_sixteen = 0.0;
        percent_under_sixteen = people_under_sixteen * 100 / lenght_peoples;

        height_mean = sum / lenght_peoples;
        System.out.print("Height mean: " + height_mean + "\n");
        System.out.print("Peoples under sixteen: " + percent_under_sixteen + "%\n");
        for (int k = 0; k < lenght_peoples; k++){
            if (ages[k] < 16){
                System.out.print(names[k]);
            }
        }
    }
}
