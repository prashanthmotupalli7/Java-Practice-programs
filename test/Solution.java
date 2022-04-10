package test;

import java.util.Scanner;

public class Solution {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++) {
			String[] arrayRowItems = sc.next().split(" ");
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrayItem = Integer.parseInt(arrayRowItems[j]);
				a[i][j] = arrayItem;
			}
		}
		int maxSum = Integer.MIN_VALUE;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				int sum = a[row][col] + a[row][col + 1] + a[row][col + 2] + a[row + 1][col + 1] + a[row + 2][col]
						+ a[row + 2][col + 1] + a[row + 2][col + 2];

				if (sum > maxSum) {
					maxSum = sum;
				}

			}
		}

		System.out.println(maxSum);
		sc.close();
	}

}
