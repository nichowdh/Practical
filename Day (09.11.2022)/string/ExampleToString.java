package string;

//Represent any object to String,we can return value of object instead of hashcode
public class ExampleToString { // class
	int roll_no;
	String name, add;

	ExampleToString(int r, String n, String a) { // constructor
		this.roll_no = r;
		this.name = n;
		this.add = a;
	}

	public String toString() { // return object into string
		return roll_no + " " + name + " " + add;
	}

	public static void main(String[] args) { // main method
		ExampleToString s1 = new ExampleToString(10, "Niladri", "Chinsurah");
		ExampleToString s2 = new ExampleToString(20, "Abhishek", "WestBengal");
		System.out.println(s1);
		System.out.println(s2);
	}
}
