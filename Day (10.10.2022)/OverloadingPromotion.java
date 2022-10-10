package com;

public class OverloadingPromotion { // class
	void add(int a, int b) { // method 1
		System.out.println(a + b);
	}

	void add(long a, long b, long c) { // method 2
		System.out.println(a + b + c);
	}

	void add(int a, long b) { // method 3
		System.out.println(a + b); // 2nd int will be promoted to long
	}

	public static void main(String[] args) {
		OverloadingPromotion obj = new OverloadingPromotion();
		obj.add(4, 5);
		obj.add(10, 20, 30);
		obj.add(5, 6);

	}

}

// byte->int-> short->long->float->double
//char-> int->float->double->long
