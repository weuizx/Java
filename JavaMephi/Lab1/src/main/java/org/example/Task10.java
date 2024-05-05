package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void run() {
        System.out.println("Task10");

        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string length : ");
        StringBuilder builder = new StringBuilder();
        int stringLength = in.nextInt();
        for (int i = 0; i < stringLength; i++) {
            char ch = (char) (gen.nextLong(95) + 32);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        System.out.println();
    }
}
