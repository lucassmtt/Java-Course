package entities;

public class OutsourcedEmployee extends Employee{
    public Double additionalCharge;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return (hours * valuePerHour) + additionalCharge / 100 * 110;
    }


    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public String toString() {
        return "OutsourcedEmployee{" +
                "additionalCharge=" + additionalCharge +
                '}';
    }
}
