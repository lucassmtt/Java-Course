package Application;

import service.PrintService;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PrintService<Integer> int_printservice = new PrintService<>();
        PrintService<String> string_printservice = new PrintService<>();

        // now, if we try to add one value that may or may not be of one specific type
        // the compiler will say that not found

        // e.g
        // string_printservice.addValue(1);
        // int_printservice.addValue("Joao");

        string_printservice.addValue("Maria");

        System.out.print("How many values: ");
        int values = scanner.nextInt();

        for (int x = 0; x < values; x++){
            Integer number = scanner.nextInt();
            int_printservice.addValue(number);
        }

        scanner.nextInt();
    }
}
