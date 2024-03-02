package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task14 {
    public static void run() {
        System.out.println("Task14");

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int i = 0;
        boolean flag = true;
        while (flag){
            matrix.add(new ArrayList<>());
            String input = in.nextLine();
            String[] array = input.split(" ");
            int k = array.length;
            for(int j = 0; j < array.length; j++) {
                matrix.get(i).add(Integer.parseInt(array[j]));
            }
            i++;
            if(i == k) flag = false;
        }
        System.out.println(isMagic(matrix) ? "is Magic" : "isn't magic");



        System.out.println();
    }
    public static boolean isMagic(ArrayList<ArrayList<Integer>> matrix) {
        int firstSum = 0;
        for(int i = 0; i < matrix.size(); i++) firstSum += matrix.getFirst().get(i);

        for(int i = 0; i < matrix.size(); i++) { //rows
            int sumRow = 0;
            int sumColumn = 0;
            for(int j = 0; j < matrix.size(); j++) {
                sumRow += matrix.get(i).get(j);
                sumColumn += matrix.get(j).get(i);
            }
            if(sumRow != firstSum) return false;
            if(sumColumn != firstSum) return false;
        }

        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for(int i = 0; i < matrix.size(); i ++) {
            sumDiagonal1 += matrix.get(i).get(i);
            sumDiagonal2 += matrix.get(i).get(matrix.size() - 1 - i);
        }
        if(sumDiagonal1 != firstSum) return false;
        if(sumDiagonal2 != firstSum) return false;
        return true;
    }
}
