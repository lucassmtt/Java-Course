package application;

import java.util.Scanner;

public class problem_2
{
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the lenght of vector: ");
        int num;
        int len_vector = myScan.nextInt();
        int[] myVector = new int[len_vector];

        for (int i = 0; i < len_vector; i++)
        {
            System.out.print("Enter one value: ");
            num = myScan.nextInt();
            myVector[i] = num;
        }

        int sum = 0;
        int mean = 0;

        System.out.print("Values: ");
        for (int j = 0; j < len_vector; j++)
        {
            System.out.print(myVector[j] + " ");
            sum += myVector[j];
        }
        mean = sum / len_vector;

        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);
    }
}
