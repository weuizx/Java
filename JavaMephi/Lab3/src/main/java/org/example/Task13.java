package org.example;

public class Task13 {

    public static Runnable tasksInOrder(Runnable[] tasks){
        return () -> {
            for(Runnable task : tasks){
                task.run();
            }
        };
    }

    public static void main(String[] args) {
        Runnable[] tasks = new Runnable[3];
        for (int i = 0; i < 3; i++) {
            int x = i + 1;
            tasks[i] = () -> System.out.println(x);
        }

        Runnable bigTask = tasksInOrder(tasks);
        bigTask.run();
    }
}
