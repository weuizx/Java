package org.example;

import java.util.ArrayList;

public class Task9 {
    public static void runTogether(Runnable ... tasks){
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(Runnable task : tasks){
            threads.add(new Thread(task));
            threads.getLast().start();
        }
    }
    public static void runInOrder(Runnable ... tasks){
        for(Runnable task : tasks){
            task.run();
        }
    }
}
