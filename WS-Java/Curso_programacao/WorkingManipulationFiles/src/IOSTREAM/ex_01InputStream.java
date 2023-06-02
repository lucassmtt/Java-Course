package IOSTREAM;

import java.io.FileInputStream;

class ex_01InputStream {
    public static void main(String args[]) {
        byte[] array = new byte[100];

        try{
            java.io.InputStream input = new FileInputStream("/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/input.txt");

            System.out.println("Avaible of the " + input.available());

            // Read byte from input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into String
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}