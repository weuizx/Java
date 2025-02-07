package org.example.y2025.winter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Task6 {

    private static final Double INF = (double) Integer.MAX_VALUE;

    private static List<Double> getLine(int x1, int y1, int x2, int y2) {
        double k = (double) (y1 - y2) / (x1 - x2);
        double b = y1 - k * x1;
        return List.of(k, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer tokenizer = new StringTokenizer(s);

        int n = Integer.parseInt(tokenizer.nextToken());
        List<int[]> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s = in.readLine();
            tokenizer = new StringTokenizer(s);
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            points.add(new int[]{x, y});
        }

        HashMap<List<Double>, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                List<Double> line;
                if (points.get(i)[0] == points.get(j)[0]) {
                    line = List.of(INF, (double) points.get(i)[0]);
                } else {
                    line = getLine(points.get(i)[0], points.get(i)[1], points.get(j)[0], points.get(j)[1]);
                }
                map.putIfAbsent(line, new HashSet<>());
                map.get(line).add(i);
                map.get(line).add(j);
            }
        }

        int result = 0;

        for (int move = 0; move < n; move++) {
            int sizeOfLine = 0;
            for (Map.Entry<List<Double>, HashSet<Integer>> entry : map.entrySet()) {
                if (entry.getValue().size() < 2) {
                    entry.getValue().clear();
                }
                sizeOfLine = Math.max(sizeOfLine, entry.getValue().size());
            }
            if (sizeOfLine == 0) break;

            int[] take = new int[2];
            List<Double> line = new ArrayList<>();

            for (Map.Entry<List<Double>, HashSet<Integer>> entry : map.entrySet()) {
                if (entry.getValue().size() == sizeOfLine) {
                    Iterator<Integer> iterator = entry.getValue().iterator();
                    take[0] = iterator.next();
                    iterator.remove();
                    take[1] = iterator.next();
                    line = entry.getKey();
                    break;
                }
            }

            int last = -1;
            for (Map.Entry<List<Double>, HashSet<Integer>> entry : map.entrySet()) {
                if (!entry.getKey().equals(line) && !entry.getValue().isEmpty()) {
                    last = entry.getValue().iterator().next();
                    break;
                }
            }
            if (last == -1) break;

            for (Map.Entry<List<Double>, HashSet<Integer>> entry : map.entrySet()) {
                entry.getValue().remove(take[0]);
                entry.getValue().remove(take[1]);
                entry.getValue().remove(last);
                if (entry.getValue().size() < 2) entry.getValue().clear();
            }
            result++;
        }

        out.println(result);

        in.close();
        out.close();
    }
}
