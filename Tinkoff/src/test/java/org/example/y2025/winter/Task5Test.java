package org.example.y2025.winter;

import org.junit.jupiter.api.Test;

import static org.example.y2025.winter.Task5.calculateSumOfSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {

//    @Test
//    public void test1() {
//        int n = 250000;
//        long s = 1;
//        long expected = 2;
//        int[] a = new int[n];
//        Arrays.fill(a, 1);
//        assertEquals(expected, calculateSumOfSum(a, n, s));
//    }

    @Test
    public void test2() {
        int n = 1;
        long s = 1;
        long expected = 1;
        int[] a = {1};
        assertEquals(expected, calculateSumOfSum(a, n, s));
    }

    @Test
    public void test3() {
        int n = 1;
        long s = 1200;
        long expected = 1;
        int[] a = {1};
        assertEquals(expected, calculateSumOfSum(a, n, s));
    }


    @Test
    public void test4() {
        int n = 2;
        long s = 1;
        long expected = 4;
        int[] a = {1, 1};
        assertEquals(expected, calculateSumOfSum(a, n, s));
    }

    @Test
    public void test5() {
        int n = 2;
        long s = 2;
        long expected = 3;
        int[] a = {1, 1};
        assertEquals(expected, calculateSumOfSum(a, n, s));
    }

//    @Test
//    public void test6(){
//        int n = 10;
//        int x = 214783647;
//        int y = 214783646;
//        int z = 214783645;
//        String input = "1 1 1 1 1 1 1 1 1 1";
//        long expected = 644350935;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test7(){
//        int n = 1;
//        int x = 214783647;
//        int y = 214783646;
//        int z = 214783645;
//        String input = "1";
//        long expected = 8034013991032725285L;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test8(){
//        int n = 3;
//        int x = 1;
//        int y = 2;
//        int z = 3;
//        String input = "10 20 30";
//        long expected = 0;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test9(){
//        int n = 3;
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        String input = "1 2 3";
//        long expected = 46;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
//
//    @Test
//    public void test10(){
//        int n = 10;
//        int x = 214783647;
//        int y = 214783646;
//        int z = 214783645;
//        String input = "1 1 2 3 1 1 1 1 1 1";
//        long expected = 644350932;
//        assertEquals(expected, calculateOperations(input, n, x, y, z));
//    }
}
