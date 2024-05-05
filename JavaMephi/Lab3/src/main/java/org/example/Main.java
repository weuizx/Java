package org.example;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //*****************************Task1*Task2*********************************//
//        Employee[] employees = {
//                new Employee(13.0, "John"),
//                new Employee(23.0, "Mike"),
//                new Employee(15.0, "Kevin"),
//                new Employee(0, "Levis"),
//                new Employee(-43.0, "Peter"),
//                new Employee(19.0, "Karl")};
//        System.out.println("Average = " + Employee.average(employees));
//        Employee largest = (Employee)Employee.largest(employees);
//        System.out.println("Name of employee with the largest salary : " + largest.name);
        //*****************************Task4*Task5*********************************//
//        IntSequence sequence = IntSequence.of(new int[] {1, 2, 3 , 4});
//        while(sequence.hasNext()){
//            System.out.println(sequence.next());
//        }
//        IntSequence constantSequence = IntSequence.constantLambda(1);
//        for(int i = 0; i < 5; i ++){
//            System.out.println((constantSequence.next()));
//        }
        //*****************************Task7**********************************//
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Trapoholik");
//        list.add("Money");
//        list.add("Msquit");
//        list.add("String");
//        list.add("Hypertext");
//        Task7.luckySort(list, String::compareTo);
//        System.out.println(list);
//        Task7.luckySort(list, (String s1, String s2)-> - s1.compareTo(s2));
//        System.out.println(list);
        //*****************************Task8*Task9*********************************//
//        Greeter firstGreeter = new Greeter(10, "Gosha");
//        Greeter secondGreeter = new Greeter(5, "Paul");
//        Thread firstThread = new Thread(firstGreeter);
//        Thread secondThread = new Thread(secondGreeter);
//        firstThread.start();
//        secondThread.start();

//        Task9.runInOrder(firstGreeter, secondGreeter);
//        Task9.runTogether(firstGreeter, secondGreeter);
//*****************************Task8*Task9*********************************//
        String classpath = Task10.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        System.out.println("---With method reference:");
        for (File file : Task10.returnSubdirectories(classpath))
            System.out.println(file);
        System.out.println("---With lambda expression:");
        for (File file : Task10.returnSubdirectoriesLambda(classpath))
            System.out.println(file);
        System.out.println("---With anonymous inner class:");
        for (File file : Task10.returnSubdirectoriesAnonim(classpath))
            System.out.println(file);
    }

}