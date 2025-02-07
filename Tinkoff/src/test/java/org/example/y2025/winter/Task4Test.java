package org.example.y2025.winter;

import org.junit.jupiter.api.Test;


import static org.example.y2025.winter.Task4.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @Test
    public void test1() {
        int a = 6;
        int b = 8;
        int expectedGcd = 2;
        int expectedLcm = 24;
        assertEquals(expectedGcd, gcd(a, b));
        assertEquals(expectedLcm, lcm(a, b));
    }

    @Test
    public void test2() {
        int a = 12345678;
        int b = 2345678;
        int expectedGcd = 2;
        long expectedLcm = 14479492639842L;
        assertEquals(expectedGcd, gcd(a, b));
        assertEquals(expectedLcm, lcm(a, b));
    }

    @Test
    public void test3() {
        int a = 1;
        int b = 1;
        int expectedGcd = 1;
        int expectedLcm = 1;
        assertEquals(expectedGcd, gcd(a, b));
        assertEquals(expectedLcm, lcm(a, b));
    }


    @Test
    public void test4() {
        int n = 6;
        int x = 10;
        int y = 20;
        int z = 30;
        String input = "8 17 5 28 39 13";
        long expected = 3;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

    @Test
    public void test5() {
        int n = 2;
        int x = 3;
        int y = 4;
        int z = 5;
        String input = "1 2";
        long expected = 14;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

    @Test
    public void test6(){
        int n = 10;
        int x = 214783647;
        int y = 214783646;
        int z = 214783645;
        String input = "1 1 1 1 1 1 1 1 1 1";
        long expected = 644350935;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

    @Test
    public void test7(){
        int n = 1;
        int x = 214783647;
        int y = 214783646;
        int z = 214783645;
        String input = "1";
        long expected = 8034013991032725285L;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

    @Test
    public void test8(){
        int n = 3;
        int x = 1;
        int y = 2;
        int z = 3;
        String input = "10 20 30";
        long expected = 0;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

    @Test
    public void test9(){
        int n = 3;
        int x = 10;
        int y = 20;
        int z = 30;
        String input = "1 2 3";
        long expected = 45;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

    @Test
    public void test10(){
        int n = 10;
        int x = 214783647;
        int y = 214783646;
        int z = 214783645;
        String input = "1 1 2 3 1 1 1 1 1 1";
        long expected = 644350932;
        assertEquals(expected, calculateOperations(input, n, x, y, z));
    }

//    @Test
//    public void test11(){
//        int n = 6;
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        String input = "8 17 5 28 39 13";
//        long expected = 3;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test12(){
//        int n = 6;
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        String input = "8 17 5 28 39 13";
//        long expected = 3;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test13(){
//        int n = 6;
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        String input = "8 17 5 28 39 13";
//        long expected = 3;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test14(){
//        int n = 6;
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        String input = "8 17 5 28 39 13";
//        long expected = 3;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
}
