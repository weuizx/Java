package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.System;

public class Task1 {
    public static void run(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = in.nextInt();
        System.out.print("Enter month : ");
        int month = in.nextInt();
        printCalendar(year, month);
    }
    public static void printCalendar(int year, int month){
        System.out.println(" Sun Mon Tue Wen Thu Fri Sat");
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int intWeekday = (weekday.getValue() % 7) + 1;
        for (int i = 1; i < intWeekday; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out .printf ("%4d", date.getDayOfMonth()) ;
            date = date.plusDays(1);
            if(intWeekday == 7){
                System.out.print("\n");
                intWeekday = 1;
            }else{
                intWeekday ++;
            }
        }
    }
}
