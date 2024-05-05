package org.example;

import java.io.File;

public class Task11 {
    public static void main(String[] args){

        String classpath = "/Users/dmitriykosolobov/IdeaProjects/labs/lab3/src/main/resources/test";

        System.out.println("method reference:");
        print(getFiles(classpath,".txt"));
    }

    public static void print(String[] files){
        if(files != null){
            for(String file : files){
                System.out.println(file);
            }
        }
    }

    public static String[] getFiles(String path, String type) {
        return new File(path).list((dir,name) -> name.endsWith(type));
    }

}
