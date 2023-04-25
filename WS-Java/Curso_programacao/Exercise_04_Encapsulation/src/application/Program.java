package application;

import java.util.Scanner;
import java.util.Locale;
import entities.bankAccount;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = mySc.nextInt();

        System.out.print("Enter account holder: ");
        String accountName = mySc.next();
        mySc.nextLine();
        System.out.print("You want make a first deposit (Y/N)? ");
        String response = mySc.next().toUpperCase();

        bankAccount user_01 = new bankAccount();

        if (response.equals("Y"))
        {
            System.out.print("Enter initial deposit value: ");
            double amount = mySc.nextDouble();
            user_01 = new bankAccount(accountNumber, accountName, amount);

            System.out.println("Account data:");
            System.out.println(user_01.toString());
        }
        if (response.equals("N"))
        {
            user_01 = new bankAccount(accountNumber, accountName);
            System.out.println("Account data:");
            System.out.print(user_01.toString());
        }

        System.out.print("Enter a deposit value: ");
        double amount = mySc.nextDouble();
        user_01.addValue(amount);
        System.out.println("Update balance: " + user_01.getBalance());

        System.out.print("Enter a withdraw value: ");
        double withdraw = mySc.nextDouble();
        user_01.removeValue(withdraw);
        System.out.println("Update balance: " + user_01.getBalance());
    }
}
