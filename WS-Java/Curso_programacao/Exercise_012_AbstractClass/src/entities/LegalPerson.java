package entities;

public class LegalPerson extends Person{
    public Integer numberOfEmployees;

    public LegalPerson(){}
    public LegalPerson(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

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
    public Double tax(){
        if ()
    }
}
