package entities;

public class ImportedProduct extends Product{
    public Double customFee;

    ImportedProduct(){}
    public ImportedProduct(String name, Double price, Double customFee){
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag(){
        return name + " $ " + totalPrice() + " (Customs fee: $ " + customFee + ")";
    }

    public Double totalPrice(){
        return customFee + price;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
