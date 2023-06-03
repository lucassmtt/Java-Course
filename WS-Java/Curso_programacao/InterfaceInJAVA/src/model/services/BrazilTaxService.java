package model.services;

public class BrazilTaxService
{
    public Double tax(double amount){
        if (amount <= 100.0){
            return amount * 20 / 100;
        }
        else {
            return amount * 15 / 100;
        }
    }
}
