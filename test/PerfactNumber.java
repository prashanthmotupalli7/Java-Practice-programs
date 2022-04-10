package test;

import java.util.Scanner;

public class PerfactNumber {

	public static void main(String[] args) {
		int i, num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter any number: ");
		num = sc.nextInt();
		sc.close();

		for (i = 1; i < num; i++) {
			if (num % i == 0) {

				sum = sum + i;
			}

		}

		if (sum == num) {
			System.out.format(num + " is a perfect number");

		} else {
			System.out.format(num + "  is not a nerfect number");

		}
	}

}