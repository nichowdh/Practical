package exception;

//custom exception
class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException {
	public void checkAge(int age) throws InvalidAgeException {
		if (age <= 18 || age >= 25) {
			throw new InvalidAgeException("invalid age");
		} else {
			System.out.println("proper age for enrolling");
		}

	}

	public static void main(String[] args) throws InvalidAgeException {
		CustomException ob = new CustomException();
		ob.checkAge(17);
	}

}
