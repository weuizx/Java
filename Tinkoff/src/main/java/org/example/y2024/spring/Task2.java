package org.example.y2024.spring;
import java.io.InputStream;
import java.util.Scanner;

public class Task2 {
    public static void solve(InputStream inputStream){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        long[][] arr = new long[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[j][N-1-i] = in.nextLong();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
                if(j != N - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        solve(System.in);
    }
}
