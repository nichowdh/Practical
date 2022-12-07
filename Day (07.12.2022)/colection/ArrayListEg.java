package colection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();

		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Rose");
		// we can add specified in any index
		a1.add(0, "Lily");
		a1.add(2, "Daisy");
		a1.add("MariGold");
		a1.add(6, "Tulip");
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add(5, "Lavander");
		a1.add("Niladri");
		// add element ata the end of list.
		System.out.println(a1);
		// define the no. of elements using size()
		System.err.println("size of arraylist: " + a1.size());
		// specific element of given index using get()
		System.out.println("element of insext value is: " + a1.get(6));
		// remove any elements from list usinf remove()
		a1.remove(6);
		System.out.println(a1);
		System.err.println("size of array list: " + a1.size());
	}

}
