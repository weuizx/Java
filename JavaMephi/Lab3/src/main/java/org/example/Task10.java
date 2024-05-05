package org.example;

import java.io.File;
import java.io.FileFilter;

public class Task10 {
    public static File[] returnSubdirectoriesLambda(String path){
        File file = new File(path);
        return file.listFiles((directory)->directory.isDirectory());
    }
    public static File[] returnSubdirectories(String path){
        File file = new File(path);
        return file.listFiles(File :: isDirectory);
    }
    public static File[] returnSubdirectoriesAnonim(String path) {
        File file = new File(path);
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });
    }
}
