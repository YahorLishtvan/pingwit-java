package com.pingwit.homework6.task5;

public class ReverseArray {
    public static void main(String[] args) {
        String[] myArray = {"Уехать", "Нельзя", "Остаться"};
        int n = myArray.length;
        String temp;
        for (int i = 0; i < n / 2; i++) {
            temp = myArray[n - i - 1];
            myArray[n - i - 1] = myArray[i];
            myArray[i] = temp;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("replaced array : " +i+" "+ myArray[i]);
        }
    }
}
