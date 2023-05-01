import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
public class Exercise_02 {
    public static double increase(double value_salary, int percent_increase){
        value_salary = value_salary * 100 / percent_increase;
        return value_salary;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Send the number of employess: ");
        int number_Of_employee = input.nextInt();

        List<Integer> list_id = new ArrayList<Integer>();
        List<String> list_name = new ArrayList<String>();
        List<Double> list_salary = new ArrayList<Double>();

        for (int i = 0; i < number_Of_employee; i++){
            System.out.print("Send the id: ");
            int id = input.nextInt();

            if (list_id.contains(id)){
                System.out.println("Please, dont send the same id! ");
                i -= 1;
            }
            else {
                System.out.print("Send the name: ");
                String name = input.next();

                System.out.print("Send the salary of employee " + name + ": ");
                double salary = input.nextDouble();

                list_id.add(id);
                list_name.add(name);
                list_salary.add(salary);
            }
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int value_id_to_increase = input.nextInt();

        System.out.print("Enter the percentage: ");
        int percent_of_increase = input.nextInt();

        if (list_id.contains(value_id_to_increase)){
            for (int y = 0; y < number_Of_employee; y++){

                int id = (list_id.get(y));
                if (id == value_id_to_increase){
                    double salary = list_salary.get(y);
                    double new_salary = increase(salary, percent_of_increase);
                    list_salary.remove(salary);
                    list_salary.add(y, new_salary);
                }

            }
        }
        else {
            System.out.print("The value that was sent, no contain in the list of employees!");
        }

        System.out.println("List of employees: ");
        System.out.println("ID    NAME   SALARY");

        for (int x = 0; x < number_Of_employee; x++){
            System.out.print(list_id.get(x) + "    ");
            System.out.print(list_name.get(x) + "   ");
            System.out.print(list_salary.get(x) + "  \n");
        }
    }
}