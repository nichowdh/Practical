package com;

// with/without This key word
public class ThisKeyWord { // class 1
	int rollno;
	String name;
	float fee;

	// parameterised constructor
	ThisKeyWord(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;

	}

	// method
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		// creating object
		ThisKeyWord s1 = new ThisKeyWord(10, "Niladri", 500);
		ThisKeyWord s2 = new ThisKeyWord(20, "Chodhury", 1000);
		s1.display();
		s2.display();
	}

}
