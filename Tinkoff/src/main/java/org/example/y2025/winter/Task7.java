package org.example.y2025.winter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Task7 {

    public static int[] calculateFunction(int[] array, int n, int k) {

        BigInteger[] bigResult = new BigInteger[k];
        Arrays.fill(bigResult, BigInteger.valueOf(0));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger multiplier = BigInteger.valueOf(array[i] + array[j]);
                BigInteger resultElement = multiplier;
                bigResult[0] = bigResult[0].add(resultElement);
                for (int p = 1; p < k; p++) {
                    resultElement = resultElement.multiply(multiplier);
                    bigResult[p] = bigResult[p].add(resultElement);
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = bigResult[i].mod(BigInteger.valueOf(998244353)).intValue();
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(System.out);

        String input = in.readLine();
        String[] nk = input.split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        input = in.readLine();
        in.close();

        int[] array = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] result = calculateFunction(array, n, k);

        for (int i = 0; i < k; i++) {
            out.println(result[i]);
        }
        out.close();
    }

}
