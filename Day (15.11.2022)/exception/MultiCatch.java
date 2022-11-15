package exception;

//only 1 exception will execute (multiple catch)
public class MultiCatch {
	static void mFunc() {
		try {
			int i = 50 / 0; // Arithmetic exception
			System.out.println(i);
			int arr[] = new int[3]; // array index out of bound
			arr[4] = 24;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		} finally {
			System.out.println("i am finally block");
		}
	}

	public static void main(String[] args) {
		mFunc();
	}

}
