package se.lexicon.Charles;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App {

    static VendingMachineImplement myVending = new VendingMachineImplement();

    public static void main(String[] args) {

        Integer[] myDeposit = new Integer[] { 1, 2, 5, 10, 20, 50, 100, 500,1000 };


        System.out.println("Input: Select the Cash deposit ");
        System.out.println("*******************************");
        for (int i = 1; i < myDeposit.length; i++) {
            System.out.println(i + ".  " + myDeposit[i] + " Kr");
        }
        System.out.println("*******************************");
        System.out.println("Enter amount in Swedish Kr:");

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                myVending.addCurrency(1);
                handleTransactions();
                break;
            case 2:
                myVending.addCurrency(2);
                handleTransactions();
                break;
            case 3:
                myVending.addCurrency(5);
                handleTransactions();
                break;
            case 4:
                myVending.addCurrency(10);
                handleTransactions();
                break;
            case 5:
                myVending.addCurrency(20);
                handleTransactions();
                break;
            case 6:
                break;
            case 7:
                myVending.addCurrency(50);
                handleTransactions();
                break;
            case 8:
                myVending.addCurrency(100);
                handleTransactions();
                break;
            case 9:
                myVending.addCurrency(500);
                handleTransactions();
                break;
            case 10:
                myVending.addCurrency(1000);
                handleTransactions();
                break;
            default:
                System.out.println("Non existing option");
        }
    }

    public static void handleTransactions() {
        System.out.println("Our currency is: "+myVending.getBalance());
    }
}
