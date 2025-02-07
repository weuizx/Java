package org.example.y2025.winter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Task2 {

    public static long calculateMaxCost(long balance) {

        if (balance < 7)
            return -1;

        int[] indexes = new int[3];
        int numberOfFound = 0;
        String binaryString = Long.toBinaryString(balance);
        int length = binaryString.length();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                indexes[numberOfFound] = i;
                numberOfFound++;
                if (numberOfFound == 3) {
                    break;
                }
            }
        }

        if (numberOfFound == 2 && indexes[1] < length - 2) {
            indexes[1]++;
            indexes[2] = indexes[1] + 1;
        }

        if (numberOfFound == 1 && indexes[0] < length - 3) {
            indexes[0] += 1;
            indexes[1] = indexes[0] + 1;
            indexes[2] = indexes[0] + 2;
        }

        long result = 0;
        for (int index : indexes) {
            result += (long) Math.pow(2, length - index - 1);
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            out.println(calculateMaxCost(Long.parseLong(in.readLine())));
        }

        in.close();
        out.close();
    }
}
