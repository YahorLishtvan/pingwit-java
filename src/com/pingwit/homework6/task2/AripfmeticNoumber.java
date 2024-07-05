package com.pingwit.homework6.task2;

import java.util.Scanner;

public class AripfmeticNoumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] myArray = new int[4];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please, enter " + (i + 1) + " number for array");
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }
       int avreage = sum / myArray.length;

        System.out.println("Your arithmetic mean " + avreage);
    }
}