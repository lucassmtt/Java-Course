package IOSTREAM;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ex_02_OutputStream {
    public static void main(String[] args)
    {
        String data = "Hello world of output...";
        String PATH_FILE = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/output.txt";
        try{
            OutputStream out = new FileOutputStream(PATH_FILE);

            // Converts the string into bytes
            byte[] dataInBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataInBytes);
            System.out.println("Data is written to the file...");

            // Closes the output stream
        }

        catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}
