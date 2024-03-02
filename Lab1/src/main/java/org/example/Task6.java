package org.example;

import java.math.BigInteger;

public class Task6 {
    public static void run() {
        System.out.println("Task6");

        BigInteger factorial = BigInteger.ONE;
        int n = 1000;
        for(int i = 2; i <= n; i++) factorial = factorial.multiply(BigInteger.valueOf(i));
        System.out.println("result : " + factorial);

        System.out.println();
    }
}
