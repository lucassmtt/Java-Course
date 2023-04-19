package entities;

import java.io.PrintStream;

public class Student {
    public String name;
    double noteone;
    double notetwo;
    double notethree;
    double totalnotes;
    public void setNoteOne(double noteOne){
        if (noteOne > 30){
            System.out.println("Please, enter the note in between 0 and 30");
        }else{
            System.out.println("Set-up");
            noteone = noteOne;
        }
    }
    public void setNoteTwo(double noteTwo){
        if (noteTwo > 35){
            System.out.println("Please, enter the note in between 0 and 35");
        }else{
            System.out.println("Set-up");
            notetwo = noteTwo;
        }
    }
    public void setNoteThree(double noteThree){
        if (noteThree > 35){
            System.out.println("Please, enter the note in between 0 and 35");
        }else{
            System.out.println("Set-up");
            notethree = noteThree;
        }
    }

    public double seeNotes(){
        totalnotes = noteone + notetwo + notethree;
        return totalnotes;
    }

    public double missingNote(){
        return 60 - totalnotes;
    }
    public void seeApproval(){
        if (totalnotes >= 60){
            System.out.println("PASS");
        }
        else{
            double note_missing;
            note_missing = missingNote();
            System.out.printf("FAILED / %.2f missing points",
                    note_missing);
        }
    }

}
