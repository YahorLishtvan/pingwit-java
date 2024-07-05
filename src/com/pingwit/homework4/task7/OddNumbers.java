package com.pingwit.homework4.task7;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("I show sum odd numbers from 1 to 99!");
        int oddNumbersSumm = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                oddNumbersSumm += i;
            }
        }
        System.out.println(oddNumbersSumm);
    }
}