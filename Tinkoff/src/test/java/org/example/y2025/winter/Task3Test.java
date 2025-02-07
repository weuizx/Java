package org.example.y2025.winter;

import org.junit.jupiter.api.Test;

import static org.example.y2025.winter.Task3.calculateAdjustment;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    @Test
    public void test1(){
        int n = 10;
        int m = 8;
        String input = "1 2 3 4 5 6 7 8 9 10";
        long expected = 8;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test2(){
        int n = 10;
        int m = 2;
        String input = "1 2 3 4 5 6 7 8 9 10";
        long expected = 2;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test3(){
        int n = 10;
        int m = 5;
        String input = "1 2 3 4 5 6 7 8 9 10";
        long expected = 5;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }


    @Test
    public void test4(){
        int n = 10;
        int m = 8;
        String input = "1 10 3 4 5 6 7 8 9 2";
        long expected = 0;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test5(){
        int n = 4;
        int m = 2;
        String input = "1 2 2147483647 2147483647";
        long expected = 2147483645L;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test6(){
        int n = 3;
        int m = 1;
        String input = "1 2 2147483647";
        long expected = 2147483645;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test7(){
        int n = 12;
        int m = 10;
        String input = "1 2147483647 1 2147483647 3 4 5 6 7 8 9 10";
        long expected = 0;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test8(){
        int n = 10;
        int m = 1;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 6;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test9(){
        int n = 10;
        int m = 2;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 8;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test10(){
        int n = 10;
        int m = 3;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 9;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test11(){
        int n = 10;
        int m = 4;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 11;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test12(){
        int n = 10;
        int m = 5;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 12;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test13(){
        int n = 10;
        int m = 6;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 18;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }

    @Test
    public void test14(){
        int n = 10;
        int m = 7;
        String input = "15 20 3 4 5 6 7 28 29 26";//12 11 10 9 8 8 9 6
        long expected = 20;
        assertEquals(expected, calculateAdjustment(input, n, m));
    }
}
