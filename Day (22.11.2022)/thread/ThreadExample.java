package thread;

public class ThreadExample extends Thread { // class ThreadExample inherit the object of Thread
	public void run() { // run method
		System.out.println("I am Thread ... thread is running"); // printing part
	}

	public static void main(String[] args) { // main method
		ThreadExample t = new ThreadExample();// creating object of main class
		t.start(); // pre defined method to call the run() method
		t.setName("Niladri"); // seting the name
		String s = t.getName(); // getting the name
		System.out.println(s); // printing the name
	}

}
