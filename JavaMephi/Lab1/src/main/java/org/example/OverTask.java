package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OverTask {
    public static void run() {
        System.out.print("Task3\nFill the array : ");

        System.out.println("maxValues : " + Arrays.toString(OverTask.doubleMax(OverTask.scan())));

        System.out.println();
    }

    public static int[] doubleMax(int... values) {
        if(values.length == 0) {
            return new int[0];
        }
        if(values.length == 1) {
            return values;
        }
        int[] maxValue = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue[0]) {
                maxValue[1] = maxValue[0];
                maxValue[0] = values[i];
            }else if(values[i] > maxValue[1]){
                maxValue[1] = values[i];
            }

        }
        return maxValue;
    }
    public static int[] scan(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(2);
        Scanner in = new Scanner(System.in);
        in.useDelimiter( "\\D+" );
        while ( in.hasNextInt() ){
            numbers.add(in.nextInt());
        }
//        String input = in.nextLine();
//        String[] array = input.split(" ");
        int[] output = new int[numbers.size()];
        for(int j = 0; j < numbers.size(); j++) {
            output[j] = numbers.get(j);
        }
        return output;
    }
}
