package com;

//dynamic binding 
class TestBinding {
	void show() { // method 1
		System.out.println("ab samjhe?");
	}
}

class DynamicBinding extends TestBinding {
	void show() { // 2nd method override
		System.out.println("override");
	}

	public static void main(String[] args) {
		TestBinding obj = new DynamicBinding();
		obj.show();
	}

}
