package application;

import java.util.Scanner;

public class problem_1
{
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int len_vector;
        System.out.println("Enter the value of vector: ");
        len_vector = myScan.nextInt();
        int[] vector = new int[len_vector];

        for (int i = 0; i < len_vector; i++)
        {
            System.out.println("Enter the value of index " + i);
            vector[i] = myScan.nextInt();
        }
        int num;
        System.out.println("Negatives numbers: ");
        for (int j = 0; j < len_vector; j++)
        {
            num = vector[j];
            if (num < 0)
            {
                System.out.println(num);
            }
        }
    }
}
