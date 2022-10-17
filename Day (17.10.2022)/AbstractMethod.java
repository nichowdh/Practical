abstract class Test { // abstract class-- parent class
	abstract void display(); // abstract method

	void show() { // non-abstract method
		System.out.println("Non-Abstract method invokes");
	}
}

class Test1 extends Test { // 1st child class
	void display() {// non abstract method with same name
		System.out.println("Test1 method invoke");
	}
}

class Test2 extends Test { // 2nd child class
	void display() {
		System.out.println("Test2 method invoke");
	}
}

public class AbstractMethod { // main class
	public static void main(String[] args) { // main method
		// creating objects
		Test obj = new Test1();
		Test obj1 = new Test2();
		obj.display();
		obj1.display();
		obj.show();
	}

}
