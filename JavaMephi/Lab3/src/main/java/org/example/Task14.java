package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Task14 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(4, "Иванов"),
                new Employee(4,"Асфандияров"),
                new Employee(1,"Петров"),
                new Employee(8,"Ильин")
        };
        sort(employees);
        print(employees);
    }

    public static void print(Employee[] employees){
        if(employees != null){
            for(Employee employee : employees){
                System.out.println(employee.getName() + ": " + employee.getMeasure());
            }
        }
    }

    private static void sort(Employee[] employees){
        Arrays.sort(employees, Comparator.comparing(Employee::getMeasure).thenComparing(Employee::getName).reversed());
    }
}