package org.example;

import java.io.*;
import java.util.Arrays;

public class Task5 {
	public int solve(InputStream inputStream) {
		int[] curRow = {-1,0,0,0,-1};
		int[] prevRow = {-1,0,0,0,-1};
		int maxAmount = 0;
		String row;

		try (InputStreamReader isr = new InputStreamReader(inputStream);
			 BufferedReader in = new BufferedReader(isr)){
			int n = Integer.parseInt(in.readLine());
			for (int i = 0; i < n; i++) {
				row = in.readLine();
				for (int j = 1; j < 4; j++) {
					if (row.charAt(j-1) == 'W') {
						curRow[j] = -1;
					} else {
						curRow[j] = Math.max(prevRow[j-1], Math.max(prevRow[j], prevRow[j+1]));
					}
					if (row.charAt(j-1) == 'C' && curRow[j] != -1) {
						curRow[j]++;
					}
				}
				maxAmount = Math.max(maxAmount, Math.max(curRow[1], Math.max(curRow[2], curRow[3])));
				prevRow = Arrays.copyOf(curRow, 5);
			}

		} catch (IOException e) {
		}

		return maxAmount;
	}

	public static void main(String[] args){
		System.out.println(new Task5().solve(System.in));
	}
}
