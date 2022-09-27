package com;

//display default value
//display default constructor
public class Defaultcon {

	int age;
	String name;

	void show() {// method to display age & name
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		Defaultcon d = new Defaultcon();// 1st object for name & age
		Defaultcon d1 = new Defaultcon();// 2nd object for name & age
		d.show();
		d1.show();

		/*
		 * Defaultcon() { System.out.println("Default contructor is created"); }
		 * 
		 * public static void main(String arge[]) { Defaultcon d = new Defaultcon();//
		 * object creation
		 */
	}
}
