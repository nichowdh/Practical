// multiple inheritance in interface
interface Multiple_in { // 1st parent interface
	abstract void show(); // 1st parent method
}

interface Multiple_in1 { // 2nd parent interface
	void display();// 1st parent method
	// void show()
}

class Demo2 implements Multiple_in, Multiple_in1 { // child class
	public void show() {// 1st override method
		System.out.println("hi");
	}

	public void display() { // 2nd override method
		System.out.println("hello");
	}

	public static void main(String[] args) { // main class
		Demo2 obj = new Demo2(); // object creation
		obj.show();
		obj.display();
	}
}
