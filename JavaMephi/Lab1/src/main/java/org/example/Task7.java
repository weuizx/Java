package org.example;

import java.util.Scanner;

public class Task7 {
    public static void run() {
        System.out.println("Task7");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter short values : ");
        short a = in.nextShort();
        short b = in.nextShort();
        System.out.println("a + b : " + (short) (a + b));
        System.out.println("a - b : " + (short) (a - b));
        System.out.println("a * b : " + (short) (a * b));
        if (b != 0) {
            System.out.println("a : b : " + (short) (a / b));
            System.out.println("a % b : " + (short) (a % b));
        } else System.out.println("Сan't be divided by zero");

        System.out.println();
    }
}
