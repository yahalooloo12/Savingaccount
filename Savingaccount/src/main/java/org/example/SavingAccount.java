package org.example;

public class SavingAccount {
    private static double YourInterestRate;
    private double SavingBalance;
    //


    public SavingAccount( double balance){
            this.SavingBalance = balance;
        }

            public void YOURMonthlyInterest () {
                double monthlyInterest = (YourInterestRate / 12) * SavingBalance;
                SavingBalance += monthlyInterest;
            }


                public static void ChangeInterestRate ( double newRate){
                    YourInterestRate = newRate;
                }


                public double getBalance () {
                    return SavingBalance;
                }



                    }





