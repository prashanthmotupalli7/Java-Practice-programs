package test;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string is:  ");
		String orginalString = sc.nextLine();
		sc.close();
		String reverseString = "";
		int n = orginalString.length();
		for (int i = n - 1; i >= 0; i--) {
			reverseString = reverseString + orginalString.charAt(i);

		}
		System.out.println(reverseString);

	}
}
