package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner mySc = new Scanner(System.in);
        Employee myEmployee = new Employee();

        System.out.println("Employer's name: ");
        myEmployee.name = mySc.next();

        System.out.println("Employee's gross salary: ");
        myEmployee.grossSalary = mySc.nextDouble();

        System.out.println("Employee tax: ");
        myEmployee.tax = mySc.nextDouble();

        System.out.print(myEmployee.toString() + "\n");

        System.out.println("Which percentage to increase salary?");
        double percentage = mySc.nextDouble();
        myEmployee.increaseSalary(percentage);

        System.out.println("Update to salary: ");
        System.out.print(myEmployee.toString());

        mySc.close();
    }
}
