package IOSTREAM;

import java.io.PrintStream;

public class ex_08_PrintStream {
    public static void main(String[] args){

        try {
            PrintStream output = new PrintStream("/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/IOSTREAM/text.txt");

            int age = 19;

            output.printf("I am %d years old.", age);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

    }
}
