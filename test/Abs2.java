package test;

public class Abs2 extends Abstraction {

	@Override
	public void animalSleep() {
		System.out.println("Animal sleeping ");
		
	}
	@Override
	public  String  animalSound() {
		 System.out.println("Animal Sound from child");
		return "Animal Sound from child";
	}

	public static void main(String[] args) {
		//Abs2 a = new Abs2();
		Abstraction a1= new Abs2();
		a1.animalSound();
		
		
	}
}
