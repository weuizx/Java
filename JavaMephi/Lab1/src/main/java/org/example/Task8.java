package org.example;

import java.util.Scanner;

public class Task8 {
    public static void run() {
        System.out.println("Task8");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();
        for(int i = 0; i < str.length()-1; i++) {
            for(int j = i+1; j < str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }

        System.out.println();
    }

}
