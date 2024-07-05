package com.pingwit.homework4.task2;

public class AmoebaDivision {
    public static void main(String[] args) {
        int division = 1;
        int counterDay = 24;
        for (int i = 0; i <= counterDay; i += 3) {
            division = division * 2;
        }
        System.out.println("In 24 hours the amoebas multiplied to " + division + " ameoba(s).");
    }
}