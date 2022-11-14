package exception;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int num = 25 / 0; // may exception occure
			System.out.println("Result"); // if exception not occure this line will execute
		}
//			catch (Exception e) {
//			System.out.println(e);
//		}
		catch (ArithmeticException r) {
			System.out.println("Will not devide by zero");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(25 / 5);
		}
		System.out.println("The End"); // line will execute because outside try catch block
	}

}
