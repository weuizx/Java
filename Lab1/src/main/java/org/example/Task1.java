package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run() {
        System.out.print("Task1\nEnter integer number : ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("binary : " + Integer.toBinaryString(number));
        System.out.printf("octal : %o\nhexadecimal : %X\n", number, number);
        System.out.println("inverse : " + Double.toHexString(1.0 / number));

        System.out.println();
    }

}
