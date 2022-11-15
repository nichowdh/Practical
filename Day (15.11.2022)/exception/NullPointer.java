package exception;

public class NullPointer {
	String str = null; // String value null
	int arr[] = null;// array object null

	String convert(String s) {
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		NullPointer obj = new NullPointer();
		System.out.println(obj.convert(null));
		System.out.println(obj.arr.length);
		System.out.println(obj.str.equals("Niladri"));
	}

}
