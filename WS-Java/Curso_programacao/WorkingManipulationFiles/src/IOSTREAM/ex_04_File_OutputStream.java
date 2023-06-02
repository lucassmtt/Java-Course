package IOSTREAM;

import java.io.FileOutputStream;


public class ex_04_File_OutputStream
{
    public static void main(String[] args)
    {
        String data = "Hello world using FileOutputStream...";
        String PATH_FILE = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/fileOutput.txt";

        try{
            FileOutputStream out = new FileOutputStream(PATH_FILE);

            byte[] array = data.getBytes();

            // Writes byte to the file
            out.write(array);

            out.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
