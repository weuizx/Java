package org.example.y2025.winter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task5 {

    public static long calculateSumOfSum(int[] a, int n, long s) {

        long curSum;
        int multiplier;
        long result = 0;

        for (int i = 0; i < n; i ++) {
            curSum = 0;
            multiplier = 1;
            for (int j = i; j < n; j ++){
                curSum += a[j];
                if (curSum > s){
                    curSum = curSum % s;
                    multiplier ++;
                }
                result += multiplier;
            }
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        String input = in.readLine();
        String[] ns = input.split(" ");
        int n = Integer.parseInt(ns[0]);
        int s = Integer.parseInt(ns[1]);


        input = in.readLine();
        in.close();

        int[] a = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(calculateSumOfSum(a, n, s));

    }
}

