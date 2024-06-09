package com.pingwit.homework4.task1;

public class RunningExercises {
    public static void main(String[] args) {
        double defoultDestance = 10; // опечатка в слове distance -> i
        double totalDistance = 0;
        int counter = 0;
        do {
            totalDistance += defoultDestance;
            defoultDestance = defoultDestance * 1.1;
            counter++;
        }
        while (counter < 7); // когда где-то встречается в коде просто число, то непонятно что оно обозначает, это называется "магическое число", создай переменную для этого числа
        { // фигурные скобки здесь не нужны, достаточно будет абзаца
            System.out.println(totalDistance);
        }
    }
}