package org.example;

import java.util.Scanner;

public class Task2 {
    public static void run() {
        System.out.print("Task2\nEnter the angle value : ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int result = 0;
        if(value >= 0) {
            result = value % 360;
        } else {
            result = 360 - Math.abs(value) % 360;
        }
        System.out.println("result with % : " + result);
        System.out.println("result with floorMod : " + Math.floorMod(value, 360));

        System.out.println();
    }

}
