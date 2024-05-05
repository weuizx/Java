package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TaskB {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        String input = in.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());
        long result = 0;
        int[] days = new int[N];
        LinkedList<Day> list = new LinkedList();
        tokenizer = new StringTokenizer(in.readLine());
        for(int i = 0; i < N; i ++){
            Day day = new Day(i, Integer.parseInt(tokenizer.nextToken()));
            while(!list.isEmpty() && list.getFirst().i <= i - K){
                list.pollFirst();
            }
            while(!list.isEmpty() && list.getLast().price >= day.price){
                list.pollLast();
            }
            list.addLast(day);
            Day first = list.getFirst();
            days[first.i] ++;
            result += first.price;
        }
        out.println(result);
        int length = days.length;
        for (int day : days) {
            out.print(day);
            out.print(" ");
        }
        in.close();
        out.close();
    }
    public static class Day{
        public int price;
        public int i;
        public Day(int i, int price){
            this.i = i;
            this.price = price;
        }
    }
}
