package com.pingwit.homework4.task8;

public class OddAndEvenNumbers {
    public static void main(String[] args) {

        int evenNumbersSumm = 0;
        int oddNumbersSumm = 0;
        System.out.println("Hello !\n" +
                "Well, I will calculate the sum of even numbers, " +
                "the sum of odd numbers and the total sum of all numbers from 0 to 100.");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenNumbersSumm += i;
            }
            if (i % 2 != 0) {
                oddNumbersSumm += i;
            }
        }
       int totalNumbersSumm = evenNumbersSumm + oddNumbersSumm;
        System.out.println("It is the sum even numbers : " + evenNumbersSumm);
        System.out.println("It is the sum odd numbers : " + oddNumbersSumm);
        System.out.println("It is the total numbers sum : " + totalNumbersSumm);
    }
}