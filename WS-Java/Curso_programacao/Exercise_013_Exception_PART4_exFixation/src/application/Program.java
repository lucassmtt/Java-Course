package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter account data: ");
            System.out.print("Holder: ");
            String holder = input.next();
            System.out.print("Number: ");
            int number = input.nextInt();
            System.out.print("Initial balance: ");
            double initial_balance = input.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdraw_limit = input.nextDouble();
            Account account = new Account(number, holder, initial_balance, withdraw_limit);

            System.out.println("Enter amount for withdraw");
            double withdraw_value = input.nextDouble();
            account.withdraw(withdraw_value);
            input.close();
        }
        catch (DomainException e){
            System.out.println("Error in withdraw: " + e);
        }

        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
