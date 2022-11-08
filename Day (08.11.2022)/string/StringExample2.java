package string;

//char[] work as java String
public class StringExample2 {
	public void show() { // Method 1
		char[] arr = { 'j', 'a', 'v', 'a' }; // character
		String s = new String(arr);
		System.out.println(arr);
	}

//Method 2
	public void myFunction() {
		String m1 = "Niladri";
		String m2 = new String(m1);
		System.out.println(m2);
	}

	public static void main(String[] args) {
		StringExample2 str = new StringExample2();
		str.show();
		str.myFunction();
	}

}
