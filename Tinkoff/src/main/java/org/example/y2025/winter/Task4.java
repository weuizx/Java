package org.example.y2025.winter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {

    public static long calculateOperations(String sequenceNumbers, int n, int x, int y, int z) {

        StringTokenizer tokenizer = new StringTokenizer(sequenceNumbers);

        int sequenceNumber;

        TreeSet<Pair<Integer, Integer>> stepsToReachX = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachX.add(new Pair<>(0, Integer.MAX_VALUE));
        TreeSet<Pair<Integer, Integer>> stepsToReachY = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachY.add(new Pair<>(0, Integer.MAX_VALUE));
        TreeSet<Pair<Integer, Integer>> stepsToReachZ = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachZ.add(new Pair<>(0, Integer.MAX_VALUE));
        TreeSet<Pair<Integer, Long>> stepsToReachXY = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachXY.add(new Pair<>(0, Long.MAX_VALUE));
        TreeSet<Pair<Integer, Long>> stepsToReachXZ = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachXZ.add(new Pair<>(0, Long.MAX_VALUE));
        TreeSet<Pair<Integer, Long>> stepsToReachYZ = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachYZ.add(new Pair<>(0, Long.MAX_VALUE));
        TreeSet<Pair<Integer, Long>> stepsToReachXYZ = new TreeSet<>((pair1, pair2) -> {if (pair1.getValue() > pair2.getValue()) return 1;else return -1;});
        stepsToReachXYZ.add(new Pair<>(0, Long.MAX_VALUE));

        long lcmXY = lcm(x, y);
        long lcmXZ = lcm(x, z);
        long lcmYZ = lcm(y, z);
        long lcmXYZ = lcm(lcmXY, z);

        for (int i = 0; i < n; i++) {
            sequenceNumber = Integer.parseInt(tokenizer.nextToken());

            int localStepsToReachX = sequenceNumber % x == 0 ? 0 : x - sequenceNumber % x;
            int localStepsToReachY = sequenceNumber % y == 0 ? 0 : y - sequenceNumber % y;
            int localStepsToReachZ = sequenceNumber % z == 0 ? 0 : z - sequenceNumber % z;
            long localStepsToReachXY = sequenceNumber % lcmXY == 0 ? 0 : lcmXY - sequenceNumber % lcmXY;
            long localStepsToReachXZ = sequenceNumber % lcmXZ == 0 ? 0 : lcmXZ - sequenceNumber % lcmXZ;
            long localStepsToReachYZ = sequenceNumber % lcmYZ == 0 ? 0 : lcmYZ - sequenceNumber % lcmYZ;
            long localStepsToReachXYZ = sequenceNumber % lcmXYZ == 0 ? 0 : lcmXYZ - sequenceNumber % lcmXYZ;

            if (localStepsToReachX <= stepsToReachX.last().getValue()) {
                stepsToReachX.add(new Pair<>(i, localStepsToReachX));
                if (stepsToReachX.size() > 3) {
                    stepsToReachX.pollLast();
                }
            }
            if (localStepsToReachY <= stepsToReachY.last().getValue()) {
                stepsToReachY.add(new Pair<>(i, localStepsToReachY));
                if (stepsToReachY.size() > 3) {
                    stepsToReachY.pollLast();
                }
            }
            if (localStepsToReachZ <= stepsToReachZ.last().getValue()) {
                stepsToReachZ.add(new Pair<>(i, localStepsToReachZ));
                if (stepsToReachZ.size() > 3) {
                    stepsToReachZ.pollLast();
                }
            }
            if (localStepsToReachXY <= stepsToReachXY.last().getValue()) {
                stepsToReachXY.add(new Pair<>(i, localStepsToReachXY));
                if (stepsToReachXY.size() > 2) {
                    stepsToReachXY.pollLast();
                }
            }
            if (localStepsToReachXZ <= stepsToReachXZ.last().getValue()) {
                stepsToReachXZ.add(new Pair<>(i, localStepsToReachXZ));
                if (stepsToReachXZ.size() > 2) {
                    stepsToReachXZ.pollLast();
                }
            }
            if (localStepsToReachYZ <= stepsToReachYZ.last().getValue()) {
                stepsToReachYZ.add(new Pair<>(i, localStepsToReachYZ));
                if (stepsToReachYZ.size() > 2) {
                    stepsToReachYZ.pollLast();
                }
            }
            if (localStepsToReachXYZ <= stepsToReachXYZ.last().getValue()) {
                stepsToReachXYZ.add(new Pair<>(i, localStepsToReachXYZ));
                if (stepsToReachXYZ.size() > 1) {
                    stepsToReachXYZ.pollLast();
                }
            }

        }

        long result = stepsToReachXYZ.first().value;

        if (n > 1) {

            for (Pair<Integer, Integer> entry : stepsToReachZ) {
                if (!entry.getIndex().equals(stepsToReachXY.first().getIndex())) {
                    result = Math.min(result, entry.value + stepsToReachXY.first().value);
                    break;
                } else {
                    result = Math.min(result, entry.value + stepsToReachXY.last().value);
                }
            }

            for (Pair<Integer, Integer> entry : stepsToReachY) {
                if (!entry.getIndex().equals(stepsToReachXZ.first().getIndex())) {
                    result = Math.min(result, entry.value + stepsToReachXZ.first().value);
                    break;
                } else {
                    result = Math.min(result, entry.value + stepsToReachXZ.last().value);
                }
            }

            for (Pair<Integer, Integer> entry : stepsToReachX) {
                if (!entry.getIndex().equals(stepsToReachYZ.first().getIndex())) {
                    result = Math.min(result, entry.value + stepsToReachYZ.first().value);
                    break;
                } else {
                    result = Math.min(result, entry.value + stepsToReachYZ.last().value);
                }
            }
        }
        if (n > 2) {
            for (Pair<Integer, Integer> xEntry : stepsToReachX) {
                for (Pair<Integer, Integer> yEntry : stepsToReachY) {
                    for (Pair<Integer, Integer> zEntry : stepsToReachZ) {
                        if (!xEntry.getIndex().equals(yEntry.getIndex()) &&
                                !yEntry.getIndex().equals(zEntry.getIndex()) &&
                                !xEntry.getIndex().equals(zEntry.getIndex())) {
                            result = Math.min(result, xEntry.getValue() + yEntry.getValue() + zEntry.getValue());
                        }
                    }
                }

            }
        }

        return result;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        String input = in.readLine();
        String[] nxyz = input.split(" ");
        int n = Integer.parseInt(nxyz[0]);
        int x = Integer.parseInt(nxyz[1]);
        int y = Integer.parseInt(nxyz[2]);
        int z = Integer.parseInt(nxyz[3]);

        input = in.readLine();
        in.close();

        System.out.println(calculateOperations(input, n, x, y, z));
    }

    static class Pair<K, V> {
        private K index;
        private V value;

        public Pair(K key, V value) {
            this.index = key;
            this.value = value;
        }

        public K getIndex() {
            return index;
        }

        public V getValue() {
            return value;
        }

        public void setIndex(K index) {
            this.index = index;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
