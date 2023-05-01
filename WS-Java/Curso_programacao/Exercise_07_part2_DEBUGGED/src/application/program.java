package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Employee> list_of_employess = new ArrayList<>();

        System.out.print("Send the number of employees: ");
        int number_Of_employees = input.nextInt();

        for (int x = 0; x < number_Of_employees; x++){
            System.out.println();
            System.out.println("EMPLOYEE #" + (x + 1)+ ":");
            System.out.print("ID: ");
            Integer id = input.nextInt();
            String flag = "no-exists";

            for (int i = 0; i < list_of_employess.size(); i++){
                if (list_of_employess.get(i).getId() == id) {
                    flag = "exists";
                    break;
                }
            }
            if (flag.equals("exists")){
                x -= 1;
                System.out.println("This id already exists! ");
                continue;
            }

            System.out.print("NAME: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("SALARY: ");
            Double salary = input.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list_of_employess.add(employee);
        }
        System.out.print("Enter with the id of employee that will be increase in salary: ");
        int id_ = input.nextInt();

        //Too can use this form to filter the position id
        //Employee emp = list_of_employess.stream().filter(x -> x.getId() == id_).findFirst().orElse(null);

        Integer result = has_Or_search_id(list_of_employess, id_);

        if (result == null){
            System.out.println("The number id no exists! ");
        }
        else {
            System.out.print("Enter with the percentage of increase: ");
            double percentage_Of_increase = input.nextDouble();
            list_of_employess.get(result).increaseSalary(percentage_Of_increase);
            System.out.println("Ok");
        }

        for (int x = 0; x < list_of_employess.size(); x++){
            System.out.println(list_of_employess.get(x).toString());
        }
        input.close();
    }
    public static Integer has_Or_search_id(List<Employee> list, int id) {
        for (int x = 0; x < list.size(); x++){
            if (list.get(x).getId() == id){
                return x;
            }
        }
        return null;
    }
}
