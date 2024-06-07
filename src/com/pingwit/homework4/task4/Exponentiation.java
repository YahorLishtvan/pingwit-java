package com.pingwit.homework4.task4;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println("Hello ! This mega complex program does multiplication\n " +
                "without the multiplication operation.\n" +
                "Start it at your own risk!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first multiplier");
        int firstMultiplier = scanner.nextInt();
        System.out.println("Please, enter your last multiplier. ");
        int secondMultiplier= scanner.nextInt();
        System.out.println("And you're dead!");
        int result = 0;
        for (int i = 0; i < secondMultiplier; i++) {
            result+=firstMultiplier;
        }
        System.out.println("Our total is : " + result);
    }
}