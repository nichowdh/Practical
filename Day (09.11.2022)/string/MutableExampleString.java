package string;

// append(), insert(), replace(), delete(), reverse() --mutable calss (String builder & buffer)
public class MutableExampleString { // calss
	public static void my() { // method1
		// string buffer
		StringBuffer s = new StringBuffer("Hello"); // object of String bufferclass
		s.append("World");
		System.out.println("String is: " + s); // Hello World
		s.insert(2, "Nila");// int off set,string s
		System.out.println("Insert is: " + s);// HeNilalloWorld
		s.replace(1, 3, "Java");// (begienwith, endswith, string s)
		System.out.println("Replace is: " + s);
		System.out.println("Capacity is: " + s.capacity());
		// String builder
		StringBuilder s1 = new StringBuilder("World"); // s1=world creating string builder object
		s1.replace(1, 2, "Java");
		System.out.println("Replaceis: " + s1); // wjavald
		s1.delete(1, 3);
		System.out.println("Delete is: " + s1); // wvald
		s1.reverse();
		System.out.println("Reverse is: " + s1);// dlavw
	}

	public static void main(String[] args) { // main method
		my();
	}

}
