package test;

import java.util.ArrayList;
import java.util.Collections;

public class AL {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// add elements
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		// get elements

		int element = list.get(0);

		System.out.println(element);

		// add element in b/w position
		list.add(1, 5);
		System.out.println(list);

		// Set element
		list.set(0, 6);
		System.out.println(list);

		// delete element
		list.remove(3);
		System.out.println(list);

		int size = list.size();
		System.out.println(size);

		// loops
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		// sorting
		Collections.sort(list);
		System.out.println(list);


	}
}
