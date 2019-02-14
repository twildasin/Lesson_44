package com.company;

/**
 * Created by dpennebacker on 2/13/17.
 */
public class bankAccount implements Comparable {

    public bankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }

    public int compareTo(Object otherObject)
    {
        //Sorts by balance

        //region Balance

        ///*

        bankAccount otherAccount = (bankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance) {
            retValue = -1;
        } else {
            if (balance > otherAccount.balance) {
                retValue = 1;
            } else {
                retValue = 0;
            }
        }
        return retValue;

        //*/

        //endregion





        //Alphabetically Sorts

        //region Alphabetically

        /*

        bankAccount otherAccount = (bankAccount) otherObject;
        int retValue;
        if (name.charAt(0) < otherAccount.name.charAt(0)) {
            retValue = -1;
        } else {
            if (name.charAt(0) > otherAccount.name.charAt(0)) {
                retValue = 1;
            } else {
                retValue = 0;
            }
        }
        return retValue;

        */

        //endregion






    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;

}
