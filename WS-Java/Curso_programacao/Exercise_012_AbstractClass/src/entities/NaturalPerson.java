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
    public Double tax(){
        if (anualIncome > 20000.00){
                
        }

    }
}
