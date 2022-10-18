// Exapmle of interface 
interface Test { // interface
	void show(); // method of interface
}

class Demo1 implements Test { // 1st child class
	public void show() { // method of calss
		System.out.println("Hello my future employee");
	}
}

class Demo implements Test { // 2nd child class
	public void show() { // method of calss
		System.out.println("Welcome to the company");
	}

	public static void main(String[] args) { // main method
		Test obj = new Demo(); // creating the object
		obj.show(); // calling the method
	}
}
