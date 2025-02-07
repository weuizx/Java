package org.example.y2025.winter;

import java.util.Scanner;

public class Task1 {

    private static Scanner scanner = new Scanner(System.in);

    public static boolean isValid(String str) {
        for (int i = 0; i < 2; i++) {
            if(str.charAt(i) == 'R')
                return true;
            if(str.charAt(i) == 'M')
                return false;
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {

        String input = scanner.nextLine();

        System.out.println(isValid(input) ? "Yes" : "No");
    }
}
