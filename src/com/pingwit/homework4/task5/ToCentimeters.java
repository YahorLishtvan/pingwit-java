package com.pingwit.homework4.task5;

public class ToCentimeters {
    public static void main(String[] args) {
        double santimeter = 0;
        final double inch = 2.54;
        System.out.println("This is a program for converting inches to centimeters from 1 to 20.");
        for (int i = 1; i <= 20; i++) {
            santimeter = i * inch;
            System.out.println(i + " inch(es) is " + santimeter + " centimeter(s)");
        }
    }
}