package exception;

//example of throw unheck exeption ...runtime
public class ThrowUnchecked {
	public static void eligible(int age) {
		if (age < 18) { // throw rithmetic exception if person age is <18
			throw new ArithmeticException("u are not eligible");
		} else {
			System.out.println("peron eligible for vote");
		}
	}

	public static void main(String[] args) {
		eligible(12);
		System.out.println("Done");
	}
}
