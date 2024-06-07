package com.pingwit.homework4.task1;

public class RunningExercises {
    public static void main(String[] args) {
        double defoultDestance = 10;
        double totalDistance = 0;
        int counter = 0;
        do {
            totalDistance += defoultDestance;
            defoultDestance = defoultDestance * 1.1;
            counter++;
        }
        while (counter < 7);
        {
            System.out.println(totalDistance);
        }
    }
}