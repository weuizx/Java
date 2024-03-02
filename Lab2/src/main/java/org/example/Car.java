package org.example;

public class Car {
    private final int consumption;
    private double X;
    private double fuel;
    public Car(int consumption, double fuel){
        this.consumption = consumption;
        this.fuel = fuel;
        this.X = 0;
    }
    public String move(double distance){
        if(this.fuel <= 0.00001){
            return "fuel tank is empty!";
        }
        if(this.fuel < distance / this.consumption){
            this.X += this.fuel * this.consumption;
            this.fuel = 0;
            return "The fuel is out!";
        }else{
            this.X += distance;
            this.fuel -= Math.abs(distance / this.consumption);
            return "Success";
        }
    }

    public void fillTheCar(double fuel){
        this.fuel += fuel;
    }

    public double getX() {
        return X;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "consumption=" + consumption +
                ", X=" + X +
                ", fuel=" + fuel +
                '}';
    }
}
