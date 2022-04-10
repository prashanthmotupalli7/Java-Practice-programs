package test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter orginal string : ");
	    String orginalString = sc.next();
	    sc.close();
		String reverseString = "";
		int n = orginalString.length();
		for (int i = n - 1; i >= 0; i--) {
			reverseString = reverseString + orginalString.charAt(i);
		}
		System.out.println(reverseString);

	}

}
