package org.example;

import java.util.Random;

public class Task15 {

    private static final Random generator = new Random();

    private static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    private static class RandomSequence implements IntSequence {
        private final int low;
        private final int high;

        RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

    }

    public static void main(String[] args) {
        IntSequence sequence = randomInts(4, 9);
        for (int i = 0; i < 9; i++) {
            System.out.println(sequence.next());
        }

    }

}