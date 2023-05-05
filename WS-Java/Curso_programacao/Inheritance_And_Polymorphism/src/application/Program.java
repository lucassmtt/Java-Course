package application;

import entities.Account;
import entities.BussinesAcount;
import entities.SavingAccount;

public class Program {
    public static void main(String[] args){

        Account acc = new Account(1000, "Lucas", 0.0);
        BussinesAcount bacc = new BussinesAcount(1001, "Banco do Brasil", 0.0, 500.0);

        //Upcasting

        Account acc1 = bacc;
        Account acc2 = new BussinesAcount(1001, "Banco do Brasil", 0.0, 500.0);
        Account acc3 = new SavingAccount(1001, "Banco do Brasil", 0.0, 500.0);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        //Downcasting

        BussinesAcount bacc2 = (BussinesAcount)acc2;
        System.out.println(bacc2);

        if (acc3 instanceof BussinesAcount){
            System.out.println("OK");
        }
        else{
            System.out.println("No");
        }
    }

}
