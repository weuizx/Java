package org.example;

import java.io.*;
import java.util.Arrays;

public class Task1 {
	public int solve(InputStream inputStream) throws IOException {
		InputStreamReader isr = new InputStreamReader(inputStream);
		BufferedReader in = new BufferedReader(isr);
		int n = Integer.parseInt(in.readLine());
		int res = -1;
		if (n < 7) return res;

		char[] marks = new char[7];
		Arrays.fill(marks, '0');
		char nextVal;
		char prevVal;

		int amountOfBadMarks = 0;
		int amountOfGoodMarks = 0;

		for (int i = 0; i < n; i++) {
			nextVal = (char) in.read();
			prevVal = marks[i % 7];

			if (prevVal == '2' || prevVal == '3') amountOfBadMarks--;
			else if (prevVal == '5') amountOfGoodMarks--;

			if (nextVal == '2' || nextVal == '3') amountOfBadMarks++;
			else if (nextVal == '5') amountOfGoodMarks++;

			if (i > 5 && amountOfBadMarks == 0) res = Math.max(res, amountOfGoodMarks);

			marks[i % 7] = nextVal;
			if (i < n - 1) {
				in.read();
			}
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(new Task1().solve(System.in));
	}
}
