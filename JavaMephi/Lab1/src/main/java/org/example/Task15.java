package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void run() {
        System.out.println("Task15");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = in.nextInt();
        n++;

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            triangle.add(i,new ArrayList<>());
            triangle.get(i).addFirst(1);
            for(int j = 1; j < i; j++){
                triangle.get(i).add(j,triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }

            if(i != 0)
                triangle.get(i).add(i,1);
        }

        for (ArrayList<Integer> row : triangle){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
