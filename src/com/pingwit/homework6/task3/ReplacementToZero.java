package com.pingwit.homework6.task3;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacementToZero {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[4];
        for (i = 0; i < myArray.length; i++) {
            System.out.println("Please, enter " + (i + 1) + " number for array");
            myArray[i] = scanner.nextInt();
            if (myArray[i] == myArray.length) {
                System.out.println("Your array : "+Arrays.toString(myArray));
            }
        }
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                myArray[i] = 0;
            }
        }
        System.out.println("Replacement array : "+Arrays.toString(myArray));
    }
}