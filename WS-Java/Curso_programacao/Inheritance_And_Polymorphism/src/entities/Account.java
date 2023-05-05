package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){}

    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){
           if (amount < balance){
               balance -= amount;
           }
           else {
               System.out.println("The balance is below the required amount! ");
           }
    }

    public void deposit(Double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}