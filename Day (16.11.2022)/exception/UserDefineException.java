package exception;

//under the throwable class user defined exception using throw ky word
class UserDefinedException1 extends Exception {
	public UserDefinedException1(String str) {
		super(str); // call constructor of parent exception
	}

}

public class UserDefineException {
	public static void main(String[] args) {
		try {
			throw new UserDefinedException1("User defined exception");
		} catch (UserDefinedException1 u) {
			System.out.println("Exception is find");
			System.out.println(u.getMessage());
		}
	}
}
