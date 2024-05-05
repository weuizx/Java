package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String rotation = in.next();

        long[][] matrix = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = in.nextLong();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        int n = N-1;
        int left = 0;
        int right = n;
        while (left < right){

            for (int i = left; i < right; i++) {

                if(rotation.equals("R")){

                    if(matrix[left][i] != matrix[i][right]){
                        result.add(left);
                        result.add(i);
                        result.add(i);
                        result.add(right);

                        long a = matrix[left][i];
                        matrix[left][i] = matrix[i][right];
                        matrix[i][right] = a;
                    }

                    if(matrix[n - i][left] != matrix[left][i]){
                        result.add(n - i);
                        result.add(left);
                        result.add(left);
                        result.add(i);

                        long a = matrix[n - i][left];
                        matrix[n - i][left] = matrix[left][i];
                        matrix[left][i] = a;
                    }

                    if(matrix[right][n - i] != matrix[n - i][left]){
                        result.add(right);
                        result.add(n - i);
                        result.add(n - i);
                        result.add(left);

                        long a = matrix[right][n - i];
                        matrix[right][n - i] = matrix[n - i][left];
                        matrix[n - i][left] = a;
                    }
                } else if (rotation.equals("L")) {

                    if(matrix[left][n - i] != matrix[i][left]){
                        result.add(left);
                        result.add(n - i);
                        result.add(i);
                        result.add(left);

                        long a = matrix[left][n - i];
                        matrix[left][n - i] = matrix[i][left];
                        matrix[i][left] = a;
                    }

                    if(matrix[n - i][right] != matrix[left][n - i]){
                        result.add(n - i);
                        result.add(right);
                        result.add(left);
                        result.add(n - i);

                        long a = matrix[n - i][right];
                        matrix[n - i][right] = matrix[left][n - i];
                        matrix[left][n - i] = a;
                    }

                    if(matrix[right][i] != matrix[n - i][right]){
                        result.add(right);
                        result.add(i);
                        result.add(n - i);
                        result.add(right);

                        long a = matrix[right][i];
                        matrix[right][i] = matrix[n - i][right];
                        matrix[n - i][right] = a;
                    }
                }
            }

            left += 1;
            right -= 1;
        }

        System.out.println(result.size()/4);
        int i = 1;
        for (Integer num : result){
            System.out.print(num + " ");

            if(i%4 == 0){
                System.out.println();
            }
            i += 1;
        }

    }
}
