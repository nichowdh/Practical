//Example of Linked hash map
package mapin;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {// class

	public static void main(String[] args) { // main method
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		// keys & values adding using put() method
		map.put(101, "Mango");
		map.put(108, "Orange");
		map.put(105, "Banana");
		map.put(103, "Grapes");
		map.put(105, "Chiku");
		map.put(null, null);
		map.put(102, null);
		map.put(null, "Apple");
		for (Map.Entry m : map.entrySet()) { // for each loop
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("------------------------------");
		// putIfAbsent() method
		map.putIfAbsent(102, "CusterdApple");
		map.putIfAbsent(101, "WaterMellon");
		for (Map.Entry m : map.entrySet()) { // for each loop
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// key
		System.out.println("Keys: " + map.keySet());
		// value
		System.out.println("Values: " + map.values());
		// key-value
		System.out.println("keys & values: " + map.entrySet());
		map.remove(103); // remove() method
		System.out.println("After removal");
		for (Map.Entry m : map.entrySet()) { // for each loop
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
