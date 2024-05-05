package org.example;

public class Employee implements Measurable {
    public String name = null;
    public double salary;

    public Employee(double salary, String name){
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        return this.salary;
    }

    public String getName() {
        return name;
    }

    public static double average(Measurable[] objects){
        double sum = 0;
        int count = 0;
        for(Measurable object : objects){
            sum += object.getMeasure();
            count ++;
        }
        if (count == 0){
            return 0;
        }else{
            return sum / count;
        }
    }
    public static Measurable largest(Measurable[] objects){
        double max = Double.MIN_VALUE;
        Measurable result = null;
        for(Measurable object : objects){
            if(object.getMeasure() > max){
                result = object;
                max = object.getMeasure();
            }
        }
        return result;
    }

}
