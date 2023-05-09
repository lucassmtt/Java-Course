package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;;

public class UsedProduct extends Product{
    public LocalDate manuFacture;

    public UsedProduct(String name, Double price, LocalDate manuFacture){
        super(name, price);
        this.manuFacture = manuFacture;
    }

    @Override
    public String priceTag(){
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return name + " (used) " + "$ " + price + " (Manufacture date: " + manuFacture.format(myformat) + ")";
    }

    public LocalDate getManuFacture() {
        return manuFacture;
    }

    public void setManuFacture(LocalDate manuFacture) {
        this.manuFacture = manuFacture;
    }
}
