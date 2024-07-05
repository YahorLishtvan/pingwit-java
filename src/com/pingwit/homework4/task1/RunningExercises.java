package com.pingwit.homework4.task1;

public class RunningExercises {
    public static void main(String[] args) {
        double defoultDistance = 10;
        int countDay =7;
        double totalDistance = 0;
        int counter = 0;
        do {
            totalDistance += defoultDistance;
            defoultDistance = defoultDistance * 1.1;
            counter++;
        }
        while (counter < countDay);
            System.out.println(totalDistance);
    }
}