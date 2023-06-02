package model.entities;

import model.exceptions.DomainException;

public class Account {
    public Integer number;
    public String holder;
    public Double balance;
    public Double withdrawLimit;

    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) throws DomainException {
        if (amount < 0){
            throw new DomainException("Deposit amount is less than zero");
        }
        else {
            balance += amount;
        }
    }
    public void withdraw(Double amount) throws DomainException{
        if (amount > withdrawLimit){
            throw new DomainException("The value is over the withdraw limit...");
        }
    }
}
