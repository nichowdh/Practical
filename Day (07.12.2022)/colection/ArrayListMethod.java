package colection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>(); // creating a array list
		a1.add("Ram");
		a1.add("Sam");
		a1.add("Rose");
		a1.add("Liza");
		a1.add("Devid");
		a1.add("Maria");
		String element = a1.get(2);// get method
		System.out.println("get index of: " + element);
		System.out.println("arraylist is: " + a1.isEmpty());// isEmpty method
		String element1 = a1.remove(4);// remove method
		System.out.println("Remove index: " + element1);
		System.out.println("traversing using for loop");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}

}
