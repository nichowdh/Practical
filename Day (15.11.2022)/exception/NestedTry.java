package exception;

// nested try block
public class NestedTry {
	public static void main(String[] args) {
		try { // outer try block
			try {// inner try block1
				System.out.println("Going to devide by 0");
				int b = 19 / 0;
			} catch (ArithmeticException e) { // catch block of inner try block 1
				System.out.println(e);
			}
			try { // inner try block 2
				int a[] = new int[5];
				a[6] = 4; // assigning the value of out of bound
			} catch (ArrayIndexOutOfBoundsException e) { // catch block of inner try block
				System.out.println(e);
			}
			System.out.println("other Statement");
		} catch (Exception e) { // catch block outer try block
			System.out.println("handled the exception (outer catch)");
		}
		System.out.println("Normal Flow");
	}

}
