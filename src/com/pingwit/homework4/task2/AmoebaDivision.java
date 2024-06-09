package com.pingwit.homework4.task2;

public class AmoebaDivision {
    public static void main(String[] args) {
        int division = 1;
        for (int i = 0; i <= 24; i += 3) { // 24 - это магическое число, давай вынесем в переменную
            division = division * 2;
            if (i == 24) { // System.out.println лучше вынести за пределы цикла и удалить if
                System.out.println("In 24 hours the amoebas multiplied to " + division + " pieces.");
            }
        }
    }
}