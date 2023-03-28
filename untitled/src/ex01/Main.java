package ex01;
import java.util.stream.StreamSupport;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String Product = "Computer";
        String Product2 = "Office Desk";

        int age = 24;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(
                "Products: %n %s, which price is $ %.2f %n %s, which price is %.2f %n " +
                "Record: %d years old, code %d and gender: %s %n " +
                "Measure with eight decimal places: %f %n Rouded (three decimal places): %.3f %n",
                Product, price1, Product2, price2, age, code, gender, measure, measure
        );
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }
}
