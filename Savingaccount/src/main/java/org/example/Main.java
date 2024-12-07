package org.example;
public class Main {
    public  static void PrintBalance(SavingAccount saver, SavingAccount saver2)
    {
        System.out.println("Your Current Balances:");
        System.out.println("Saver1: " + saver.getBalance());
        System.out.println("Saver2: " + saver2.getBalance());
    }
    public static void main(String[] args) {
        System.out.print(" Welcome!");
        SavingAccount account = new SavingAccount(5000);
        SavingAccount account2 = new SavingAccount(6000);
        PrintBalance(account, account2);
        SavingAccount.ChangeInterestRate(0.06);
        account.YOURMonthlyInterest();
        account2.YOURMonthlyInterest();
        PrintBalance(account, account2);
        SavingAccount.ChangeInterestRate(0.1);
        account.YOURMonthlyInterest();
        account2.YOURMonthlyInterest();
        PrintBalance(account, account2);
        Saver saver = new Saver("yahali","liberman","5467","beit-arye","050644822",new SavingAccount[]{ account,account2 });
        saver.print();
        Banker banker= new Banker("jonathan","genish","5647","rehovot","055949884",new Saver[]{ saver});
        banker.print();

        banker.printingClients();
        saver.printBalances();
    }
}