package org.example;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static int randomElement(int[] numbers){
        if (numbers.length == 0){
            return 0;
        }
        Random random = new Random();
        return numbers[random.nextInt(numbers.length)];
    }
    public static int randomElement(ArrayList<Integer> numbers){
        if (numbers.isEmpty()){
            return 0;
        }
        Random random = new Random();
        return numbers.get(random.nextInt(numbers.size()));
    }
}
