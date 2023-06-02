package IOSTREAM;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ex_06_ObjectOut {

    public static void main(String[] args){
        String PATH_FILE = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/IOSTREAM/text.txt";

        try{
            FileInputStream file = new FileInputStream(PATH_FILE);

            // Creates ObjectInpur from file
            ObjectInputStream objectInput = new ObjectInputStream(file);

            // Read the objects
            Dog newDog = (Dog) objectInput.readObject();

            System.out.println("Dog name: " + newDog.getName());
            System.out.println("Dog Breed: " + newDog.getBreed());

            objectInput.close();
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

}
