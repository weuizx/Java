package org.example;

import java.util.Arrays;

public interface IntSequence {
    int next();
    default boolean hasNext(){
        return true;
    }
    static IntSequence of(int[] array){
        return new IntSequence() {
            int cursor = 0;
            final int[] values = Arrays.copyOf(array, array.length);
            @Override
            public int next() {
                return values[cursor++];
            }
            @Override
            public boolean hasNext(){
                return cursor < values.length;
            }
        };
    }
    static IntSequence constant(int constant){
        return new IntSequence() {
            final int value = constant;
            @Override
            public int next() {
                return value;
            }
        };
    }
    static IntSequence constantLambda(int constant){
        return () -> constant;
    }

}
