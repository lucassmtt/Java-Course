package application;

import java.util.Locale;
import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);

        System.out.print("How many values in each vectors? ");
        int lenght_vector = myScan.nextInt();
        int[] vector_01 = new int[lenght_vector];
        int[] vector_02 = new int[lenght_vector];
        int[] vector_zip = new int[lenght_vector];

        System.out.println("Send the values of vector 1");
        for (int i = 0; i < lenght_vector; i++){
            System.out.print("Send the value of index " + i + ":");
            vector_01[i] = myScan.nextInt();
            vector_zip[i] = 1;
        }

        System.out.println("Send the values of vector 2");
        for (int j = 0; j < lenght_vector; j++){
            System.out.print("Send the value of index " + j + ":");
            vector_02[j] = myScan.nextInt();
        }
        int num_index = 0;
        int num_index_02 = 0;

        for (int k = 0; k < lenght_vector; k++){
            vector_zip[k] = vector_01[k] + vector_02[k];
        }

        System.out.println("Resultant vector:");
        for (int l = 0; l < lenght_vector; l++){
            System.out.print(vector_zip[l] + "\n");
        }
    }
}
