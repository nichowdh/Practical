package exception;

//different types of exception
public class ExceptionEg {
	public void show() {
		String a = "i am error";
		System.out.println(a);
		try {
			int i = 50 / 5; // Arithmetic exception
			System.out.println(i);
			String s = "Riya";
			System.out.println(s.length());
			int arr[] = new int[3]; // new array
			arr[4] = 24; // Array index out of bound
			int m = Integer.parseInt(s); // number format exception
			System.out.println(m);
		} catch (Exception e) {
			System.out.println(e);
		}
		String b = "i cannot be handele";
		System.out.println(a + " " + b); // i am error + i cannot handle
	}

	public static void main(String[] args) {
		ExceptionEg ep = new ExceptionEg();
		ep.show();
	}

}
