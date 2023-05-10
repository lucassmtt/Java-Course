package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOftaxPayers = input.nextInt();

        for (int x = 1; x < numberOftaxPayers+1; x++){
            System.out.println("Payer #" + x + " :");
            System.out.print("Individual or Company (I/C): ");
            String resp = input.next().toUpperCase().substring(0, 1);
            while (!(resp.equals("C") || resp.equals("I"))){
                System.out.println("Please, send the correct value!!");
                resp = input.next().toUpperCase().substring(0, 1);
            }
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Anual income: ");
            double anual_income = input.nextDouble();
            if (resp.equals("I")){
                System.out.print("Health expenditures: ");
                double health_expenditures = input.nextDouble();
                Person naturalPerson = new NaturalPerson(name, anual_income, health_expenditures);
                personList.add(naturalPerson);
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfemployees = input.nextInt();
                Person legalPerson = new LegalPerson(name, anual_income, numberOfemployees);
                personList.add(legalPerson);
            }
        }
        System.out.println("TAXES PAID: ");
        for (Person person : personList){
            System.out.println(person.name + " $ " + person.tax());
        }
        input.close();
    }
}