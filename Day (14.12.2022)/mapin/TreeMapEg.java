//Example of Tree map
package mapin;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// keys & values adding using put() method
		map.put(101, "Mango");
		map.put(108, "Orange");
		map.put(105, "Banana");
		map.put(103, "Grapes");
		map.put(105, "Chiku");

		// it will not allow the Null key/values

//		map.put(null, null);
//		map.put(102, null);
//		map.put(null, "Apple");

		for (Map.Entry m : map.entrySet()) { // for each loop
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// putIfAbsent() method
		map.putIfAbsent(102, "CusterdApple");
		map.putIfAbsent(101, "WaterMellon");
		System.out.println("-------------------------------");
		for (Map.Entry m : map.entrySet()) { // for each loop
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(103); // remove() method
		System.out.println("-----------------------------");
		System.out.println("Afer Removal");
		for (Map.Entry m : map.entrySet()) { // for each loop
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
