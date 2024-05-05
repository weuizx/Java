package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Circle {
    private final Point center;
    private final double radius;
    public Circle(Point center, double radius){
        this.center = center;
        if(radius > 0) {
            this.radius = radius;
        }else{
            this.radius = 0;
        }
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
    public static ArrayList<Point> intersectionOfCircles(Circle circle1, Circle circle2){
        if(circle1.center.equals(circle2.center)){
            if(Double.compare(circle1.radius, circle2.radius) == 0) {
                System.out.println("Circles equals");
            }else{
                System.out.println("Circles don't intersect");
            }
            return null;
        }
        double x1 = circle1.center.getX();
        double y1 = circle1.center.getY();
        double r1 = circle1.radius;
        double x2 = circle2.center.getX();
        double y2 = circle2.center.getY();
        double r2 = circle2.radius;
        ArrayList<Point> list = new ArrayList<Point>();
        double k, l, m, D, x, y;
        if(Double.compare(x1, x2) == 0) {
            y = (r2 * r2 - r1 * r1 - y2 * y2 + y1 * y1) / 2 / (y1 - y2);
            k = 1;
            l = - 2 * x1;
            m = x1 * x1 + y * y - 2 * y * y1 + y1 * y1 - r1 * r1;
            D = l * l - 4 * k * m;
            if (D < 0){
                System.out.println("Circles don't intersect");
                return null;
            }
            x = (- l + Math.sqrt(D)) / 2 / k;
            list.add(new Point(x, y));
            if(Double.compare(D, 0) != 0){
                x = (- l - Math.sqrt(D)) / 2 / k;
                list.add(new Point(x, y));
            }
        }else {
            double a, b;
            a = (y2 - y1) / (x1 - x2);
            b = (r2 * r2 - r1 * r1 + x1 * x1 + y1 * y1 - x2 * x2 - y2 * y2) / (x1 - x2) / 2;
            k = a * a + 1;
            l = 2 * (a * b - a * x1 - y1);
            m = b * b + x1 * x1 + y1 * y1 - 2 * b * x1 - r1 * r1;
            D = l * l - 4 * k * m;
            if (D < 0) {
                System.out.println("Circles don't intersect");
                return null;
            }
            y = (-l + Math.sqrt(D)) / 2 / k;
            x = a * y + b;
            list.add(new Point(x, y));
            if (Double.compare(D, 0) != 0) {
                y = (-l - Math.sqrt(D)) / 2 / k;
                x = a * y + b;
                list.add(new Point(x, y));
            }
        }
        return list;
    }
}
