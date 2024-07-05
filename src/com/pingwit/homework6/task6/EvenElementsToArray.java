package com.pingwit.homework6.task6;

import java.util.Arrays;

public class EvenElementsToArray {
    public static void main(String[] args) {
        int j = 0;
        int[] myArray = {2, 3, 10, 286, 45};
        int[] evenMyArray = new int[myArray.length];
        for (int k : myArray) {
            if (k % 2 == 0) {
                evenMyArray[j] = k;
                j++;
            }
        }
        System.out.println(Arrays.toString(evenMyArray));
    }
}