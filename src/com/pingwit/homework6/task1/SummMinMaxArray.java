package com.pingwit.homework6.task1;

import java.util.Arrays;
import java.util.Scanner;

public class SummMinMaxArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int[] myArray=new int[3];
        for (int i =0;i<myArray.length;i++){
            System.out.println("Please, enter "+(i+1)+" number for array");
            myArray[i]=scanner.nextInt();
            sum+=myArray[i];

        }
        System.out.println("Your max number is "+ Arrays.stream(myArray).max());
        System.out.println("Your min number is "+ Arrays.stream(myArray).min());
        System.out.println("Your sum number is "+sum);
    }
}