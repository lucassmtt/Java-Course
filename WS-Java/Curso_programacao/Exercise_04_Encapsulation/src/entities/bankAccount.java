package entities;

public class bankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    private double value_initial;

    public bankAccount() {}

    public bankAccount(int accountNumber, String name)
    {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public bankAccount(int accountNumber, String name, double value_initial_deposit)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance += value_initial_deposit;
    }

    public void addValue(double value){
        this.balance += value;
    }

    public void removeValue(double value){
        this.balance -= value;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber +
                ", name: " + name +
                ", balance: " + balance;
    }
}
