package com.pingwit.homework4.task3;

public class GeometricProgression {
    public static void main(String[] args) {
        int i = 0;
        int tempNumber = 1;
        for (i = 1; i <= 256; i *= 2) {
            tempNumber += i;
            if (i == 256) {
                System.out.println("Our total is : "+tempNumber);
            }
        }
    }
}