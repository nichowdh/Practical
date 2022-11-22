package thread;

//example of sleep,join, start method of thread
public class ThreadExample2 extends Thread { // main class
	public void run() { // 1st method
		for (int i = 0; i < 5; i++) { // for loop
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// object creation
		ThreadExample2 t = new ThreadExample2();
		ThreadExample2 t1 = new ThreadExample2();
		ThreadExample2 t2 = new ThreadExample2();
//		t.run();
//		t.run();
//		t.run();

		// using start() & join() method
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
	}

}
