package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TaskA {
	public static void main(String[] args) throws IOException {
		int n;
		Map<Point, Integer> map = new HashMap<>();
		int[] point;
		String result = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		PrintWriter out = new PrintWriter(System.out);
		n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			point = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Point p = new Point(point[0], point[1]);
			map.put(p, i % 2);

			if (!result.isEmpty()){
				result = "Inattention";
			}else if(isEndOfGame(p, map)){
				result = i % 2 == 0 ? "First" : "Second";
			}
		}
		out.println(result.isEmpty() ? "Draw" : result);
		in.close();
		out.close();
	}

	public static boolean isEndOfGame(Point point, Map<Point, Integer> map) {
		boolean[][] vectors = new boolean[4][9];
		int value = map.get(point);
		for (int i = -4; i <= 4 ; i++) {
			vectors[0][4 + i] = map.getOrDefault(new Point(point.x + i, point.y), -1).equals(value);
			vectors[1][4 + i] = map.getOrDefault(new Point(point.x, point.y + i), -1).equals(value);
			vectors[2][4 + i] = map.getOrDefault(new Point(point.x + i, point.y + i), -1).equals(value);
			vectors[3][4 + i] = map.getOrDefault(new Point(point.x + i, point.y - i), -1).equals(value);
		}
		for(int i = 0; i < 4; i ++){
			int count = 0;
			for (boolean bool : vectors[i]) {
				if (bool) {
					count ++;
				} else {
					count = 0;
				}
				if (count == 5) {
					return true;
				}
			}
		}

		return false;
	}

	public static class Point {
		public final int x;
		public final int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Point point = (Point) o;
			return x == point.x && y == point.y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
}
