package application;

import java.util.Locale;
import java.util.Scanner;
import core.CurrencyConverter;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dollar_price= mySc.nextDouble();

        System.out.print("Send the amount of dollars you want: ");
        double amount_dolar = mySc.nextDouble();

        double amount_in_reais = CurrencyConverter.calcconverter(dollar_price, amount_dolar);
        System.out.printf("Amount to be paid in reais: %.2f", amount_in_reais);
    }
}
