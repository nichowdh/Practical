package colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>(); // creating a array list
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("MariGold");
		a1.add("Tulip");
		a1.add("Jasmine");
//converting list to array
		System.out.println("List to array");
		String[] arr = a1.toArray(new String[a1.size()]);
		for (String s : arr) {
			System.out.println(s);
		}
		// array to list
		System.out.println("array to list");
		List<String> all = new ArrayList<String>();
		all = Arrays.asList(arr);
		System.out.println(all);

	}

}
