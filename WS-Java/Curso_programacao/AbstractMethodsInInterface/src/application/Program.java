package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.UsaInterestService;
import services.InterestService;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService inst = new BrazilInterestService(2.0);
        InterestService inst_usa = new UsaInterestService(1.0);
        double payment = inst.payment(amount, months);
        double payment_usa = inst_usa.payment(amount, months);

        System.out.println(payment);
        System.out.println(payment_usa);

    }
}
