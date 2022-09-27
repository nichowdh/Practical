package com;

public class Copycon {
	// variable along with deta type
	int age;
	String name;

//constructor & initialize
	Copycon(int a, String n) {
		age = a;
		name = n;
	}

	// constructor to initialize another object

	Copycon(Copycon c) {
		age = c.age;
		name = c.name;
	}

	// Copycon() {}

//method
	void show() {
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		Copycon c1 = new Copycon(20, "niladri");
		Copycon c2 = new Copycon(c1);
		// Copycon c3 = new Copycon();
		// c3.age = c1.age;
		// c3.name = c1.name;
		c1.show();
		c2.show();
		// c3.show();
	}

}
