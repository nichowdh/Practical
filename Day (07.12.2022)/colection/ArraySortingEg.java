package colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortingEg {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("MariGold");
		a1.add("Tulip");
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add("Lavander");
		System.out.println("String sorted list: ");
		Collections.sort(a1);
		for (String a : a1) {
			System.out.println(a);
		}
		List<Integer> a11 = new ArrayList<Integer>();
		a11.add(10);
		a11.add(20);
		a11.add(30);
		a11.add(40);
		a11.add(50);
		a11.add(60);
		a11.add(70);
		a11.add(80);
		a11.add(90);
		System.out.println("Integer sorted list: ");
		Collections.sort(a11); // sort() method
		for (int b : a11) {
			System.out.println(b);
		}
		Collections.reverse(a11); // reverse() method
		System.out.println(a11);

	}

}
