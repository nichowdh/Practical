package thread;

//Runnable interdace Example
public class RunnableInterface implements Runnable { // calss implementing the Runnable Interface
	public void run() { // 1st method
		System.out.println("i am thread... thread is running");
	}

	public static void main(String[] args) { // main method
		RunnableInterface ri = new RunnableInterface(); // creating an object of the interface
		Thread t = new Thread(ri); // passing the object of interface through Thread object
		t.start();// calling the 1st method
	}
}
