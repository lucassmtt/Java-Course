package application;

import java.util.ArrayList;
import java.util.List;
import entities.Account;
import entities.BussinesAcount;
import entities.SavingAccount;

import javax.accessibility.AccessibleComponent;

public class Program {
    public static void main(String[] args){
//        Account accountN1000 = new SavingAccount(1000, "Lucas", -1000.0, 10.0);
//        Account accountN1001 = new BussinesAcount(1000, "Lucas", -1000.0, 10.0);
        List<Account> accountList = new ArrayList<>();

        double y = 0.0;
        double amount = 10;
        for (int x = 0; x < 100000; x++){
            Account account = new BussinesAcount(x, "a", amount, y);
            y+= 1.0;
            accountList.add(account);
        }

        for (Account acc : accountList){
            System.out.println(acc.toString() + acc.getBalance());
            acc.deposit(780.0);
        }

        double sum = 0.0;
        for (Account acc : accountList){
            System.out.println(acc.getNumber() + acc.getBalance());
            sum += acc.getBalance();
        }
        System.out.println(sum);
    }
}