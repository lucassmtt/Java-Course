package core;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double calcconverter(double price_dolar, double amount_dolar) {
        double amount_reais;

        price_dolar += (price_dolar / 100) * IOF;
        amount_reais = price_dolar * amount_dolar;

        return amount_reais;
    }
}
