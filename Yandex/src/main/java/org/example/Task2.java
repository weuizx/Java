package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String task = in.nextLine();
        String input = in.nextLine();
        System.out.println(answer(task, input));
    }
    public static String answer(String task, String input){
        StringBuilder result = new StringBuilder();
        int offset = 0;
        int length = 0;
        for(int i = 0; i < input.length(); i++){
            while(i < input.length() && input.charAt(i) != '<'){
                result.insert(offset, input.charAt(i));
                i ++;
                offset ++;
                length ++;
            }
            i++;
            if(i >= input.length()){
                break;
            }
            if(input.charAt(i) == 'l'){
                if(offset != 0){
                    offset--;
                }
                i += 4;
            }else if(input.charAt(i) == 'r'){
                if(offset != length){
                    offset ++;
                }
                i += 5;
            }else if(input.charAt(i) == 'd'){
                if(offset != length){
                    result.deleteCharAt(offset);
                    length --;
                }
                i += 6;
            }else if(input.charAt(i) == 'b'){
                if(offset != 0){
                    result.deleteCharAt(offset - 1);
                    offset --;
                    length --;
                }
                i += 6;
            }
        }
        System.out.println(result);
        if(task.compareTo(result.toString()) == 0){
            return "YES";
        }
        return "NO";
    }
}
