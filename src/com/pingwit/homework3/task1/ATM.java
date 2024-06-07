package com.pingwit.homework3.task1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int amountDollars = 300;
        System.out.println("The amount of your money is " + amountDollars);
        System.out.println("Enter 1 to change to Pound");
        System.out.println("Enter 2 to change to EURO");
        System.out.println("Enter 3 to change to BUN");

        Scanner scanner = new Scanner(System.in);
        int currencyId = scanner.nextInt();
        switch (currencyId) {
            case 1 -> {
                double resultChanges = amountDollars * 6.3;
                System.out.println("Your amount is " + resultChanges + " zl");
            }
            case 2 -> {
                double resultChanges = amountDollars * 4.4;
                System.out.println("Your amount is " + resultChanges + " zl");
            }
            case 3 -> {
                double resultChanges = amountDollars * 0.8;
                System.out.println("Your amount is " + resultChanges + " zl");
            }
            default ->
                System.out.println("Sorry, but our bank does not work with this currency.");
        }
    }
}