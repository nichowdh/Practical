package thread;

//direcrly we can use thread class without extending the Thread class
public class ThreadEg2 {
	public static void main(String[] args) { // main method
		Thread t = new Thread("Niladri"); // passing the value inside thread class
		t.start();// invoking the method
		String s = t.getName(); // storing the data of Thread class in S
		System.out.println(s); // printing the name
	}

}
