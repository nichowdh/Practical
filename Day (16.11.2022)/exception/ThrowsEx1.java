package exception;

//example of throws exception
import java.io.IOException;

public class ThrowsEx1 {
	void show() throws IOException {
		throw new IOException("Throw Exception");
	}

	void display() throws IOException {
		show();
	}

	void fetch() {
		try {
			display();
		} catch (Exception e) {
			System.out.println("Exception Solved");
		}
	}

	public static void main(String[] args) { // throws IOException
		ThrowsEx1 ob = new ThrowsEx1();
		ob.fetch();
// if we call a method that declares an exception, there we muct declare exception on main method		
//		ob.display();
//		ob.show();
		System.out.println("The End");

	}

}
