package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
public class problem_010 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);
        System.out.print("How many students will to be sends? ");
        int lenght_students = myScan.nextInt();
        String[] students = new String[lenght_students];

        System.out.print("How many grades will be analyzed? ");
        int lenght_grades = myScan.nextInt();
        int[] grades = new int[lenght_grades];
        int sum = 0;
        ArrayList<String> approveds = new ArrayList<>();

        for (int i = 0; i < lenght_students; i++){
            System.out.print("Send the name of student " + i + ": ");
            students[i] = myScan.next();
            System.out.println("Send the grades of student " + students[i]);

            for (int j = 0; j < lenght_grades; j++){
                System.out.print("Send the grade " + j + ": ");
                grades[j] = myScan.nextInt();
            }
            for (int j = 0; j < lenght_grades; j++){
                sum += grades[j];
            }
            if ((sum / lenght_grades) > 6){
                System.out.print("Approved: " + students[i] + "\n");
                approveds.add(students[i]);
            }
            else{
                System.out.print("Disapproved: " + students[i] + "\n");
            }
            sum = 0;
        }

        System.out.println("Approveds: " + approveds);
    }
}
