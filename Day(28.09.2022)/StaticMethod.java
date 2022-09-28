package com;

public class StaticMethod {
	// class 1
	int rollno;
	String name;
	float fee;
	static String college = "AOT";

	// static mrthod to change the static variable

	static void change() {
		college = "TPI";
	}

	// constructor
	StaticMethod(int r, String n, float f) {
		this.rollno = r;
		this.name = n;
		this.fee = f;

	}

	// method
	void display() {
		System.out.println(rollno + " " + name + " " + fee + " " + college);
	}

	public class StaticMethod1 { // class 2
		public static void main(String[] args) {
			// caling static method with class name

			StaticMethod.change();

			// creating object
			StaticMethod s1 = new StaticMethod(01, "Niladri", 500);
			StaticMethod s2 = new StaticMethod(02, "Chodhury", 600);
			s1.display();
			s2.display();
		}
	}

}
