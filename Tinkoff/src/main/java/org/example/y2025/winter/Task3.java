package org.example.y2025.winter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Task3 {

    public static long calculateAdjustment(String daysLine, int n, int m) {

        int secondSpaceIndex = daysLine.indexOf(' ', daysLine.indexOf(' ') + 1);

        String a1a2 = daysLine.substring(0, secondSpaceIndex + 1);
        StringTokenizer tokenizer = new StringTokenizer(a1a2);
        int min = Integer.parseInt(tokenizer.nextToken());
        int max = Integer.parseInt(tokenizer.nextToken());

        int[] dailyAdjustments = Arrays.stream(daysLine.substring(secondSpaceIndex + 1).split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(dailyAdjustments);

        long minSteps = Integer.MAX_VALUE;
        int l = 0;
        int r = m - 1;

        while (l < n - 2 && r < n - 2) {
            long localMinSteps = 0;
            if (min > dailyAdjustments[l]) {
                localMinSteps += (min - dailyAdjustments[l]);
            }
            if (max < dailyAdjustments[r]) {
                localMinSteps += (dailyAdjustments[r] - max);
            }
            minSteps = Math.min(minSteps, localMinSteps);
            l++;
            r++;
        }

        return minSteps;
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        String input = in.readLine();
        String[] nm = input.split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        input = in.readLine();
        in.close();

        System.out.println(calculateAdjustment(input, n, m));
    }
}
