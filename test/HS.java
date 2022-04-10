package test;

import java.util.HashSet;

public class HS {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println("checking wether car contain Mazda :  " + cars.contains("Mazda"));
		System.out.println("Remoing volvo car" + cars.remove("Volvo"));
		System.out.println(cars);
		System.out.println("size of HashSet" + cars.size());
		for (String i : cars) {
			System.out.println(i);
		}


	}

}
