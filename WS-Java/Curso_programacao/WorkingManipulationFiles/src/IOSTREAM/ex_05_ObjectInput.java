package IOSTREAM;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ex_05_ObjectInput {
    public static void main(String[] args){

        // Creates an object of Dog class
        Dog myDog = new Dog("Tofu", "Vira-lata");

        String PATH_FILE = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/IOSTREAM/text.txt";
        try{
            FileOutputStream file = new FileOutputStream(PATH_FILE);

            // Creates an ObjectOutputStream
            ObjectOutputStream objectOutput = new ObjectOutputStream(file);

            // Writes object to the output stream
            objectOutput.writeObject(myDog);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
