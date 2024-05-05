package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task7 {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        while(true){
            Collections.shuffle(strings);
            for(int i = 0; i < strings.size() - 1; i++){
                if(comp.compare(strings.get(i), strings.get(i + 1)) > 0){
                    return;
                }
            }
        }
    }
}
