package org.example;

import java.util.Objects;

public class Point {
    private final double X;
    private final double Y;
    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
    public static double distanceBetween(Point point1, Point point2){
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(),2) +Math.pow(point1.getY() - point2.getY(),2) );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(X, point.X) == 0 && Double.compare(Y, point.Y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
