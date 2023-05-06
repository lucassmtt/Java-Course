package entities;

public final class SavingAccount extends Account {
    Double intrestRate;

    SavingAccount(){
        super();
    }
    public SavingAccount(Integer number, String holder, Double balance, Double intrestRate){
        super(number, holder, balance);
        this.intrestRate = intrestRate;
    }

    public Double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(Double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public void updateBalance(){
        balance += balance * intrestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "intrestRate=" + intrestRate +
                '}';
    }

    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
}
