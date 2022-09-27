package com;

public class Parameterisedcon {
	int age;
	String name;

//Parameterised constructor where we have  to pass the parameter
	Parameterisedcon(int a, String n) {
		age = a;
		name = n;
	}

	void show() {
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		Parameterisedcon d = new Parameterisedcon(20, "niladri");
		d.show();
		Parameterisedcon d1 = new Parameterisedcon(30, "Chowdhury");
		d1.show();
	}
}
