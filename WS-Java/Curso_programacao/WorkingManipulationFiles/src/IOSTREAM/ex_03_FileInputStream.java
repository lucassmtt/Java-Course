package IOSTREAM;

import java.io.DataInput;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class ex_03_FileInputStream {
    public static void main(String[] args){

        String PATH_FILE = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/text.txt";
        String dataInFile = null;
        try{
            // Create the input stream with the file path...
            FileInputStream input = new FileInputStream(PATH_FILE);

            // Skip 25 bytes with skip() method
            input.skip(25);

            // Reads the first byte
            int _byte = input.read();
            while (_byte != -1){
                System.out.print((char) _byte);

                // Reads next byte from the file and if not exists, terminate
                _byte = input.read();
            }

            // Close connection with close() method
            input.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
