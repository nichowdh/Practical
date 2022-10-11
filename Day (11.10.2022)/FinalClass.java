package com;

//final class--> can't extends the final class
final class FinalClass {

}

class Test extends FinalClass { // can't extends/inherit final class
	void show() {
		System.out.println("nothing");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}
}
