package org.example;

import java.util.Scanner;

public class Task9 {
    public static void run() {
        System.out.println("Task9");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = in.nextLine();
        System.out.print("Enter second string : ");
        String str2 = in.nextLine();
        boolean flag = true;
        if(str1.length() != str2.length()) {
            flag = false;
        } else {
            int i = 0;
            while(flag && i < str1.length()){
                if(str1.charAt(i) != str2.charAt(i)) flag = false;
                i++;
            }
        }
        String msg = (flag) ? "equals" : "not equals";
        System.out.println(msg);


        System.out.println();
    }
}
