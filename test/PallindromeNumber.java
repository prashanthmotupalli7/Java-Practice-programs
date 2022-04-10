package test;
import java.util.Scanner;
public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		sc.close();
		
		if(n==rev)
			System.out.println(n+"is a pallindrome number");
		else
			System.out.println(n+"is not a pallindrome number");
			
		
		
		
		

	}

}
