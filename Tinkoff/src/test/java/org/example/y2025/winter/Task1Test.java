package org.example.y2025.winter;

import org.junit.jupiter.api.Test;

import static org.example.y2025.winter.Task1.isValid;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test {

    @Test
    public void test1(){
        String input = "RSM";
        assertTrue(isValid(input));
    }

    @Test
    public void test2(){
        String input = "RMS";
        assertTrue(isValid(input));
    }

    @Test
    public void test3(){
        String input = "SRM";
        assertTrue(isValid(input));
    }

    @Test
    public void test4(){
        String input = "SMR";
        assertFalse(isValid(input));
    }

    @Test
    public void test5(){
        String input = "MRS";
        assertFalse(isValid(input));
    }

    @Test
    public void test6(){
        String input = "MSR";
        assertFalse(isValid(input));
    }
}
