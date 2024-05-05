package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TaskC {

    public static int[] proposalU;
    public static int[] proposalV;
    public static int[] proposalT;
    public static int[] proposalC;

    public static int[] requirementA;
    public static int[] requirementB;
    public static int[] requirementT;


    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        String input = in.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input);

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j){
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            input = in.readLine();
            tokenizer = new StringTokenizer(input);
            int U = Integer.parseInt(tokenizer.nextToken()) - 1;
            int V = Integer.parseInt(tokenizer.nextToken()) - 1;
            int T = Integer.parseInt(tokenizer.nextToken());
            graph[U][V] = T;
            graph[V][U] = T;
        }

        int K = Integer.parseInt(in.readLine());
        proposalU = new int[K];
        proposalV = new int[K];
        proposalT = new int[K];
        proposalC = new int[K];

        for (int i = 0; i < K; i++) {
            input = in.readLine();
            tokenizer = new StringTokenizer(input);
            proposalU[i] = Integer.parseInt(tokenizer.nextToken()) - 1;
            proposalV[i] = Integer.parseInt(tokenizer.nextToken()) - 1;
            proposalT[i] = Integer.parseInt(tokenizer.nextToken());
            proposalC[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int P = Integer.parseInt(in.readLine());
        requirementA = new int[P];
        requirementB = new int[P];
        requirementT = new int[P];

        for (int i = 0; i < P; i++) {
            input = in.readLine();
            tokenizer = new StringTokenizer(input);
            requirementA[i] = Integer.parseInt(tokenizer.nextToken()) - 1;
            requirementB[i] = Integer.parseInt(tokenizer.nextToken()) - 1;
            requirementT[i] = Integer.parseInt(tokenizer.nextToken());
        }
        in.close();

        printResult(graph, Arrays.stream(proposalC).max().getAsInt());



    }

    public static boolean checkGraph(int C, int[][] graph){
        int n = graph.length;
        int[][] floydMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                floydMatrix[i][j] = graph[i][j];
            }
        }

        int proposalCount = proposalC.length;
        for (int i = 0; i < proposalCount; i++) {
            if(proposalC[i] <= C){
                floydMatrix[proposalU[i]][proposalV[i]] = proposalT[i];
                floydMatrix[proposalV[i]][proposalU[i]] = proposalT[i];
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (floydMatrix[i][k] != Integer.MAX_VALUE && floydMatrix[k][j] != Integer.MAX_VALUE) {
                        floydMatrix[i][j] = Math.min(floydMatrix[i][j], floydMatrix[i][k] + floydMatrix[k][j]);
                    }
                }
            }
        }

        int requirementCount = requirementT.length;
        for (int i = 0; i < requirementCount; i++) {
            if(floydMatrix[requirementA[i]][requirementB[i]] > requirementT[i]){
                return false;
            }
        }
        return true;
    }
    public static void printResult(int[][] graph, int maxC){
        int result = -1;
        int left = 0;
        int right = maxC;
        PrintWriter out = new PrintWriter(System.out);

        while(left <= right){
            int average = (left + right) / 2;
            if(checkGraph(average,graph)){
                result = average;
                right = average - 1;
            } else {
                left = average + 1;
            }
        }

        if (result == -1){
            out.println(result);
            out.close();
            return;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < proposalC.length; i++) {
            if(proposalC[i] <= result){
                res.add(i+1);
            }
        }
        int length = res.size();
        out.println(length);
        for(Integer item : res){
            out.print(item);
            out.print(" ");
        }
        out.close();
    }
}
