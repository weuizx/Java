package org.example;

import java.util.Scanner;

public class Task3 {
    public static void run() {
        System.out.print("Task3\nFill the array : ");

        System.out.println("maxValue with \"if\" : " + Task3.max(Task3.scan()));

        System.out.println();
    }

    public static int max(int... values) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    public static int[] scan(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] array = input.split(" ");
        int[] output = new int[array.length];
        for(int j = 0; j < array.length; j++) {
            output[j] = Integer.parseInt(array[j]);
        }
        return output;
    }
}
