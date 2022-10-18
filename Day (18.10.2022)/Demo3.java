//static method using interface
interface Multiple { // interface 1
	static int add(int a) { // static method
		return a + a;
	}

	void display(); // 1st method

	// default void show() { // 2nd method
	// System.out.println("Default method");
	// }
}

class Demo4 implements Multiple { // child class
	public void display() { // method overriding
		System.out.println("hi");
	}
}

class Demo3 { // main class
	public static void main(String[] args) { // main method
		Multiple obj = new Demo4(); // creating object
		obj.display();
		System.out.println(Multiple.add(5)); // printing using classname.add method
	}
}