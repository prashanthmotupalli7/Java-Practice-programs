package test;

import java.util.Scanner;

public class FactorialUsingRecursion {

	static int fact(int n) {

		if (n == 0)
			return 1;

		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number  :");
		num = sc.nextInt();

		System.out.print("Factorial of " + num + " is " + fact(num));
		sc.close();
	}
}
