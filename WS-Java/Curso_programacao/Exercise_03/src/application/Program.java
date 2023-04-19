package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner mySc = new Scanner(System.in);
        Student myStudent = new Student();

        System.out.println("Enter the name of student");
        myStudent.name = mySc.next();

        System.out.println("Enter the note one");
        double noteone = mySc.nextDouble();
        myStudent.setNoteOne(noteone);

        System.out.println("Enter the note two");
        double notetwo = mySc.nextDouble();
        myStudent.setNoteTwo(notetwo);

        System.out.println("Enter the note three");
        double notethree = mySc.nextDouble();
        myStudent.setNoteThree(notethree);

        System.out.println("Student grades were: ");
        System.out.println(myStudent.seeNotes());

        System.out.print("The student: ");
        myStudent.seeApproval();

        mySc.close();
    }
}
