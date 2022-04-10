package test;

import java.util.Scanner;

class DecimalToAny {

	Scanner sc;
	int num;

	void getVal() {
		System.out.println("Enter a number to convert HexaDecimal,Octal and Binary");
		sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = Integer.parseInt(sc.nextLine());

	}

	void convert() {
		String hexa = Integer.toHexString(num);
		System.out.println("Hexadecimal value is " + hexa);
		String octa = Integer.toOctalString(num);
		System.out.print("Octal value is " + octa+"\n");
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary value is " + binary+"\n");
	}

	public static void main(String[] args) {
		DecimalToAny d = new DecimalToAny();
		d.getVal();
		d.convert();
	}

}
