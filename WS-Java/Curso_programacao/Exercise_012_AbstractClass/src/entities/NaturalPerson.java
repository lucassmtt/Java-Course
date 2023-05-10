package entities;

public class NaturalPerson extends Person{

    Double healthExpenditures;

    public NaturalPerson(){}

    public NaturalPerson(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double tax_;
        if (anualIncome > 20000.0){
            tax_ = anualIncome * 25 / 100;
        }
        else {
            tax_ = anualIncome * 15 / 100;
        }
        if (healthExpenditures > 0){
            tax_ -= healthExpenditures * 50 / 100;
        }
        return tax_;
    }
}
