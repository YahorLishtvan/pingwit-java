package com.pingwit.homework5.task3;

import java.util.Scanner;

// отформатируй код
/*
если поставить размер бабочки 5, то будет
1                1
12              21
123            321
1234          4321
12345        54321
123456      654321
12345        54321
1234          4321
123            321
12              21
1                1

Таких пробелов в центре быть не должно, попробуй пока сам поискать проблему, воспользуйся дебагом
 */
public class ButterflyPrint {
    public static void main(String[] args) {
        System.out.println("Hello!\n"+"I'll draw you a butterfly!\n"+"Write in a number how big you want it to be.");
        Scanner scanner=new  Scanner(System.in);
        int sizeButterfly=scanner.nextInt();
        int j;
        for (int i = 0; i <= sizeButterfly; i++) {
            for ( j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.printf("%"+((10 - j)*2 != 0 ? (10 - j)*2 : "")+"s", "");

            for ( j = i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
        for (int i = sizeButterfly; i >= 1; i--) {
            for ( j = 1; j <= i ; j++) {
                System.out.print(j);
            }

            System.out.printf("%"+((10 - j)*2 != 0 ? (10 - j)*2 : "")+"s", "");

            for ( j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
// лишняя строка, удали
        }
// лишняя строка, удали
    }
}
