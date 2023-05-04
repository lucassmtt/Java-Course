package application;

import entities.Department;
import entities.HourContract;
import entities.enums.WorkerLevel;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.logging.Level;
import entities.Worker;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter department name: ");
        Department department = new Department(input.next());
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = input.next();
        WorkerLevel level;
        while (true){
            System.out.print("Level (JUNIOR/MID_LEVEL/SENIOR):  ");
            String new_level = input.next();

            if (new_level.equals("JUNIOR") || new_level.equals("MID_LEVEL") || new_level.equals("SENIOR")){
                level = WorkerLevel.valueOf(new_level);
                break;
            }
            System.out.println("Please send the correct value to the level...");
        }
        System.out.print("Base Salary: ");
        double base_salary = input.nextDouble();

        Worker worker_01 = new Worker(name, level, base_salary, department);
        System.out.print("How many contracts to this worker: ");
        int number_of_contracts = input.nextInt();
        List<HourContract> contracts = new ArrayList<>();

        for (int x = 0; x < number_of_contracts; x++){
            System.out.println("Enter contract #" + x + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String date_without_format = input.next();

            DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate formattedDate = LocalDate.parse(date_without_format, myformat);
            Date date = Timestamp.valueOf(formattedDate.atStartOfDay());

            System.out.print("Value per hour: ");
            Double value_perHour = input.nextDouble();

            System.out.print("Duration (Hours): ");
            int duration_of_contract = input.nextInt();

            HourContract contract = new HourContract(date, value_perHour, duration_of_contract);
            worker_01.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String date = input.next();
        int month = Integer.parseInt(date.substring(0,2));
        int year = Integer.parseInt(date.substring(3, 7));

        double sum_income = worker_01.income(year, month);

        System.out.println("Name " + worker_01.getName());
        System.out.println(worker_01.getDepartment());
        System.out.println("Income for " + date + ": " + sum_income);

        input.close();
    }
}
