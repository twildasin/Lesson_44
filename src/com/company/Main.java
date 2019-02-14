package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(2);
        fmt.setMaximumFractionDigits(2);
        String name;
        ArrayList aryLst = new ArrayList();
        ArrayList <bankAccount> myArray = new ArrayList();
        ListIterator iter = aryLst.listIterator();
        do {
            Scanner kbReader = new Scanner(System.in);
            System.out
                    .print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
            name = kbReader.nextLine();
            if (!name.equalsIgnoreCase("EXIT")) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); // gives an eye pleasing blank line
                // between accounts
                bankAccount theAccount = new bankAccount(name, amount);
                iter.add(theAccount);
                myArray.add(theAccount);
            }
        } while (!name.equalsIgnoreCase("EXIT"));

        // Search aryLst and print out the name and amount of the largest bank
        // account
        bankAccount ba = (bankAccount) iter.previous();
        double maxBalance = ba.balance; // set last account as the winner so far
        String maxName = ba.name;
        while (iter.hasPrevious()) {
            ba = (bankAccount) iter.previous();
            if (ba.balance > maxBalance) {
                // We have a new winner, chicken dinner
                maxBalance = ba.balance;
                maxName = ba.name;
            }
        }
        System.out.println(" ");
        System.out.println("The account with the largest balance belongs to "
                + maxName + ".");
        System.out.println("The amount is $" + fmt.format(maxBalance) + ".");



        //Open this region, uncomment it, and comment out the "Using Comparable" region above to run using comparator object to compare the accounts.

        //region Using Comparator

        ///*

        bankAccount [] myList =  new bankAccount[myArray.size()];
        myList = myArray.toArray(myList);
        Comparator comp = new BA_comparator();
        Arrays.sort(myList, comp);
        for(bankAccount b : myList)
        {
            System.out.println("\n" + b.name + " >>> " + b.balance);
        }

        //*/

        //endregion





        //Open this region, uncomment it, and comment out the "Using Comparator" region above to run using comparable.

        //region Using Comparable
        /*
        Collections.sort(myArray);

        for(bankAccount b : myArray)
        {
            System.out.println("\n" + b.name + " >>> " + b.balance);
        }
        */
        //endregion




    }
}
