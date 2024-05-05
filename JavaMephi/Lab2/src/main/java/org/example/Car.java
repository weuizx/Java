package org.example;

public class Car {
    private final int consumption;
    private double X;
    private double Y;
    private double fuel;
    public Car(int consumption, double fuel){
        this.consumption = consumption;
        this.fuel = fuel;
        this.X = 0;
        this.Y = 0;
    }
    public String moveX(double distanceX){
        if(this.fuel <= 0.00001){
            return "fuel tank is empty!";
        }
        if(this.fuel < distanceX / this.consumption){
            this.X += this.fuel * this.consumption;
            this.fuel = 0;
            return "The fuel is out!";
        }else{
            this.X += distanceX;
            this.fuel -= Math.abs(distanceX / this.consumption);
            return "Success";
        }
    }
    public String moveY(double distanceY){
        if(this.fuel <= 0.00001){
            return "fuel tank is empty!";
        }
        if(this.fuel < distanceY / this.consumption){
            this.Y += this.fuel * this.consumption;
            this.fuel = 0;
            return "The fuel is out!";
        }else{
            this.Y += distanceY;
            this.fuel -= Math.abs(distanceY / this.consumption);
            return "Success";
        }
    }
    public String move(double distanceX, double distanceY){
        String message;
        double distance = Point.distanceBetween(new Point(this.X, this.Y), new Point(this.X + distanceX, this.Y + distanceY));
        double sin = distanceY / distance;
        double cos = distanceX / distance;
        if(this.fuel <= 0.00001){
            return "fuel tank is empty!";
        }
        if(this.fuel < distance * this.consumption / 100){
            this.X += this.fuel / this.consumption * 100 * cos;
            this.Y += this.fuel / this.consumption * 100 * sin;
            this.fuel = 0;
            return "The fuel is out!";
        }else {
            this.X += distance * cos;
            this.Y += distance * sin;
            this.fuel -= Math.abs(distance * this.consumption / 100);
            return "Success";
        }
//        do {
//            message = moveX(distanceX / 1000);
//            if (message.equals("Success")) {
//        X -= distanceX / 1000;
//                message = moveY(distanceY / 1000);
//        if (message.equals("Success")) {
//            Y -= distanceY / 1000;
//        }
//            }
//        }while (message.equals("Success") && (Math.abs(X) >0.00001 || Math.abs(Y) >0.00001));
    }

    public void fillTheCar(double fuel){
        this.fuel += fuel;
    }

    public double getX() {
        return X;
    }
    public double getY() {
        return Y;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "consumption=" + consumption +
                ", X=" + X +
                ", Y=" + Y +
                ", fuel=" + fuel +
                '}';
    }
}
