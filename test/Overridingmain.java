package test;

public class Overridingmain extends  Overriding{
	@Override
	String getName(){
		return "Naveen";
	}
	public static void main(String[] args) {
		
		Overriding o=new Overridingmain();
		System.out.println(o.getName());
	}
}
