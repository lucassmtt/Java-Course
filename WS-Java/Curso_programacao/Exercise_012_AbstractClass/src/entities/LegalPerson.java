package entities;

public class LegalPerson extends Person{
    Integer numberOfEmployees;

    public LegalPerson(){}

    public LegalPerson(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double tax_ = 0.0;
        if (numberOfEmployees > 10){

            tax_ = anualIncome * 14 / 100;
            return tax_;
        }
        else {
             tax_ = anualIncome * 16 / 100;
             return tax_;
        }
    }
}
