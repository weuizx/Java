package org.example;


public class Task16 {
    public static void run() {
        System.out.println("Task16");

        System.out.println("average value : " + average(13.0, 15.9, 234.324234, 12.123, 1.0));

        System.out.println();
    }

    public static double average(double value, double... values) {
        double sum = value;
        for (double v : values) sum += v;
        return sum / (1 + values.length);
    }

}
