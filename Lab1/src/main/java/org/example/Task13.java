package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task13 {
    public static void run() {
        System.out.println("Task13");

        Random gen = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>(49);
        int[] result = new int[6];
        for(int i = 1; i < 50; i++) {
            numbers.add(i);
        }
        for(int i =0; i < 6; i++){
            int a = gen.nextInt(48 - i);
            result[i] = numbers.get(a);
            numbers.remove(a);
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

        System.out.println();
    }
}
