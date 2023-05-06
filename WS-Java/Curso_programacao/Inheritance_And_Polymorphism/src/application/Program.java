package application;

import entities.Account;
import entities.BussinesAcount;
import entities.SavingAccount;

public class Program {
    public static void main(String[] args){

//        Account acc = new Account(1000, "Lucas", 0.0) {
//            @Override
//            public void withdraw(double amount) {
//
//            }
//        };
//        BussinesAcount bacc = new BussinesAcount(1001, "Banco do Brasil", 0.0, 500.0);
//
//        //Upcasting
//
//        Account acc1 = bacc;
//        Account acc2 = new BussinesAcount(1001, "Banco do Brasil", 0.0, 500.0);
//        Account acc3 = new SavingAccount(1001, "Banco do Brasil", 0.0, 500.0);
//
//        System.out.println(acc1);
//        System.out.println(acc2);
//        System.out.println(acc3);
//
//        //Downcasting
//
//        BussinesAcount bacc2 = (BussinesAcount)acc2;
//        System.out.println(bacc2);
//
//        if (acc3 instanceof BussinesAcount){
//            System.out.println("OK");
//        }
//        else{
//            System.out.println("No");
//        }
        Account account = new Account(199, "alex", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account2 = new SavingAccount(10002, "Jose", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        Account account3 = new BussinesAcount(10003, "Maria", 1000.0, 500.0);
        account3.withdraw(200);
        System.out.println(account3.getBalance());
    }

}
