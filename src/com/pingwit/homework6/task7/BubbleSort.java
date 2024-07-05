package com.pingwit.homework6.task7;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = {1, -3, 8, 999, 42, 78};

        for (int i = 1; i < myArray.length; i++) {
            for (int j = 1; j < myArray.length; j++) {
                int current = myArray[j];
                int previous = myArray[j - 1];

                if (previous > current) {
                    myArray[j] = previous;
                    myArray[j - 1] = current;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
