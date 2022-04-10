package test;
	public class Array2 
	{
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5};
	        int[] b = {5, 4, 2, 3};
	        findMissingNumber(a, b);
	    }

	    private static void findMissingNumber(int[] a, int[] b) {
	        for (int n : a) {
	            if (!isPresent(n, b)) {
	                System.out.println("missing number: " + n);
	                break;
	            }
	        }
	    }

	    private static boolean isPresent(int n, int[] b) {
	        for (int i : b) {
	            if (n == i) {
	                return true;
	            }
	        }
	        return false;
	    }
	}