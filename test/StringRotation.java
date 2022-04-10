package test;

public class StringRotation {

	public static boolean check(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		String s3 = s1 + s1;
		return s3.contains(s2);
	}

	public static void main(String[] args) {
		String s1 = "prashanth";
		String s2 = "madhuri";
		boolean flag = check(s1, s2);
		if (flag)
			System.out.println(s1 + " and " + s2 + " are rotation of each other");
		else
			System.out.println(s1 + " and " + s2 + " are not rotation of each other");
	}
}
