package com.pingwit.homework4.task9;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        int countSides = 4;
        int center = countSides / 2;
        for (int i = 0; i < countSides; i++) {
            for (int j = 0; j < countSides; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - countSides + 1 && j <= center - i + countSides - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}