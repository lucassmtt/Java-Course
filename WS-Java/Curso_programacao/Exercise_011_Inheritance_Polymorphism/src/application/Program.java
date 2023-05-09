package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;
import entities.OutsourcedEmployee;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scan.nextInt();
        List<Employee> employeeList = new ArrayList<>();

        for (int x = 1; x < numberOfEmployees+1; x++) {
            System.out.println("Employee #" + x + " data: ");
            System.out.print("Outsorced (Y/N): ");
            String isOutSorced = scan.next().toUpperCase().substring(0, 1);
            while (!(isOutSorced.equals("Y") || isOutSorced.equals("N"))){
                System.out.println("Please, send the correct value! (YES OR NO)");
                isOutSorced = scan.next().toUpperCase().substring(0, 1);
            }

            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Hours: ");
            Integer hours = scan.nextInt();
            System.out.print("Value per hours: ");
            Double valuePerHours = scan.nextDouble();

            if (isOutSorced.equals("Y")) {
                System.out.print("Additional charge: ");
                Double additionalCharge = scan.nextDouble();
                Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                employeeList.add(outsourcedEmployee);
            }
            else {
                Employee normalEmployee = new Employee(name, hours, valuePerHours);
                employeeList.add(normalEmployee);
            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee employee : employeeList){
            System.out.print(employee.getName() + " - " + employee.payment() + "\n");
        }
        scan.close();
    }
}
