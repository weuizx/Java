package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {



//                Task1.run();

        //Task 5 6 7*********************************************************************
//        System.out.println(new Point5(3, 4).translate(1, 3).scale(0.5));
//        Point6 point = new Point6(3, 4);
//        System.out.println(point);
//        point.translate(1,3);
//        point.scale(0.5);
//        System.out.println(point);
        //******************************************************************************

//        Task 9 ***********************************************************************
        Car mazdarx7 = new Car(8,10);
        System.out.println(mazdarx7);
        System.out.println(mazdarx7.move(-30.0, -40.0));
        System.out.println(mazdarx7);
        System.out.println(mazdarx7.move(30, 40));
        System.out.println(mazdarx7);
        System.out.println(mazdarx7.move(30.0, 40.0));
        System.out.println(mazdarx7);
        System.out.println(mazdarx7.move(120.0, 0));
        System.out.println(mazdarx7);
        mazdarx7.fillTheCar(4.0);
        System.out.println(mazdarx7);
        System.out.println(mazdarx7.move(40.0, 30.0));
        System.out.println(mazdarx7);
//        ******************************************************************************

        //Task 10 **********************************************************************
//        int[] numbers = new int[0]; //{101, 102, 103, 104, 105};
//       ArrayList<Integer> numbers = new ArrayList<>(5);
//        numbers.add(101);
//        numbers.add(102);
//        numbers.add(103);
//        numbers.add(104);
//        numbers.add(105);
//        System.out.println(RandomNumbers.randomElement(numbers));
//        System.out.println(RandomNumbers.randomElement(numbers));
//        System.out.println(RandomNumbers.randomElement(numbers));
//        System.out.println(RandomNumbers.randomElement(numbers));
//        System.out.println(RandomNumbers.randomElement(numbers));
        //******************************************************************************

        //Task 15 **********************************************************************
//        Invoice invoice = new Invoice();
//        invoice.addItem(new Invoice.Item("Voda Baikal", 2000, 20));
//        invoice.addItem(new Invoice.Item("Tomatoes", 100, 300));
//        invoice.addItem(new Invoice.Item("Bananas", 200, 150));
//        invoice.addItem(new Invoice.Item("Milk", 50, 80));
//        invoice.printInvoice();
        //******************************************************************************

        //Task 16 17**********************************************************************
//        Queue queue = new Queue();
//        System.out.println(queue.length());
//        queue.add("Vasiliy Pumpkin");
//        queue.add("Gosha Rubchinsky");
//        System.out.println(queue.length());
//        Queue.Iterator iterator = queue.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(queue.length());
//        queue.add("Mary Popins");
//        queue.add("Roby Robber");
//        queue.add("Gena Bukin");
//        iterator = queue.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(queue.length());


        //OverTask**********************************************************************
//        System.out.println(Point.distanceBetween(new Point(3,4), new Point(0,0)));
//        System.out.println(new Point(3.09,4.05).equals(new Point(3.09, 4.05)));
//        System.out.println(new Circle(new Point(3.09,4.05), 5).equals(new Circle(new Point(3.09, 4.05),5.0)));
//
//        ArrayList<Point> list = Circle.intersectionOfCircles(new Circle(new Point(3.09,4.05), 4), new Circle(new Point(3.09, 4.05),5.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(3.09,4.05), 5), new Circle(new Point(3.09, 4.05),5.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(3.21,4.20), 1), new Circle(new Point(3.09, 4.05),5.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(3.21,4.20), 5), new Circle(new Point(3.09, 4.05),5.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(-3.09,-4.05), 3), new Circle(new Point(3.09, 4.05),3.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(-3.09,-4.05), 5), new Circle(new Point(3.09, 4.05),6));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(3.00,4.00), 2), new Circle(new Point(7.00, 4.00),2.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(3.00,4.00), 1), new Circle(new Point(5.00, 4.00),1.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(4.00,5.00), -2), new Circle(new Point(4.00, 7.00),2.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(4.00,3.00), 1), new Circle(new Point(4.00, 5.00),1.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(5.00,5.00), -2), new Circle(new Point(4.00, 5.00),1.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
//        System.out.println();
//        list = Circle.intersectionOfCircles(new Circle(new Point(0.00,0.00), 1), new Circle(new Point(1.00, 1.00),1.0));
//        if (list != null) {
//            for (Point point : list) {
//                System.out.println(point);
//            }
//        }
    }
}