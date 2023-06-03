package IOSTREAM;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ex_09_Exercise
{
    public static void main(String[] args)
    {
        String PATH = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/IOSTREAM/sourceFile.csv";
        String NEW_FILE_PATH = "/home/caslu/Documents/Java-Course/WS-Java/Curso_programacao/WorkingManipulationFiles/src/IOSTREAM/sourceFile_with_total.csv";
        ArrayList<String> list_product = new ArrayList<>();
        ArrayList<String> new_list_product = new ArrayList<>();

        try{
            FileReader file = new FileReader(PATH);

            // read csv file
            BufferedReader br = new BufferedReader(file);

            String line = br.readLine();
            while (line != null)
            {

                // Change data to Array
                list_product.addAll(List.of(line.split(",")));

                // Get info of products
                String name_product = list_product.get(0).strip();
                double price = Double.parseDouble(list_product.get(1).strip());
                int amount = Integer.parseInt(list_product.get(2).strip());
                String total = String.valueOf(amount * price);

                // add new list with total

                new_list_product.add(List.of(name_product, total).toString());

                // jump to line and clear list
                line = br.readLine();
                list_product.clear();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(NEW_FILE_PATH))){
            for (String item : new_list_product) {
                bufferedWriter.write(item.replace("[", "").replace("]", ""));
                bufferedWriter.write("\n");
                System.out.println(item);
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
