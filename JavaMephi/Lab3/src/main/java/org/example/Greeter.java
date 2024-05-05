package org.example;

public class Greeter implements Runnable{
    int n;
    String target;
    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }
    public void run(){
        for(int i = 0; i < n; i++){
            System.out.println("Hello, " + target);
        }
    }
}
