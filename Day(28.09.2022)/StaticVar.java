package com;

public class StaticVar { // class 1
	int rollno;
	String name;
	float fee;
	static String college = "AOT";

	// constructor
	StaticVar(int r, String n, float f) {
		this.rollno = r;
		this.name = n;
		this.fee = f;

	}

	// method
	void display() {
		System.out.println(rollno + " " + name + " " + fee + " " + college);
	}

	public class StaticVar1 { // class 2
		public static void main(String[] args) {
			// creating object
			StaticVar s1 = new StaticVar(01, "Niladri", 500);
			StaticVar s2 = new StaticVar(02, "Chodhury", 600);
			s1.display();
			s2.display();
		}
	}

}
