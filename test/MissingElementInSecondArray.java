package test;

import java.util.Scanner;

public class MissingElementInSecondArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("enter size of of array1  : ");
		int n1 = s.nextInt();

		System.out.print("enter size of of array2  : ");
		int n2 = s.nextInt();

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		System.out.println("enter elements of array 1");

		for (int i = 0; i < n1; i++) {
			arr1[i] = s.nextInt();

		}
		System.out.println("enter elements of array 2");

		for (int i = 0; i < n2; i++) {
			arr2[i] = s.nextInt();

		}
		s.close();
		findMissingNumber(arr1, arr2);
	}
	

	
	private static void findMissingNumber(int[] arr1, int[] arr2) {
		System.out.println("Missing numbers are ");
		for (int n : arr1) {
			if (!isPresent(n, arr2)) {
				System.out.print(n+ " ");
				
			}
		}
	}

	private static boolean isPresent(int n, int[] arr2) {
		for (int i : arr2) {
			if (n == i) {
				return true;
			}
		}
		return false;
	}
}
