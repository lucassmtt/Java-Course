package ex07_Functions_for_string;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args){

        String myString = "Lucas Gabriel Motta de Freitas";

        String myStringLower = myString.toLowerCase();
        String myStringUpper = myString.toUpperCase();
        String myStringWithoutSpace = myString.trim();
        String myStringCutInSecondChar = myString.substring(2);
        String myStringCutStartStop = myString.substring(0, 5);
        String myStringWithReplace = myString.replace("a", "y");
        int myIndexOfText = myString.indexOf("Motta");


        System.out.printf("This is my string in lower case: %s \n", myStringLower);
        System.out.printf("This is my string in upper case: %s \n", myStringUpper);
        System.out.printf("This is my string without espace: %s \n", myStringWithoutSpace);
        System.out.printf("This is my string with cut in second char: %s \n", myStringCutInSecondChar);
        System.out.printf("This is my string with cut started in first char and stop in fifth char : %s \n",
                myStringCutStartStop);
        System.out.printf("This is my string with replace of a for y: %s \n", myStringWithReplace);
        System.out.printf("The string 'Motta', pops up in %s position \n", myIndexOfText);

        String fruitsString = "Apple Lemon Watermelon orange";
        String[] fruitsVector = fruitsString.split(" ");

        String fruit_1 = fruitsVector[0];
        String fruit_2 = fruitsVector[1];
        String fruit_3 = fruitsVector[2];

        System.out.printf("Fruit 1: %s \n Fruit 2: %s \n Fruit 3: %s \n", fruit_1, fruit_2, fruit_3);

    }
}
