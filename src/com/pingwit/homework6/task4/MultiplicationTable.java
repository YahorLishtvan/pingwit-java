package com.pingwit.homework6.task4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiTable =new int[10][10];
        for (int i = 0; i < multiTable.length; i++) {
            for (int j = 0; j < multiTable.length; j++) {
                multiTable[i][j] = (i + 1) * (j + 1);
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    }
