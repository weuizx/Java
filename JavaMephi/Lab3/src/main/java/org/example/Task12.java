package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Task12 {

    public static void main(String[] args) {

        String classpath = "/Users/dmitriykosolobov/IdeaProjects/labs/lab3/src/main/resources/test";

        File[] files = new File(classpath).listFiles();
        print(files);
        System.out.println();


        sort(files);
        print(files);

    }

    public static void print(File[] files){
        if(files != null){
            for(File file : files){
                System.out.println(file);
            }
        }
    }

    private static void sort(File[] files) {
        Arrays.sort(files, (o1,o2) -> {
            if(o1.isFile()){
                if(o2.isFile()){
                    return o1.getPath().compareTo(o2.getPath());
                } else {
                    return 1;
                }
            } else {
                if(o2.isDirectory()){
                    return o1.getPath().compareTo(o2.getPath());
                } else {
                    return -1;
                }
            }
        });
    }
}