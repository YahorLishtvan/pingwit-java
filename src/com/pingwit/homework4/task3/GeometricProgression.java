package com.pingwit.homework4.task3;

public class GeometricProgression {
    public static void main(String[] args) {
        int tempNumber = 1;
        for (int i = 1; i <= 256; i *= 2) {
            tempNumber += i;
        }
        System.out.println("Our total is : " + tempNumber);
    }
}