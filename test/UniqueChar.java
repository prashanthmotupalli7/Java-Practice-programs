package test;

import java.util.Arrays;

class UniqueChar {

	boolean uniqueCharacters(String str) {
		char[] chArray = str.toCharArray();

		Arrays.sort(chArray);

		for (int i = 0; i < chArray.length - 1; i++) {
			// if the adjacent elements are not
			// equal, move to next element
			if (chArray[i] != chArray[i + 1])
				continue;

			// if at any time, 2 adjacent elements
			// become equal, return false
			else
				return false;
		}
		return true;
	}

	// Driver code
	public static void main(String args[]) {
		UniqueChar uc = new UniqueChar();
		String input = "p";

		if (uc.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
}
