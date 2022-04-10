package test;

import java.util.Scanner;

public class ArrayMaxMinDiff {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Difference between max and minimum element in array is" + (max - min));

	}
}
