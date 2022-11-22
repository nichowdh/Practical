package thread;

//Thread (Runnable obj, String)
public class RunnableInterfaceEg2 implements Runnable {// calss implements the Runnable interface
	public void run() { // method 1
		System.out.println("Thread Running"); // printing
	}

	public static void main(String[] args) { // main method
		Runnable ri = new RunnableInterfaceEg2(); // creating object of Runnable
		Thread t = new Thread(ri, "String Name"); // passing value
		t.start(); // invoking 1st method
		String s = t.getName(); // get name of method 1
		System.out.println(s);// printing the s
	}

}
