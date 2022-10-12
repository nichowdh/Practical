package com;

//example of up-casting
class Bank {
	float rateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float rateOfInterest() {
		return 2.3f;
	}
}

class ICICI extends Bank {
	float rateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends Bank {
	float rateOfInterest() {
		return 5.4f;
	}
}

public class RunTimePoly1 {
	public static void main(String[] args) {
		Bank obj; // upcasting
		obj = new SBI();
		System.out.println("SBI Rate of interest: " + obj.rateOfInterest());
		obj = new ICICI();
		System.out.println("ICICI Rate of interest: " + obj.rateOfInterest());
		obj = new AXIS();
		System.out.println("AXIS Rate of interest: " + obj.rateOfInterest());

	}

}
