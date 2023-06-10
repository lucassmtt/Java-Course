package application;

import service.ContLogService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String PATH_FILE = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_FILE)))
        {
            Set<ContLogService> set = new HashSet<>();
            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));

                ContLogService logService = new ContLogService(username, date);
                set.add(logService);
                line = bufferedReader.readLine();
            }

            System.out.println("Total users: " + set.size());
        }
        catch (IOException e){
            System.out.println("Error : " + e);
        }

    }
}
