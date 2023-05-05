package entities;

public class BussinesAcount extends Account{

    Double loanLimit;

    public BussinesAcount(){
        super();
    }
    public BussinesAcount(Integer number, String holder, Double balance, Double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit){
            balance += amount - 10;
        }
    }

    @Override
    public String toString() {
        return "BussinesAcount{" +
                "loanLimit=" + loanLimit +
                '}';
    }
}
