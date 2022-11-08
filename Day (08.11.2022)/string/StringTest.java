package string;

public class StringTest {
	String x = "Hello";

	public void show() { // Method
		/*
		 * Scanner s = new Scanner(System.in); // user input
		 * System.out.println("Enter String: ");// 1st line String A = s.next();// 1st
		 * srting String B = s.next();// 2nd string
		 * 
		 * System.out.println(A.length() + B.length());// 1st string+(concat)2nd string
		 * System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		 * System.out.println(A.substring(0, 4).toUpperCase() + A.substring(2) + " " +
		 * B.substring(0, 3).toLowerCase() + B.substring(1));// substring(),upper
		 * case,lowercase Java
		 */
		System.out.println("Sub-String is: " + x.substring(0, 3));
		System.out.println("Sub-String is: " + x.substring(2));
	}

	public static void main(String[] args) { // main method
		StringTest t = new StringTest();// creating object
		t.show();// calling the method
	}

}
