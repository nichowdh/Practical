package sync;

class MyThreadClass {
	// void print(int num) { // without Synchronization
	synchronized void print(int num) { // with Synchronization
		for (int i = 1; i < 5; i++) {
			System.out.println(num * i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread1 extends Thread {
	MyThreadClass ws;

	Thread1(MyThreadClass ws) {
		this.ws = ws;
	}

	public void run() {
		ws.print(5); // 5*1 5*2 5*3 5*4 5*5
	}
}

class Thread2 extends Thread {
	MyThreadClass ws;

	Thread2(MyThreadClass ws) {
		this.ws = ws;
	}

	public void run() {
		ws.print(50); // 50*1 50*2 50*3....
	}
}

public class WithOutSynchronization {
	public static void main(String[] args) {
		MyThreadClass obj = new MyThreadClass();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
