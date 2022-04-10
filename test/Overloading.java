package test;

class Main {
	
	public void add(int x, int y) {
		int sum=x+y;
		System.out.println("Sum of Itegers "+sum);
	}
	
	public void add(float x, float y,float z) {
		float sum=x+y+z;
		System.out.println("Sum of float numbers "+sum);
	}


}
public class Overloading{
	public static void main(String[] args) {
		Main obj = new Main();
		obj.add(5,5);
		obj.add(5.5f,5.5f,5.5f);
	}
}