package com.pingwit.homewrk3.task1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int amountDollars = 300;
        System.out.println("The amount of your money is " + amountDollars);
        System.out.println("Enter 1 to change to Pound");
        System.out.println("Enter 2 to change to EURO");
        System.out.println("Enter 3 to change to BUN");// добавь сюда абзац, чтобы визуально разделить код на логические блоки

        Scanner scanner = new Scanner(System.in);
        int currencyId = scanner.nextInt();
        switch (currencyId) {
            case 1 -> {
                double resultChanges = amountDollars * 6.3; // старайся избегать класс каста, очень опасная штука. float resultChanges -> double resultChanges
                System.out.println("Your amount is " + resultChanges + " zl");
            }
            case 2 -> {
                double resultChanges = amountDollars * 4.4; // старайся избегать класс каста, очень опасная штука. float resultChanges -> double resultChanges
                System.out.println("Your amount is " + resultChanges + " zl");
            }
            case 3 -> {
                double resultChanges = amountDollars * 0.8; // старайся избегать класс каста, очень опасная штука. float resultChanges -> double resultChanges
                System.out.println("Your amount is " + resultChanges + " zl");
            }
            default ->  // фигурные скобки в 27 и 29 строке можно убрать, т.к. только один оператор, но для if(){} необходимо использовать всегда
                System.out.println("Sorry, but our bank does not work with this currency.");
        }
    }
}
