package test;

import java.util.Scanner;

public class PallindromeString {
	public static void main(String[] args) {

		String orginalString;
		String reverseString = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string you want to check :");
		orginalString = sc.nextLine();
		int n = orginalString.length();
		sc.close();
		for (int i = n - 1; i >= 0; i--) {
			reverseString = reverseString + orginalString.charAt(i);
		}

		if (orginalString.equals(reverseString))

		{
			System.out.print(orginalString + " is a pallindrome.");
		} else {
			System.out.print(orginalString + " is not a rpallindrome.");
		}

	}
}