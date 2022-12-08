package colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUsingIteratorEg {

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

		System.out.println("Traversing using for loop");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("traversing using wach loop");
		for (String a : a1) {
			System.out.println(a);
		}
		System.out.println("traversing using iterator"); // forward
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing using for iterator-forword");
		ListIterator<String> itr1 = a1.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("traversing using for iterator-backword");
		ListIterator<String> itr2 = a1.listIterator(a1.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("Traversing using for -each() method");
		a1.forEach(a -> System.out.println(a));

	}

}
