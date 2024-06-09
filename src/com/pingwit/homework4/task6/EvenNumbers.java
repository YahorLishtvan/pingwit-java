package com.pingwit.homework4.task6;
//+
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("I show even numbers from 2 to 100!");
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
