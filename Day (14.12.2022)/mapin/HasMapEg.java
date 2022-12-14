//Example of Hash Map
package mapin;

import java.util.HashMap;
import java.util.Map;

public class HasMapEg { // class

	public static void main(String[] args) { // main method
		HashMap<Integer, String> map = new HashMap<Integer, String>();
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
		map.remove(103); // remove() method
		System.out.println(map);
	}
}
