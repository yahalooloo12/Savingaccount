package org.example;
import java.util.Arrays;
public class Saver {
    private String FName;
    private String lName;
    private String id;
    private String address;
    private String Telephone;
    private SavingAccount[] accountttt;
    public Saver(String FName, String lName, String id, String address, String Telephone, SavingAccount[] accountttt) {
        this.FName = FName;
        this.lName = lName;
        this.id = id;
        this.address = address;
        this.Telephone = Telephone;
        this.accountttt = accountttt;
    }
    private double getWholeBalance() {
        double sum =0;
        for (SavingAccount account : accountttt) {
            sum += account.getBalance();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Saver{" +
                "FName='" + FName + '\'' +
                ", lName='" + lName + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", accountttt=" + Arrays.toString(accountttt) +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
    public void printBalances() {
        System.out.println("Balances of:  " + FName + " " + lName + ":");
        for (SavingAccount accounts : accountttt) {
            System.out.println(accounts.getBalance());
        }
    }
}