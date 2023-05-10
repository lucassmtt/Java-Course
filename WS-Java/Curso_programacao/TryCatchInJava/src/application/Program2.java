package application;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program2 {
    public static void main(String[] args){
        Scanner input = null;
        String PATH_FILE = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/TryCatchInJava/src/example.txt";
        File file = new File(PATH_FILE);
        try {
            input = new Scanner(file);
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            System.out.println("Closing...");
            if (input != null){
                input.close();
            }
        }
    }
}
