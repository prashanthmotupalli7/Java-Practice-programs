package test;

import java.util.Scanner;

public class PrimeBetweenRange {

	public static void main(String[] args) {

		int low, upper, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower value : ");
		low = sc.nextInt();
		System.out.print("Enter upper value : ");
		upper = sc.nextInt();

		for (i = low; i <= upper; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j)
				System.out.print(j + " ");
		}

	}

}
