import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        File file = new File("/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/text.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e);;
//        }
//        finally {
//            if (sc != null){
//                sc.close();
//            }

        String path = ("/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/text.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
        finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (fileReader != null){
                    fileReader.close();
                }
            }
            catch (IOException e){
                System.out.println("Error: " + e);
            }
        }
    }
}