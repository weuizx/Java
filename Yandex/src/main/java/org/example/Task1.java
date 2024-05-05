package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(answer(name));
    }
    public static String answer(String name){
        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        if (name.length() < 8){
            return "NO";
        }
        for(int i = 0; i < name.length(); i ++){
            if(digit == 0){
                int code = name.charAt(i);
                if(code > 47 && code < 58){
                    digit = 1;
                }
            }
            if(lowercase == 0){
                int code = name.charAt(i);
                if(code > 96 && code < 123){
                    lowercase = 1;
                }
            }
            if(uppercase == 0){
                int code = name.charAt(i);
                if(code > 64 && code < 91){
                    uppercase = 1;
                }
            }
        }
        if(digit == 1 && uppercase == 1 && lowercase == 1){
            return "YES";
        }
        return "NO";
    }
}