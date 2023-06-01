import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/text.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);;
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}