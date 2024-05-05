package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Task6 {

    public enum Color{
        WHITE,
        BLACK,
        GREY
    }

    public enum Type{
        K,
        G,
        NULL
    }

    public static class Cell {
        private int x;
        private int y;
        private Type type;

        public Color KColor;
        public Color GColor;

        public Cell(int x, int y, Type type) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.KColor = Color.WHITE;
            this.GColor = Color.WHITE;
        }

        public void setXY(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static class Step{
        public Cell cell;
        public Type type;
        public int step;


        public Step(Cell cell, Type type, int step){
            this.cell = cell;
            this.type = type;
            this.step = step;
        }
    }


    static int[] Kdx = {1, 1, -1, -1, 2, 2, -2, -2};
    static int[] Kdy = {2, -2, 2, -2, 1, -1, 1, -1};

    static int[] Gdx = {1, 1, -1, -1, 1, -1, 0, 0};
    static int[] Gdy = {1, -1, 1, -1, 0, 0, 1, -1};

    public static boolean isValid(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static int shortestPath(Cell[][] desk, int n, Cell start, Cell end) {
        Queue<Step> queue = new LinkedList<>();

        Step firstStep = new Step(desk[start.x][start.y], Type.K, 0);
        queue.add(firstStep);

        while (!queue.isEmpty()){
            Step current = queue.poll();
            if(current.cell.x == end.x && current.cell.y == end.y){
                return current.step;
            }

            if (current.type == Type.K){
                current.cell.KColor = Color.BLACK;
            } else {
                current.cell.GColor = Color.BLACK;
            }

            if (current.cell.type == Type.K) {
                current.type = Type.K;
            } else if (current.cell.type == Type.G) {
                current.type = Type.G;
            }

            if (current.type == Type.K) {
                for (int i = 0; i < 8; i++) {
                    int x = current.cell.x + Kdx[i];
                    int y = current.cell.y + Kdy[i];

                    if (isValid(x, y, n) && desk[x][y].KColor == Color.WHITE) {
                        desk[x][y].KColor = Color.GREY;
                        queue.add(new Step(desk[x][y], current.type, current.step + 1));
                    }
                }
            } else {
                for (int i = 0; i < 8; i++) {
                    int x = current.cell.x + Gdx[i];
                    int y = current.cell.y + Gdy[i];

                    if (isValid(x, y, n) && desk[x][y].GColor == Color.WHITE) {
                        desk[x][y].GColor = Color.GREY;
                        queue.add(new Step(desk[x][y], current.type, current.step + 1));
                    }
                }
            }
        }

        return -1;
    }



    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        int N = Integer.parseInt(in.readLine());

        Cell[][] desk = new Cell[N][N];

        Cell start = new Cell(0,0, Type.NULL);
        Cell end = new Cell(0,0, Type.NULL);

        for (int i = 0; i < N; i++) {
            String str = in.readLine();
            for (int j = 0; j < N; j++) {
                char ch = str.charAt(j);
                Type type = switch (ch) {
                    case 'K' -> Type.K;
                    case 'G' -> Type.G;
                    default -> Type.NULL;
                };
                desk[i][j] = new Cell(i,j,type);

                if(ch == 'S'){
                    start.setXY(i,j);
                } else if(ch == 'F'){
                    end.setXY(i,j);
                }
            }
        }

        int res = shortestPath(desk, N, start, end);
        System.out.println(res);

    }
}
